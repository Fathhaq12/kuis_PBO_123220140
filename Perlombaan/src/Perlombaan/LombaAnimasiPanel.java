/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perlombaan;
import javax.swing.*;
import java.awt.event.*;

public class LombaAnimasiPanel {
    private JFrame frame;
    private JPanel panel;
    private JTextField namaTimField;
    private JTextField asalSekolahField;
    private JTextField alurCeritaField;
    private JTextField kontenField;
    private JTextField kreativitasField;
    private JTextField sinematografiField;
    private JButton submitButton;

    public LombaAnimasiPanel() {
        frame = new JFrame("Input Lomba Animasi");
        panel = new JPanel();
        namaTimField = new JTextField(10);
        asalSekolahField = new JTextField(10);
        alurCeritaField = new JTextField(10);
        kontenField = new JTextField(10);
        kreativitasField = new JTextField(10);
        sinematografiField = new JTextField(10);
        submitButton = new JButton("Submit");

        panel.add(new JLabel("Nama Tim:"));
        panel.add(namaTimField);
        panel.add(new JLabel("Asal Sekolah:"));
        panel.add(asalSekolahField);
        panel.add(new JLabel("Alur Cerita:"));
        panel.add(alurCeritaField);
        panel.add(new JLabel("Konten:"));
        panel.add(kontenField);
        panel.add(new JLabel("Kreativitas:"));
        panel.add(kreativitasField);
        panel.add(new JLabel("Sinematografi:"));
        panel.add(sinematografiField);
        panel.add(submitButton);

        frame.add(panel);
        frame.setSize(300, 250);
        frame.setVisible(false);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String namaTim = namaTimField.getText();
                    String asalSekolah = asalSekolahField.getText();
                    double alurCerita = Double.parseDouble(alurCeritaField.getText());
                    double konten = Double.parseDouble(kontenField.getText());
                    double kreativitas = Double.parseDouble(kreativitasField.getText());
                    double sinematografi = Double.parseDouble(sinematografiField.getText());

                    LombaAnimasi pesertaAnimasi = new LombaAnimasi(namaTim, asalSekolah, alurCerita, konten, kreativitas, sinematografi);
                    JOptionPane.showMessageDialog(frame, "Nilai akhir: " + pesertaAnimasi.nilaiAkhir);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Input harus berupa angka.");
                }
            }
        });
    }

    public void showPanel() {
        frame.setVisible(true);
    }

    private static class LombaAnimasi {

        private String nilaiAkhir;

        public LombaAnimasi() {
        }

        private LombaAnimasi(String namaTim, String asalSekolah, double alurCerita, double konten, double kreativitas, double sinematografi) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}