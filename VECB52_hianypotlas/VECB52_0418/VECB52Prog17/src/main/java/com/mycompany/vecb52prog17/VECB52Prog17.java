package com.mycompany.vecb52prog17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VECB52Prog17 extends JFrame {

    private JPanel panel;
    private JButton button;
    private int clickCount = 0;

    VECB52Prog17() {
        setTitle("Rajzolás gombra kattintva");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (clickCount >= 1) {
                    g.setColor(Color.RED);
                    for (int i = 0; i < getWidth() - 50; i += 10) {
                        g.drawLine(-10, -10, i, 300);
                    }
                }
                if (clickCount >= 2) {
                    g.setColor(Color.BLUE);
                    for (int i = 0; i < getWidth() - 50; i += 10) {
                        g.drawLine(410 + 10, -10, i, 300);
                    }
                }
            }
        };
        add(panel, BorderLayout.CENTER);

        button = new JButton("Rajzolás");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                panel.repaint();
            }
        });
        add(button, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VECB52Prog17 frame = new VECB52Prog17();
            frame.setVisible(true);
        });
    }
}
