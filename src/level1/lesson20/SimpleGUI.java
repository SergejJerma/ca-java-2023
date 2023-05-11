package level1.lesson20;

import javax.swing.*;

public class SimpleGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My First GUI"); // remelio objektas
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);    // remelio dydis pikseliais


        JButton button1 = new JButton("Mygtukas 1");
        JButton button2 = new JButton("Mygtukas 2");
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);

        frame.setVisible(true);

    }

}
