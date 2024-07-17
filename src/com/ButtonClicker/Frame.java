package com.ButtonClicker;

import javax.swing.JFrame;

public class Frame extends JFrame {
    public Frame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setVisible(true);
        this.setResizable(false);
    }
}