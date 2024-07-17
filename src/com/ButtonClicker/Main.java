package com.ButtonClicker;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Main {
    public static int incrementValue = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Frame mainFrame = new Frame("Button Clicker");
                JPanel titlePanel = new JPanel();
                JPanel countPanel = new JPanel();
                JPanel buttonPanel = new JPanel();
                JPanel parentPanel = new JPanel();
                JLabel buttonTitle = new JLabel("<html><div style='padding-top: 20px;'>Click to increment value</div></html>");
                JLabel value = new JLabel("0");
                JButton button = new JButton("Click Me");

                button.setFocusPainted(false);
                button.setBorder(new EmptyBorder(10,10,10,10));
                button.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.black, 2, true), button.getBorder()));
                button.setBackground(Color.GRAY);

                value.setSize(100,10);

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        incrementValue++;
                        String stringIncrementValue = Integer.toString(incrementValue);
                        value.setText(stringIncrementValue);
                    }
                });

                titlePanel.add(buttonTitle);
                countPanel.add(value);
                buttonPanel.add(button);

                parentPanel.add(titlePanel);
                parentPanel.add(countPanel);
                parentPanel.add(buttonPanel);

                parentPanel.setLayout(new BoxLayout(parentPanel, BoxLayout.Y_AXIS));

                mainFrame.getContentPane().add(parentPanel);
            }
        });
    }
}