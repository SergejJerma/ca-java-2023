package level1.lesson20;

import javax.swing.*;
import java.awt.*;

public class SimpleGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My First GUI"); // remelio objektas
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);    // remelio dydis pikseliais

        JPanel apatinisPanel = configurePanel(Color.GRAY, frame, BorderLayout.SOUTH);

        configurePanel(Color.DARK_GRAY, frame, BorderLayout.NORTH);

        configurePanel(Color.BLUE, frame, BorderLayout.WEST);

        configurePanel(Color.CYAN, frame, BorderLayout.EAST);

        configurePanel(Color.ORANGE, frame, BorderLayout.CENTER);

        JButton button1 = new JButton("Mygtukas 1");
        JButton button2 = new JButton("Mygtukas 2");
        apatinisPanel.add(button1);
        apatinisPanel.add(button2);

        frame.setVisible(true);

    }

    private static JPanel configurePanel(Color darkGray, JFrame frame, String north) {
        JPanel virsutinisPanel = new JPanel();
        virsutinisPanel.setBackground(darkGray);
        frame.getContentPane().add(north, virsutinisPanel);
        return virsutinisPanel;
    }

}
