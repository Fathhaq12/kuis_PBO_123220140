/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perlombaan;

import javax.swing.*;
import java.awt.event.*;

public class Main {
    private JFrame frame;
    private JPanel panel;
    private JComboBox<String> comboBox;
    private JButton submitButton;
    private LombaAnimasiPanel lombaAnimasiPanel;
    private LombaMenulisSuratPanel lombaMenulisSuratPanel;

    public Main () {
        frame = new JFrame("APLIKASI PENILAIAN LOMBA");
        panel = new JPanel();
        comboBox = new JComboBox<>(new String[]{"Lomba Animasi", "Lomba Menulis Surat", "Keluar"});
        submitButton = new JButton("Submit");

        panel.add(new JLabel("Pilih kategori lomba:"));
        panel.add(comboBox);
        panel.add(submitButton);

        frame.add(panel);
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        lombaAnimasiPanel = new LombaAnimasiPanel();
        lombaMenulisSuratPanel = new LombaMenulisSuratPanel();

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedOption = comboBox.getSelectedIndex();
                switch (selectedOption) {
                    case 0:
                        lombaAnimasiPanel.showPanel();
                        break;
                    case 1:
                        lombaMenulisSuratPanel.showPanel();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(frame, "Terima kasih telah menggunakan aplikasi.");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(frame, "Pilihan tidak valid. Silakan pilih kembali.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main () ;
            }
        });
    }
}