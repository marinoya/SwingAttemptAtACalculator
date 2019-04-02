package edu.progress.swingattemptatacalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    //create  a frame
    static JFrame f;
    //create a textfield
    static JTextField l;

    //Store operator and operands
    String s0, s1, s2;

    //default constructor
    Calculator(){
        s0 = s1 = s2 = "";
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();


        //if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            //checks if the first operand is present
            if (!s1.equals("")) {
                //assigns value to second operand
                s2 = s2 + s;
            } else {
                //else assigns value to first operand
                s0 = s0 + s;
            }

            l.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == 'C') {
            //Clear
            s0 = s1 = s2 = "";
            //TODO - explain how this sets the value
            l.setText(s0 + s1 + s2);
        } else if (s1.charAt(0) == '=') {
            double te;
            //store the value in 1st
            if (s1.equals("+")) {
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            } else if (s1.equals("-")) {
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            } else if (s1.equals("/")) {
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            } else /*if (s1.equals("*"))*/ {
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
            }
            //Set the value of the text
            l.setText(s0 + s1 + s2 + "=" + te);
            //convert it to String
            s0 = Double.toString(te);
            s1 = s2 = "";

        } else {
            //if ther ewas no operand
            if(s1.equals("") || s2.equals("") ){
                s1 = s;
                //else evaluate
            }else{
                double te;
                //store the value in 1st
                if (s1.equals("+")){
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                } else if (s1.equals("-")) {
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                } else if (s1.equals("/")) {
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                } else /*if (s1.equals("*"))*/ {
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
                }//convert it to String
                s0 = Double.toString(te);
                //place the operator
                s1 = s;
                //set the value of text
                s2 ="";
            }
            l.setText(s0 + s1 + s2);
        }
    }
}