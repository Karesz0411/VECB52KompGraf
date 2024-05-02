/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.the.vecb52.vecb52proggrafika;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Hallgató
 */
public class VECB52ProgGrafika extends JFrame{

    VECB52ProgGrafika() {
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VECB52ProgGrafika frame = new VECB52ProgGrafika();
            frame.setVisible(true);
        });
    }
}
