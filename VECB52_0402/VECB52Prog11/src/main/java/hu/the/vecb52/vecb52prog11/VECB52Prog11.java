/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.the.vecb52.vecb52prog11;

/**
 *
 * @author Hallgató
 */
import javax.swing.*;
import java.awt.*;

public class VECB52Prog11 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("PTI");
        frame.setSize(220, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.GRAY);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Mihály Károly");
        listModel.addElement("Bárdos Triszten");
        listModel.addElement("Laczkó Lajos");
        listModel.addElement("Veres Zoltán");
        listModel.addElement("Fejér Zakariás");
        listModel.addElement("Papp Kevin");

        JList<String> nameList = new JList<>(listModel);

        JScrollPane scrollPane = new JScrollPane(nameList);

        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
