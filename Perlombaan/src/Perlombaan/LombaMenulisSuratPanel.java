/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perlombaan;
import javax.swing.*;
import java.awt.event.*;

public class LombaMenulisSuratPanel {
    private JFrame frame;
    private JPanel panel;
    private JTextField namaPesertaField;
    private JTextField asalSekolahField;
    private JTextField strukturSuratField;
    private JTextField isiSuratField;
    private JTextField kreativitasField;
    private JTextField penerapanKaidahBahasaField;
    private JButton submitButton;

    public LombaMenulisSuratPanel() {
        frame = new JFrame("Input Lomba Menulis Surat");
        panel = new JPanel();
        namaPesertaField = new JTextField(10);
        asalSekolahField = new JTextField(10);
        strukturSuratField = new JTextField(10);
        isiSuratField = new JTextField(10);
        kreativitasField = new JTextField(10);
        penerapanKaidahBahasaField = new JTextField(10);
        submitButton = new JButton("Submit");

        panel.add(new JLabel("Nama Peserta:"));
        panel.add(namaPesertaField);
        panel.add(new JLabel("Asal Sekolah:"));
        panel.add(asalSekolahField);
        panel.add(new JLabel("Struktur Surat:"));
        panel.add(strukturSuratField);
        panel.add(new JLabel("Isi Surat:"));
        panel.add(isiSuratField);
        panel.add(new JLabel("Kreativitas:"));
        panel.add(kreativitasField);
        panel.add(new JLabel("Penerapan Kaidah Bahasa:"));
        panel.add(penerapanKaidahBahasaField);
        panel.add(submitButton);

        frame.add(panel);
        frame.setSize(600, 450);
        frame.setVisible(false);
        frame.setLocationRelativeTo(null);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String namaPeserta = namaPesertaField.getText();
                    String asalSekolah = asalSekolahField.getText();
                    double strukturSurat = Double.parseDouble(strukturSuratField.getText());
                    double isiSurat = Double.parseDouble(isiSuratField.getText());
                    double kreativitas = Double.parseDouble(kreativitasField.getText());
                    double penerapanKaidahBahasa = Double.parseDouble(penerapanKaidahBahasaField.getText());

                    LombaMenulisSurat pesertaMenulisSurat = new LombaMenulisSurat(namaPeserta, asalSekolah, strukturSurat, isiSurat, kreativitas, penerapanKaidahBahasa);
                    JOptionPane.showMessageDialog(frame, "Nilai akhir: " + pesertaMenulisSurat.nilaiAkhir);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Input harus berupa angka.");
                }
            }
        });
    }

    public void showPanel() {
        frame.setVisible(true);
    }

    private static class LombaMenulisSurat {

        private String nilaiAkhir;

        public LombaMenulisSurat() {
        }

        private LombaMenulisSurat(String namaPeserta, String asalSekolah, double strukturSurat, double iSurat, double kreativitas, double penerapanKaidahBahasa) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}