/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.the.vecb52prog7;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class VECB52Prog7 extends JFrame {
    JLabel label_1;
    JLabel label_2;
    JLabel label_3;
    
    VECB52Prog7() {
        label_1 = new JLabel("Programtervező Informatikus 2024");
        label_2 = new JLabel("Programtervező Informatikus 2024");
        label_3 = new JLabel("Programtervező Informatikus 2024");
        
        /******************
        ***Set the color***
        *******************/
        label_1.setForeground(java.awt.Color.BLUE);
        label_2.setForeground(java.awt.Color.BLACK);
        label_3.setForeground(java.awt.Color.RED);
        
        /**********************
        ***Set the font size***
        **********************/
        label_1.setFont(label_1.getFont().deriveFont(17.0f));
        label_2.setFont(label_1.getFont().deriveFont(14.0f));
        label_3.setFont(label_1.getFont().deriveFont(11.0f));
        
        /***********************
        ***Set the font style***
        ***********************/
        Font label_1_font = label_1.getFont();
        label_1.setFont(label_1_font.deriveFont(label_1_font.getStyle() | Font.ITALIC));
        Font label_3_font = label_3.getFont();
        label_3.setFont(label_3_font.deriveFont(label_3_font.getStyle() | Font.ITALIC));


        /*********************************
        ***Set the height and the width***
        *********************************/
        label_1.setBounds(50, 50, 300, 30);
        label_2.setBounds(50, 100, 300, 30);
        label_3.setBounds(50, 150, 300, 30);
        
        /******************
        ***Add the label***
        ******************/
        add(label_1);
        add(label_2);
        add(label_3);
        
        setLayout(null);
        
        getContentPane().setBackground(java.awt.Color.YELLOW);
        
        setTitle("Mihály");
        
        setSize(400, 300);
        
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new VECB52Prog7();
    }
}

