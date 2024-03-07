/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.the.prog2vecb52;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Hallgató
 */
public class Prog2VECB52 extends JFrame {
    Prog2VECB52() {
        JLabel pti_label = new JLabel("Programtervező Informatikus, Bsc");
        add(pti_label);
        
        setSize(400, 300);
        //pack();
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /****************************
    ************MAIN*************
    ****************************/
    
    public static void main(String[] args) {
        new Prog2VECB52();
    }
}
