/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.the.prog3vecb52;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
/**
 *
 * @author Hallgató
 */
public class Prog3VECB52 extends JFrame {
    JLabel label_1;
    JLabel label_2;
    
    
    Prog3VECB52() {
        label_1 = new JLabel("Programtervező Informatikus, PTI");
        label_2 = new JLabel("Programtervező Informatikus, 2024");
        
        label_1.setBounds(50, 50, 250, 30);
        label_2.setBounds(50, 100, 250, 30);
        
        add(label_1);
        add(label_2);
        
        setLayout(new FlowLayout());
        
        setSize(400, 300);
        //pack();
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /****************************
    ************MAIN*************
    ****************************/
    
    public static void main(String[] args) {
        new Prog3VECB52();
    }
}
