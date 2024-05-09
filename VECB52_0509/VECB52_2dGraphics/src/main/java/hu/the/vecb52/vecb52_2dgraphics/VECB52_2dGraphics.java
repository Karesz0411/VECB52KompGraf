/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.the.vecb52.vecb52_2dgraphics;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Hallgató
 */
public class VECB52_2dGraphics extends JFrame{
    
    private JPanel panel;
    private Image image;

    VECB52_2dGraphics() {
        super("2d JAVA Grafika");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        
        ImageIcon icon = new ImageIcon("C:\\MKgit\\VECB52KompGraf\\VECB52_0509\\VECB52_2dGraphics\\src\\main\\java\\hu\\the\\vecb52\\vecb52_2dgraphics\\the.png");
        image = icon.getImage();
        
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics shapes) {
                super.paintComponent(shapes);
                shapes.setColor(Color.blue);

                double rotationAngle = Math.toRadians(-30);

                int centerX = 250;
                int centerY = 250;

                Graphics2D g2d = (Graphics2D) shapes;

                g2d.rotate(rotationAngle, centerX, centerY);                
    
                g2d.fillArc(20, 150, 400, 230, 90, 180);
                //g2d.drawOval(20, 150, 400, 230);
                //g2d.fillOval(20, 150, 400, 230);
                
                shapes.setColor(Color.MAGENTA);
                g2d.setStroke(new BasicStroke(5));
                g2d.drawOval(250,240,200,200);
                shapes.setColor(Color.green);     
                g2d.fillOval(250,240,200,200);
                
                float opacity = 0.8f;
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
                g2d.drawImage(image, 150, 100, 150, 200, this);
                
                Font font = new Font("Arial", Font.BOLD, 24);
                g2d.setFont(font);
                
                shapes.setColor(Color.red);
                g2d.drawString("Tokaj Hegyalja Egyetem", centerX-140, centerY+60);
            }
        };

        setBackground(Color.LIGHT_GRAY); 
        add(panel);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VECB52_2dGraphics frame = new VECB52_2dGraphics();
            frame.setVisible(true);
        });
    }
}