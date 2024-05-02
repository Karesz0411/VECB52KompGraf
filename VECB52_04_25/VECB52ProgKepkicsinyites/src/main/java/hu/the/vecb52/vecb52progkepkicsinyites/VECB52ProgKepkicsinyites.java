package hu.the.vecb52.vecb52progkepkicsinyites;

import javax.swing.*;
import java.awt.*;

public class VECB52ProgKepkicsinyites extends JFrame {

    private JPanel panel;
    private Image image;

    public VECB52ProgKepkicsinyites() {
        super("Képek méretezése");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 500);

        ImageIcon icon = new ImageIcon("C:\\MKgit\\VECB52KompGraf\\VECB52_04_25\\the.jpg");
        image = icon.getImage();
        
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //Draw with getWidth and getHight
                /*
                g.drawImage(image, 0, 0, getWidth()/4, getHeight()/4, this);
                
                g.drawImage(image, 300, 0, getWidth()/2, getHeight()/2, this);
                
                g.drawImage(image, 800, 0, getWidth(), getHeight(), this);
                */
                //Draw with exact numbers
                
                g.drawImage(image, 0, 0, 100, 100, this);
                
                g.drawImage(image, 150, 0, 200, 200, this);
                
                g.drawImage(image, 400, 0, 400, 400, this);
            }
        };
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VECB52ProgKepkicsinyites frame = new VECB52ProgKepkicsinyites();
            frame.setVisible(true);
        });
    }
}
