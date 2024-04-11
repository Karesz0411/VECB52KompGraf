/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.the.vecb52.vecb52prog13;

/**
 *
 * @author Hallgató
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VECB52Prog13 extends JFrame implements AdjustmentListener {
    JScrollBar scrollBar1, scrollBar2;
    JTextField resultField;

    public VECB52Prog13() {
        super("Összeadó-Scroll");
        setSize(300, 140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 1));

        JLabel label1 = new JLabel("1. adat:");
        panel.add(label1);

        scrollBar1 = new JScrollBar(JScrollBar.HORIZONTAL, 1, 1, 1, 101);
        scrollBar1.addAdjustmentListener(this);
        panel.add(scrollBar1);
        
        JLabel label2 = new JLabel("2. adat:");
        panel.add(label2);

        scrollBar2 = new JScrollBar(JScrollBar.HORIZONTAL, 1, 1, 1, 101);
        scrollBar2.addAdjustmentListener(this);
        panel.add(scrollBar2);

        JLabel resultLabel = new JLabel("Összeg:");
        panel.add(resultLabel);

        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setBackground(Color.WHITE);
        panel.add(resultField);

        getContentPane().add(panel);
        setVisible(true);
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        int value1 = scrollBar1.getValue();
        int value2 = scrollBar2.getValue();
        int result = value1 + value2;
        resultField.setText(value1 + " + " + value2 + " = " + result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VECB52Prog13());
    }
}
