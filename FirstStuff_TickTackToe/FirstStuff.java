package com.jonas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstStuff {

    private JPanel ContentPane;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JTextArea textArea1;
    boolean X = true;
    private JButton[][] buttonArray = new JButton[3][3];

    public FirstStuff() {

        buttonArray[0][0] = button1;
        buttonArray[0][1] = button2;
        buttonArray[0][2] = button3;
        buttonArray[1][0] = button4;
        buttonArray[1][1] = button5;
        buttonArray[1][2] = button6;
        buttonArray[2][0] = button7;
        buttonArray[2][1] = button8;
        buttonArray[2][2] = button9;

        textArea1.setText("TICK TACK TOE!");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(X){
                    button1.setText("X");
                    X = false;
                    textArea1.setText("Guter Zug X!");
                }else{
                    button1.setText("O");
                    X = true;
                    textArea1.setText("Guter Zug O!");
                }
                button1.setEnabled(false);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(X){
                    button2.setText("X");
                    X = false;
                    textArea1.setText("Guter Zug X!");
                }else{
                    button2.setText("O");
                    X = true;
                    textArea1.setText("Guter Zug O!");
                }
                button2.setEnabled(false);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(X){
                    button3.setText("X");
                    X = false;
                    textArea1.setText("Guter Zug X!");
                }else{
                    button3.setText("O");
                    X = true;
                    textArea1.setText("Guter Zug O!");
                }
                button3.setEnabled(false);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(X){
                    button4.setText("X");
                    X = false;
                    textArea1.setText("Guter Zug X!");
                }else{
                    button4.setText("O");
                    X = true;
                    textArea1.setText("Guter Zug O!");
                }
                button4.setEnabled(false);
            }
        });

        button5.addActionListener(e -> {
            if(X){
                button5.setText("X");
                X = false;
                textArea1.setText("Guter Zug X!");
            }else{
                button5.setText("O");
                X = true;
                textArea1.setText("Guter Zug O!");
            }
            button5.setEnabled(false);
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(X){
                    button6.setText("X");
                    X = false;
                    textArea1.setText("Guter Zug X!");
                }else{
                    button6.setText("O");
                    X = true;
                    textArea1.setText("Guter Zug O!");
                }
                button6.setEnabled(false);
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(X){
                    button7.setText("X");
                    X = false;
                    textArea1.setText("Guter Zug X!");
                }else{
                    button7.setText("O");
                    X = true;
                    textArea1.setText("Guter Zug O!");
                }
                button7.setEnabled(false);
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(X){
                    button8.setText("X");
                    X = false;
                    textArea1.setText("Guter Zug X!");
                }else{
                    button8.setText("O");
                    X = true;
                    textArea1.setText("Guter Zug O!");
                }
                button8.setEnabled(false);
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(X){
                    button9.setText("X");
                    X = false;
                    textArea1.setText("Guter Zug X!");
                }else{
                    button9.setText("O");
                    X = true;
                    textArea1.setText("Guter Zug O!");
                }
                button9.setEnabled(false);
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FirstStuff");
        frame.setContentPane(new FirstStuff().ContentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void winner() {

    }
}
