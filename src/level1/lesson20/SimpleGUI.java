package level1.lesson20;

import javax.swing.*;
import java.awt.*;

public class SimpleGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My First GUI"); // remelio objektas
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);    // remelio dydis pikseliais

        JPanel bottomPanel = configurePanel(Color.GRAY, frame, BorderLayout.SOUTH);
        JPanel centerPanel = configurePanel(Color.ORANGE, frame, BorderLayout.CENTER);

        configurePanel(Color.DARK_GRAY, frame, BorderLayout.NORTH);
        configurePanel(Color.BLUE, frame, BorderLayout.WEST);
        configurePanel(Color.CYAN, frame, BorderLayout.EAST);

        configureCenterPanel(centerPanel);
        configureBottomPanel(bottomPanel);

        frame.setVisible(true);

    }

    private static void configureBottomPanel(JPanel bottomPanel) {
        bottomPanel.setLayout(new FlowLayout());
        JButton button1 = new JButton("Mygtukas 1");
        JButton button2 = new JButton("Mygtukas 2");
        bottomPanel.add(button1);
        bottomPanel.add(button2);
    }

    private static void configureCenterPanel(JPanel centerPanel) {
        centerPanel.setLayout(new GridLayout(0, 1));

        JCheckBox checkBox1 = new JCheckBox("pirmas pasirinkimas");
        JCheckBox checkBox2 = new JCheckBox("antras pasirinkimas");
        JCheckBox checkBox3 = new JCheckBox("trecias pasirinkimas");

        centerPanel.add(checkBox1);
        centerPanel.add(checkBox2);
        centerPanel.add(checkBox3);
    }

    private static JPanel configurePanel(Color color, JFrame frame, String panelPlace) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        frame.getContentPane().add(panelPlace, panel);
        return panel;
    }

}
