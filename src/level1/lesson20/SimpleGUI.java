package level1.lesson20;

import javax.swing.*;

public class SimpleGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My First GUI"); // remelio objektas
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);    // remelio dydis pikseliais


        JButton button = new JButton("Press"); // mygtuko objektas
        frame.getContentPane().add(button); // i remeli idedamas mygtukas

        frame.setVisible(true);

    }

}
