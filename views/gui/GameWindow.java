package views.gui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameWindow {
    public static void createWindow(String title, Integer width, Integer height) {
        JFrame frame = new JFrame(title);
        JLabel label = new JLabel(title);
        frame.getContentPane().add(label);

        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
