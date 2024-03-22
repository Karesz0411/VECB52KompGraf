/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.the.vecb52prog8;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

/**
 *
 * @author Hallgató
 */
public class VECB52Prog8 extends JFrame{

    JPanel kocka_1;
    JPanel kocka_2;
    JPanel kocka_3;
    
    VECB52Prog8() {
        setTitle("VECB52_színek");

        kocka_1 = new JPanel();
        kocka_1.setBackground(Color.RED);

        kocka_2 = new JPanel();
        kocka_2.setBackground(Color.MAGENTA);

        kocka_3 = new JPanel();
        kocka_3.setBackground(Color.CYAN);

        add(kocka_1);
        add(kocka_2);
        add(kocka_3);

        setLayout(null);

        int meret = 50;
        kocka_1.setBounds(20, 20, meret, meret);
        kocka_2.setBounds(90, 20, meret, meret);
        kocka_3.setBounds(160, 20, meret, meret);
        
        getContentPane().setBackground(java.awt.Color.YELLOW);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new VECB52Prog8();
    }
}
