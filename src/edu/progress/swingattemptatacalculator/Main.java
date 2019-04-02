package edu.progress.swingattemptatacalculator;

import javax.swing.*;
import java.awt.*;

// exersise from https://www.geeksforgeeks.org/java-swing-simple-calculator/
//Java program to create a simple calculator
//with basic +,-, * and / functions

public class Main {

    //create  a frame
    static JFrame f;
    //create a textfield
    static JTextField l;

    //Store operator and operands
    String s0, s1, s2;

    //main method

    public static void main(String[] args) {

        f = new JFrame("Calculator");

        try {

            //set Look and Feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Calculator c = new Calculator();

        //create a textfield
        l = new JTextField();
        //set the tet field to non-editable
        l.setEditable(false);

        //create the number buttons and some operators
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;

        // assign number buttons
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        //assign equals button
        beq1 = new JButton("=");

        //assign operators buttons
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        beq = new JButton("C");

        //assign the decimal button
        be = new JButton(".");

        //create a panel
        JPanel p = new JPanel();
        //p.setLayout(GridLayout);

        //add action listeners to the buttons
        b0.addActionListener(c);
        b1.addActionListener(c);
        b2.addActionListener(c);
        b3.addActionListener(c);
        b4.addActionListener(c);
        b5.addActionListener(c);
        b6.addActionListener(c);
        b7.addActionListener(c);
        b8.addActionListener(c);
        b9.addActionListener(c);
        beq1.addActionListener(c);
        ba.addActionListener(c);
        bs.addActionListener(c);
        bd.addActionListener(c);
        bm.addActionListener(c);
        beq.addActionListener(c);
        be.addActionListener(c);

        //add elements to panel
        p.add(l);
        p.add(ba);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bd);
        p.add(be);
        p.add(b0);
        p.add(beq);
        p.add(beq1);

        // set background of panel
        p.setBackground(Color.pink);

        //add Panel to Frame
        f.add(p);

        f.setVisible(true);
        f.setSize(200,220);
        f.show();




    }


}
