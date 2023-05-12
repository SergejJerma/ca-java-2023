package level1.lesson20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItraukimasSarasan {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 600);

        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> sarasas = new JList<>(model);

        JLabel labelVardas = new JLabel("Vardas");
        JTextField vardas = new JTextField(20);
        JLabel labelPavarde = new JLabel("Pavarde");
        JTextField pavarde = new JTextField(20);
        JButton itrauktiMygtukas = new JButton("Itraukti i sarasa");
        JButton isvalymoMygtukas = new JButton("Isvalyti sarasa");

        itrauktiMygtukas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ivestasVardas = vardas.getText();
                String ivestaPavarde = pavarde.getText();
                model.addElement(ivestasVardas + " " + ivestaPavarde);
                vardas.setText(null);
                pavarde.setText(null);
            }
        });

        isvalymoMygtukas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.clear();
            }
        });

        JPanel panelVirsus = new JPanel();
        panelVirsus.setPreferredSize(new Dimension(300, 100));
        JPanel panelCentras = new JPanel();
        panelVirsus.add(labelVardas);
        panelVirsus.add(vardas);
        panelVirsus.add(labelPavarde);
        panelVirsus.add(pavarde);
        panelVirsus.add(itrauktiMygtukas);
        panelVirsus.add(isvalymoMygtukas);
        panelCentras.add(sarasas);

        frame.getContentPane().add(BorderLayout.NORTH, panelVirsus);
        frame.getContentPane().add(BorderLayout.CENTER, panelCentras);

        frame.setVisible(true);

    }
}
