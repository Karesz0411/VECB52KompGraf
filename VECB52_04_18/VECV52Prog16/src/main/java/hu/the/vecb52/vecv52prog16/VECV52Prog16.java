package hu.the.vecb52.vecv52prog16;

import javax.swing.*;
import java.awt.*;

public class VECV52Prog16 extends JFrame {
    private JPanel panel;

    public VECV52Prog16() {
        super("Mértani Alakzatok");
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics shapes) {
                super.paintComponent(shapes);
                shapes.setColor(Color.red);
                
                //draw the standing oval shape
                shapes.drawOval(10, 10, 50, 70);
                shapes.fillOval(10, 10, 50, 70);
                
                //draw the second oval
                shapes.drawOval(100, 20, 70, 50);
                shapes.fillOval(100, 20, 70, 50);
                
                //draw the circle
                shapes.drawOval(200,10,60,60);
                shapes.fillOval(200, 10, 60, 60);
                
                //draw the first arc
                shapes.drawArc(10, 100, 60, 60, 0, 90);
                shapes.fillArc(10, 100, 60, 60, 0, 90);
                
                //draw the second arc
                shapes.drawArc(100, 100, 60, 60, 90, 90);
                shapes.fillArc(100, 100, 60, 60, 90, 90);
                
                //draw the last 2 arc in the row
                shapes.drawArc(200, 100, 60, 60, 180, 60);
                shapes.fillArc(200, 100, 60, 60, 180, 60);
                
                shapes.drawArc(210, 100, 60, 60, 270, 60);
                shapes.fillArc(210, 100, 60, 60, 270, 60);
                
                //draw the missing circle
                for (int angle = 0; angle <= 360; angle += 33) {
                    shapes.drawArc(10, 150, 60, 60, angle, 18);
                    shapes.fillArc(10, 150, 60, 60, angle, 18);
                }
                
                //draw the missing oval
                for (int angle = 0; angle <= 360; angle += 33) {
                    shapes.drawArc(100, 140, 50, 70, angle, 18);
                    shapes.fillArc(100, 140, 50, 70, angle, 18);
                }
                
                //draw the missing half oval
                for (int angle = 0; angle <= 160; angle += 33) {
                    shapes.drawArc(200, 160, 50, 70, angle, 18);
                    shapes.fillArc(200, 160, 50, 70, angle, 18);
                }
                
            }
        };
        panel.setBorder(BorderFactory.createLineBorder(Color.RED));
        getContentPane().add(panel);
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VECV52Prog16 frame = new VECV52Prog16();
            frame.setVisible(true);
        });
    }
}
