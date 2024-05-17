package hu.the.vecb52.vecb52prog17;

import javax.swing.*;
import java.awt.*;

public class VECB52Prog17 extends JFrame {
    private JPanel panel;

    public VECB52Prog17() {
        super("Rajzolás Gombra Kattintva");
        panel = new JPanel() {
            
        };
        getContentPane().add(panel);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VECB52Prog17 frame = new VECB52Prog17();
            frame.setVisible(true);
        });
    }
}
