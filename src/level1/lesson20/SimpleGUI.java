package level1.lesson20;

import javax.swing.*;
import java.awt.*;

public class SimpleGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My First GUI"); //the main frame object
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit on close (x)
        frame.setSize(600, 600);    //initial frame size in pixels
        frame.setResizable(false);              //make frame not resizable
        frame.setLocationRelativeTo(null);      //center the jframe on the screen

        JPanel bottomPanel = configurePanel(Color.GRAY, frame, BorderLayout.SOUTH);
        JPanel centerPanel = configurePanel(Color.ORANGE, frame, BorderLayout.CENTER);
        JPanel leftPanel = configurePanel(Color.BLUE, frame, BorderLayout.WEST);

        configurePanel(Color.DARK_GRAY, frame, BorderLayout.NORTH);
        configurePanel(Color.CYAN, frame, BorderLayout.EAST);

        configureCenterPanel(centerPanel);
        configureBottomPanel(bottomPanel);
        configureLeftPanel(leftPanel);

        frame.setVisible(true);

    }

    private static void configureLeftPanel(JPanel leftPanel) {
        leftPanel.setLayout(new GridLayout(0, 1));

        JRadioButton radioButton1 = new JRadioButton("pirmas pasirinkimas");
        JRadioButton radioButton2 = new JRadioButton("antras pasirinkimas");
        JRadioButton radioButton3 = new JRadioButton("trecias pasirinkimas");

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        leftPanel.add(radioButton1);
        leftPanel.add(radioButton2);
        leftPanel.add(radioButton3);
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
