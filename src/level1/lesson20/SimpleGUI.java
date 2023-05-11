package level1.lesson20;

import javax.swing.*;
import java.awt.*;

public class SimpleGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My First GUI"); // remelio objektas
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);    // remelio dydis pikseliais

        JPanel apatinisPanel = new JPanel(); // sukuriame panel
        apatinisPanel.setBackground(Color.GRAY); // suteikiame panel spalva

        // idedame panel i remeli
        frame.getContentPane().add(BorderLayout.SOUTH, apatinisPanel);

        JPanel virsutinisPanel = new JPanel();
        virsutinisPanel.setBackground(Color.DARK_GRAY);
        frame.getContentPane().add(BorderLayout.NORTH, virsutinisPanel);

        JPanel kairysisPanel = new JPanel();
        kairysisPanel.setBackground(Color.BLUE);
        frame.getContentPane().add(BorderLayout.WEST, kairysisPanel);

        JPanel desinysisPanel = new JPanel();
        desinysisPanel.setBackground(Color.CYAN);
        frame.getContentPane().add(BorderLayout.EAST, desinysisPanel);

        JPanel centrinisPanel = new JPanel();
        centrinisPanel.setBackground(Color.ORANGE);
        frame.getContentPane().add(BorderLayout.CENTER, centrinisPanel);

//        JButton button1 = new JButton("Mygtukas 1");
//        JButton button2 = new JButton("Mygtukas 2");
//        frame.getContentPane().add(button1);
//        frame.getContentPane().add(button2);

        frame.setVisible(true);

    }

}
