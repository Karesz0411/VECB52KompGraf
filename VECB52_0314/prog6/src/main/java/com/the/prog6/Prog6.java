/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.the.prog6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Hallgató
 */
public class Prog6 extends JFrame implements ActionListener{

    JButton first_button;
    JButton second_button;
    JButton third_button;
    
    Prog6() {
        first_button = new JButton("Kilépés");
        second_button = new JButton("Változtat");
        third_button = new JButton("Vissza");
        
        first_button.setBounds(20,100,100,30);
        first_button.addActionListener(this);
        
        second_button.setBounds(150,100,100,30);
        second_button.addActionListener(this);
        
        third_button.setBounds(280,100,100,30);
        third_button.addActionListener(this);

        add(first_button);
        add(second_button);
        add(third_button);
        
        setLayout(null);
        
        setSize(400, 300);
        setTitle("Prog6");
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == first_button) {
            System.exit(0);
        }
        
        if (e.getSource() == second_button) {
            setTitle("VECB52");
        }
        
        if (e.getSource() == third_button) {
            setTitle("Vissza");
        }
    }
    
    public static void main(String[] args) {
        new Prog6();
    }
}
