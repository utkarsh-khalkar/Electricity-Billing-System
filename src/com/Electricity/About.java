package com.Electricity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.Color.red;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {
        setLayout(null);
        b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);

        f = new Font("RAILWAY", Font.BOLD, 180);
        setFont(f);

        s = "                                   About Project                        \n" +
                "An electricity billing system project is a software application designed " +
                "to automate the process of calculating and generating bills for electricity consumers. " +
                "The system is intended to replace the traditional manual billing process, which is time-consuming, " +
                "prone to errors, and can be inefficient. With an automated electricity billing system, the entire billing " +
                "process is streamlined, efficient, and accurate.\n\n";

        t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 10, 450, 300);
        add(t1);
        f1 = new Font("RAILWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentpane = this.getContentPane();
        t1 = new TextArea();

        l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(170, 10, 100, 80);
        l1.setForeground(red);

        f2 = new Font("RAILWAY", Font.BOLD, 20);
        t1.setFont(f2);

        setLayout(null);
        setBounds(700, 220, 500, 550);

        setVisible(true);

    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
}
