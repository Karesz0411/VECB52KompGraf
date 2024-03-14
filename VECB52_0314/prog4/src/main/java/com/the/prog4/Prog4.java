/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.the.prog4;

import javax.swing.*;

/**
 *
 * @author Hallgató
 */
public class Prog4 {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(20, 20, 400, 300);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("Helló VECB52");
        frame.getContentPane().add(label);
        
        label.setBounds(40,100,100,20);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
