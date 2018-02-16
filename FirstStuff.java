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


    public FirstStuff() {
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
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(X){
                    button5.setText("X");
                    X = false;
                    textArea1.setText("Guter Zug X!");
                }else{
                    button5.setText("O");
                    X = true;
                    textArea1.setText("Guter Zug O!");
                }
            }
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

}
