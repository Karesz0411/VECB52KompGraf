/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kompgrafvecb52_1;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
/**
 *
 * @author karesz54
 */
public class KompGrafVECB52_1 extends JFrame{
    
    private JPanel panel;
    
    private Image image1;
    private Image image2;
    private Image image3;
    private Image image4;
    
    KompGrafVECB52_1() {
        super("VECB52 Java beadandó");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        ImageIcon icon1 = new ImageIcon("C:\\MKgit\\VECB52KompGraf\\KompGrafVECB52\\KompGrafVECB52_1\\src\\main\\java\\com\\mycompany\\kompgrafvecb52_1\\the_logo.png");
        image1 = icon1.getImage();

        ImageIcon icon2 = new ImageIcon("C:\\MKgit\\VECB52KompGraf\\KompGrafVECB52\\KompGrafVECB52_1\\src\\main\\java\\com\\mycompany\\kompgrafvecb52_1\\the_dombok.png");
        image2 = icon2.getImage();

        ImageIcon icon3 = new ImageIcon("C:\\MKgit\\VECB52KompGraf\\KompGrafVECB52\\KompGrafVECB52_1\\src\\main\\java\\com\\mycompany\\kompgrafvecb52_1\\the_epulet.png");
        image3 = icon3.getImage();

        ImageIcon icon4 = new ImageIcon("C:\\MKgit\\VECB52KompGraf\\KompGrafVECB52\\KompGrafVECB52_1\\src\\main\\java\\com\\mycompany\\kompgrafvecb52_1\\the_cim.png");
        image4 = icon4.getImage();

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                g.setColor(Color.blue);
                Font font = new Font("Arial", Font.BOLD, 24);
                g.setFont(font);
                g.drawString("Mihály Károly projektmunka", 100 , 50);
                
                g2d.fillOval(180, 190, 150, 120);
                
                g2d.setColor(Color.red);
                g2d.setStroke(new BasicStroke(5));
                g2d.drawLine(0, 0, 500, 500);
                g2d.drawLine(0, 500, 500, 0);
                
                g2d.setColor(Color.blue);
                g2d.drawRoundRect(25, 60, 450, 375, 20, 20);
                
                g.setColor(Color.black);
                g.drawString("Sárospatak", 200 , 250);

                g2d.setClip(new Ellipse2D.Double(50, 100, 100, 100));
                g2d.drawImage(image1, 50, 100, 100, 100, this);
                AffineTransform oldTransform = g2d.getTransform();
                g2d.rotate(Math.toRadians(30), 50 + 50, 100 + 50);
                g2d.setColor(Color.red);
                String text1 = "LOGO";
                FontMetrics metrics1 = g2d.getFontMetrics();
                int x1 = (100 - metrics1.stringWidth(text1)) / 2;
                int y1 = ((100 - metrics1.getHeight()) / 2) + metrics1.getAscent();
                g2d.drawString(text1, 50 + x1 , 100 + y1);
                g2d.setTransform(oldTransform);

                g2d.setTransform(new AffineTransform());

                g2d.setClip(new Ellipse2D.Double(350, 100, 100, 100));
                g2d.drawImage(image2, 350, 100, 100, 100, this);
                oldTransform = g2d.getTransform();
                g2d.rotate(Math.toRadians(30), 350 + 50, 100 + 50);
                g2d.setColor(Color.red);
                String text2 = "DOMBOK";
                FontMetrics metrics2 = g2d.getFontMetrics();
                int x2 = (100 - metrics2.stringWidth(text2)) / 2;
                int y2 = ((100 - metrics2.getHeight()) / 2) + metrics2.getAscent();
                g2d.drawString(text2, 350 + x2 , 100 + y2);
                g2d.setTransform(oldTransform);

                g2d.setTransform(new AffineTransform());

                g2d.setClip(new Ellipse2D.Double(50, 300, 100, 100));
                g2d.drawImage(image3, 50, 300, 100, 100, this);
                oldTransform = g2d.getTransform();
                g2d.rotate(Math.toRadians(30), 50 + 50, 300 + 50);
                g2d.setColor(Color.red);
                String text3 = "ÉPÜLET";
                FontMetrics metrics3 = g2d.getFontMetrics();
                int x3 = (100 - metrics3.stringWidth(text3)) / 2;
                int y3 = ((100 - metrics3.getHeight()) / 2) + metrics3.getAscent();
                g2d.drawString(text3, 50 + x3 , 300 + y3);
                g2d.setTransform(oldTransform);

                g2d.setTransform(new AffineTransform());

                g2d.setClip(new Ellipse2D.Double(350, 300, 100, 100));
                g2d.drawImage(image4, 350, 300, 100, 100, this);
                oldTransform = g2d.getTransform();
                g2d.rotate(Math.toRadians(30), 350 + 50, 300 + 50);
                g2d.setColor(Color.red);
                String text4 = "TÁBLA";
                FontMetrics metrics4 = g2d.getFontMetrics();
                int x4 = (100 - metrics4.stringWidth(text4)) / 2;
                int y4 = ((100 - metrics4.getHeight()) / 2) + metrics4.getAscent();
                g2d.drawString(text4, 350 + x4 , 300 + y4);
                g2d.setTransform(oldTransform);

                g2d.setTransform(new AffineTransform());
            }
        };
        panel.setBackground(Color.LIGHT_GRAY);
        add(panel);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KompGrafVECB52_1 frame = new KompGrafVECB52_1();
            frame.setVisible(true);
        });
    }
}
