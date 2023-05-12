package level1.lesson20.swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SimpleGUI {

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame("My First GUI"); //the main frame object
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit on close (x)
        frame.setSize(600, 600);    //initial frame size in pixels
        //frame.setResizable(false);              //make frame not resizable
        frame.setLocationRelativeTo(null);      //center the jframe on the screen

        JPanel topPanel = configurePanel(Color.DARK_GRAY, frame, BorderLayout.NORTH);
        JPanel bottomPanel = configurePanel(Color.GRAY, frame, BorderLayout.SOUTH);
        JPanel leftPanel = configurePanel(Color.BLUE, frame, BorderLayout.WEST);
        JPanel rightPanel = configurePanel(Color.CYAN, frame, BorderLayout.EAST);
        JPanel centerPanel = configurePanel(Color.ORANGE, frame, BorderLayout.CENTER);

        configureTopPanel(topPanel);
        configureBottomPanel(bottomPanel);
        configureLeftPanel(leftPanel);
        configureRightPanel(rightPanel);
        configureCenterPanel(centerPanel);

        frame.setVisible(true);

        JProgressBar pBar = new JProgressBar();
        ((JPanel)centerPanel.getComponent(0)).add(pBar);
        for (int i = 0; i < 100; i++) {
            Thread.sleep(100);
            pBar.setValue(i);
        }
    }

    private static void configureCenterPanel(JPanel centerPanel) throws InterruptedException {
        centerPanel.setLayout(new GridBagLayout());

        JLabel textLabel = new JLabel("Tekstas");
        JTextField textField = new JTextField(20);

        JLabel passwordLabel = new JLabel("slaptazodis");
        JPasswordField passwordField = new JPasswordField(20);

        Component verticalSpace = Box.createRigidArea(new Dimension(0, 10));

        JPanel textFieldsPanel = new JPanel();
        Border fieldPanelBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        textFieldsPanel.setBorder(fieldPanelBorder);

        textFieldsPanel.setLayout(new BoxLayout(textFieldsPanel, BoxLayout.Y_AXIS));
        textFieldsPanel.add(textLabel);
        textFieldsPanel.add(verticalSpace);
        textFieldsPanel.add(textField);
        textFieldsPanel.add(verticalSpace);
        textFieldsPanel.add(passwordLabel);
        textFieldsPanel.add(verticalSpace);
        textFieldsPanel.add(passwordField);
        textFieldsPanel.add(verticalSpace);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        centerPanel.add(textFieldsPanel, gbc);
    }

    private static void configureTopPanel(JPanel topPanel) {
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        String[] metuLaikai = {"Vasara", "Ruduo", "Žiema", "Pavasaris"};
        JComboBox<String> metuLaikaiComboBox = new JComboBox<>(metuLaikai);
        metuLaikaiComboBox.setSelectedIndex(2);

        topPanel.add(metuLaikaiComboBox);
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
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton button1 = new JButton("Mygtukas 1");
        JButton button2 = new JButton("Mygtukas 2");
        bottomPanel.add(button1);
        bottomPanel.add(button2);
    }

    private static void configureRightPanel(JPanel rightPanel) {
        rightPanel.setLayout(new GridLayout(0, 1));

        JCheckBox checkBox1 = new JCheckBox("pirmas pasirinkimas");
        JCheckBox checkBox2 = new JCheckBox("antras pasirinkimas");
        JCheckBox checkBox3 = new JCheckBox("trecias pasirinkimas");

        rightPanel.add(checkBox1);
        rightPanel.add(checkBox2);
        rightPanel.add(checkBox3);
    }

    private static JPanel configurePanel(Color color, JFrame frame, String panelPlace) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        frame.getContentPane().add(panelPlace, panel);
        return panel;
    }

}
