/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vecb52prog18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VECB52Prog18 extends JFrame {
    private Color backgroundColor = Color.WHITE;
    private Color drawColor = Color.BLACK;
    private Point lastPoint;

    VECB52Prog18() {
        setTitle("VECB52Prog18");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(backgroundColor);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = panel.getGraphics();
                g.setColor(drawColor);
                if (lastPoint != null) {
                    g.drawLine(lastPoint.x, lastPoint.y, e.getX(), e.getY());
                }
                lastPoint = new Point(e.getX(), e.getY());
            }
        });

        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                lastPoint = null;
            }
        });

        JButton bgColorButton = new JButton("Háttérszín");
        bgColorButton.addActionListener(e -> {
            Color newColor = JColorChooser.showDialog(null, "Válassz színt", backgroundColor);
            if (newColor != null) {
                backgroundColor = newColor;
                panel.repaint();
            }
        });

        JButton drawColorButton = new JButton("Rajzszín");
        drawColorButton.addActionListener(e -> {
            Color newColor = JColorChooser.showDialog(null, "Válassz színt", drawColor);
            if (newColor != null) {
                drawColor = newColor;
            }
        });

        JButton clearButton = new JButton("Törlés");
        clearButton.addActionListener(e -> {
            backgroundColor = Color.WHITE;
            panel.repaint();
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(bgColorButton);
        buttonPanel.add(drawColorButton);
        buttonPanel.add(clearButton);

        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VECB52Prog18 frame = new VECB52Prog18();
            frame.setVisible(true);
        });
    }
}

