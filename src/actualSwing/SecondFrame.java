package actualSwing;


import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SecondFrame extends JFrame implements ActionListener {
	JLabel label;
	JPanel beigePanel;
	JPanel whitePanel;
	JTextField textFieldStartHour;
	JTextField textFieldStartMinute;
	JButton startHourButton;
	JButton nameButton;
	JButton startMinuteButton;
		
	SecondFrame() {
		//Left Panel	
		beigePanel = new JPanel();
		beigePanel.setBackground(new Color(0xF5F5DC));
		beigePanel.setBounds(0, 0, 300, 600);
		
		//Right Panel
		whitePanel = new JPanel();
		whitePanel.setBackground(Color.white);
		whitePanel.setBounds(300, 0, 300, 600);
			
			
		//Start Time Button	
		startHourButton = new JButton("Submit Start Hour");
		startHourButton.addActionListener(this);
		startHourButton.setFocusable(false);
		startHourButton.setBackground(Color.LIGHT_GRAY);
		startHourButton.setBounds(100,100,50,50);
		
		//Start Minute Button
		startMinuteButton = new JButton("Submit Start Min");
		startMinuteButton.addActionListener(this);
		startMinuteButton.setFocusable(false);
		startMinuteButton.setBackground(Color.LIGHT_GRAY);
		startMinuteButton.setBounds(250,250,250,250);
		
		//Name Button
		nameButton = new JButton("Enter name");
		nameButton.addActionListener(this);
		nameButton.setFocusable(false);
		nameButton.setBackground(Color.LIGHT_GRAY);
		
		
		textFieldStartHour =  new JTextField();
		textFieldStartHour.setPreferredSize(new Dimension(150,40));
			
		textFieldStartMinute = new JTextField();	
			
		this.getContentPane().setBackground(new Color(0xF5F5DC));
		//this.add(label);
		this.add(beigePanel);
		this.add(whitePanel);
		this.setVisible(true);
		this.setTitle("Get User Input");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		whitePanel.add(startHourButton);
		whitePanel.add(textFieldStartHour);
		whitePanel.add(startMinuteButton);
		whitePanel.add(nameButton);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			//name button
			
			
			
			
			//submit
			if(e.getSource() == startHourButton) {
				this.dispose();
				
			}
		}
}
			
			


