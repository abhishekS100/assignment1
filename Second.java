// Question 2
// Write a java program that stimulates a traffic light. The program lets the user select one of three lights;
// red, yellow, or green with radio buttons.On entering the choice, an appropriate message with "stop" or "ready"
// or "go" should appear in the console.Initially there is no message shown.

// Answer 2

package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficLightSimulator extends JFrame implements ActionListener {
  
  private JRadioButton redButton;
  private JRadioButton yellowButton;
  private JRadioButton greenButton;
  private ButtonGroup buttonGroup;

  public TrafficLightSimulator() {
     setTitle("Traffic Light Simulator");
     setSize(300, 200);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setLayout(new FlowLayout());

     // Create radio buttons for the lights
     redButton = new JRadioButton("Red");
     yellowButton = new JRadioButton("Yellow");
     greenButton = new JRadioButton("Green");

     // Add action listeners to the radio buttons
     redButton.addActionListener(this);
     yellowButton.addActionListener(this);
     greenButton.addActionListener(this);

     // Group the radio buttons so only one can be selected at a time
     buttonGroup = new ButtonGroup();
     buttonGroup.add(redButton);
     buttonGroup.add(yellowButton);
     buttonGroup.add(greenButton);

     // Add the radio buttons to the frame
     add(redButton);
     add(yellowButton);
     add(greenButton);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
     // Determine which button was selected and print the appropriate message
     if (redButton.isSelected()) {
        System.out.println("Stop");
     } else if (yellowButton.isSelected()) {
        System.out.println("Ready");
     } else if (greenButton.isSelected()) {
        System.out.println("Go");
     }
  }

  public static void main(String[] args) {
     // Create and display the GUI
     TrafficLightSimulator frame = new TrafficLightSimulator();
     frame.setVisible(true);
  }
}
