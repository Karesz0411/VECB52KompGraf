package com.mycompany.vecb52_szamologep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VECB52_Szamologep extends JFrame {
    private JTextField display;
    private JPanel panel;
    private String operator = "";
    private double firstNumber = 0;
    private boolean operatorClicked = false;

    VECB52_Szamologep() {
        setTitle("Számológép");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));
        add(panel, BorderLayout.CENTER);

        String[] buttons = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", "C", ".", "/", "+/-", "="};

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (text.matches("\\d")) {
                        if (operatorClicked) {
                            display.setText("");
                            operatorClicked = false;
                        }
                        display.setText(display.getText() + text);
                    }
                    else if (text.equals(".")) {
                        if (!display.getText().contains(".")) {
                            display.setText(display.getText() + text);
                        }
                    }
                    else if (text.equals("C")) {
                        display.setText("");
                        operator = "";
                        firstNumber = 0;
                    }
                    else if (text.equals("+/-")) {
                        double number = Double.parseDouble(display.getText());
                        display.setText(String.valueOf(number * -1));
                    }
                    else if (text.equals("=")) {
                        double secondNumber = Double.parseDouble(display.getText());
                        switch (operator) {
                            case "+":
                                display.setText(String.valueOf(firstNumber + secondNumber));
                                break;
                            case "-":
                                display.setText(String.valueOf(firstNumber - secondNumber));
                                break;
                            case "*":
                                display.setText(String.valueOf(firstNumber * secondNumber));
                                break;
                            case "/":
                                display.setText(String.valueOf(firstNumber / secondNumber));
                                break;
                        }
                        operator = "";
                    }
                    else {
                        operatorClicked = true;
                        operator = text;
                        firstNumber = Double.parseDouble(display.getText());
                    }
                }
            });
            panel.add(button);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VECB52_Szamologep frame = new VECB52_Szamologep();
            frame.setVisible(true);
        });
    }
}
