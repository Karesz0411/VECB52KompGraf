/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.the.vecb52.vecb52prog10;

/**
 *
 * @author Hallgató
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VECB52Prog10 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("VECB52_0402_RadioButtons");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel label = new JLabel("Szöveg:");

        JTextField textField = new JTextField(20);

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

        JRadioButton blueRadio = new JRadioButton("Kék");
        JRadioButton redRadio = new JRadioButton("Piros");
        JRadioButton lowerCaseRadio = new JRadioButton("Kisbetű");
        JRadioButton upperCaseRadio = new JRadioButton("Nagybetű");

        ButtonGroup colorGroup = new ButtonGroup();
        colorGroup.add(blueRadio);
        colorGroup.add(redRadio);

        ButtonGroup caseGroup = new ButtonGroup();
        caseGroup.add(lowerCaseRadio);
        caseGroup.add(upperCaseRadio);

        ActionListener radioButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (blueRadio.isSelected()) {
                    textField.setForeground(Color.BLUE);
                }
                else if (redRadio.isSelected()) {
                    textField.setForeground(Color.RED);
                }

                if (lowerCaseRadio.isSelected()) {
                    textField.setText(text.toLowerCase());
                }
                else if (upperCaseRadio.isSelected()) {
                    textField.setText(text.toUpperCase());
                }
            }
        };

        blueRadio.addActionListener(radioButtonListener);
        redRadio.addActionListener(radioButtonListener);
        lowerCaseRadio.addActionListener(radioButtonListener);
        upperCaseRadio.addActionListener(radioButtonListener);

        bottomPanel.add(blueRadio);
        bottomPanel.add(redRadio);
        bottomPanel.add(lowerCaseRadio);
        bottomPanel.add(upperCaseRadio);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
