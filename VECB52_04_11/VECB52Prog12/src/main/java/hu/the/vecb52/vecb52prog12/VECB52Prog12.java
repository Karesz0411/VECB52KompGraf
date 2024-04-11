/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.the.vecb52.vecb52prog12;

/**
 *
 * @author Hallgató
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VECB52Prog12 extends JFrame {

    public VECB52Prog12() {
        super("Számolás");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new FlowLayout());
        
        JTextField text_field = new JTextField(10);

        JButton button_1 = new JButton("Kilépés");
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        JButton button_2 = new JButton("Dupláz");
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = text_field.getText();
                int number = Integer.parseInt(text);
                int doubled_number = number * 2;
                text_field.setText(Integer.toString(doubled_number));
            }
        });

        panel.add(button_1);
        panel.add(button_2);
        panel.add(text_field);

        getContentPane().add(panel);

        pack();

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VECB52Prog12();
        });
    }
}