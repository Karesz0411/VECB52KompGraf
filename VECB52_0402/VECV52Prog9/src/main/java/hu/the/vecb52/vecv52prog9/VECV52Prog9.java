/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.the.vecb52.vecv52prog9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VECV52Prog9 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("VECB52_0402_jelölőnégyzet");
        
        //Elnézést hogy nem a kért paraméterekkel hoztam létre a JFramem, de csak így néz ki úgy mint az öné.
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel label = new JLabel("Szöveg:");

        JTextField textField = new JTextField(20);
        textField.setForeground(Color.BLUE);

        JButton clearButton = new JButton("Törlés");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        topPanel.add(label);
        topPanel.add(textField);
        topPanel.add(clearButton);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JCheckBox colorCheckBox = new JCheckBox("Kék/Piros");
        JCheckBox caseCheckBox = new JCheckBox("Kisbetű/Nagybetű");

        ActionListener checkBoxListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (colorCheckBox.isSelected()) {
                    textField.setForeground(Color.RED);
                }
                else {
                    textField.setForeground(Color.BLUE);
                }

                if (caseCheckBox.isSelected()) {
                    textField.setText(text.toUpperCase());
                }
                else {
                    textField.setText(text.toLowerCase());
                }
            }
        };

        colorCheckBox.addActionListener(checkBoxListener);
        caseCheckBox.addActionListener(checkBoxListener);

        bottomPanel.add(colorCheckBox);
        bottomPanel.add(caseCheckBox);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
