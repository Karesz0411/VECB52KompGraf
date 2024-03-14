/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.the.prog5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Hallgató
 */
public class Prog5 extends JFrame implements ActionListener{

    JButton exit_button;
    
    Prog5() {
        exit_button = new JButton("Kilépés");
        exit_button.setBounds(100,100,100,30);
        exit_button.addActionListener(this);
        
        add(exit_button);
        setLayout(null);
        
        setSize(400, 300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
    public static void main(String[] args) {
        new Prog5();
    }
}
