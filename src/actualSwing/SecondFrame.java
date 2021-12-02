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

import milestone3.Availability;
import milestone3.Interval;


public class SecondFrame extends JFrame implements ActionListener {
	JLabel label;
	JPanel beigePanel;
	JPanel whitePanel;
	JTextField textFieldStartHour;
	JTextField textFieldStartMinute;
	JTextField textFieldEndHour;
	JTextField textFieldEndMinute;
	JButton startHourButton;
	JButton nameButton;
	JButton startMinuteButton;
	JButton endMinuteButton;
	JButton endHourButton;
	JButton addButton;
	JButton submitButton;
	
	
	
	
	//These are going to be hardcoded
    int year = 21, month = 12, day = 17;
    //These are going to be inputted
    int startHour, startMin, endHour, endMin;
    Availability user = new Availability();
    Availability dummyUser = new Availability();

    int[] a = {year, month, day, 21, 21};
    int[] b = {year, month, day, 21, 21};
    Interval i1 = new Interval(a, b);

    int[] c = {year, month, day, 11, 21};
    int[] d = {year, month, day, 21, 21};
    Interval i2 = new Interval(c, d);

    // Karan
    int[] e = {year, month, day, 11, 46};
    int[] f = {year, month, day, 12, 45};
    Interval i3 = new Interval(e, f);

    int[] g = {year, month, day, 11, 46};
    int[] h = {year, month, day, 12, 45};
    Interval i4 = new Interval(g, h);

    // year, month, date, hour, minute

    int[] i = {year, month, day, 21, 45};
    int[] j = {year, month, day, 10, 45};
    Interval i5 = new Interval(i, j);

    int[] k = {year, month, day, 11, 46};
    int[] l = {year, month, day, 12, 45};
    Interval i6 = new Interval(k, l);

		
	SecondFrame() {
		dummyUser.add(i1);
        dummyUser.add(i2);
        dummyUser.add(i3);
        dummyUser.add(i4);
        dummyUser.add(i5);
        dummyUser.add(i6);
		//Left Panel	
		beigePanel = new JPanel();
		beigePanel.setBackground(new Color(0xF5F5DC));
		beigePanel.setBounds(0, 0, 300, 600);
		
		//Right Panel
		whitePanel = new JPanel();
		whitePanel.setBackground(Color.white);
		whitePanel.setBounds(300, 0, 300, 600);
			
			
		//Start Hour Button	
		startHourButton = new JButton("Submit Start Hour");
		startHourButton.addActionListener(this);
		startHourButton.setFocusable(false);
		startHourButton.setBackground(Color.LIGHT_GRAY);
		startHourButton.setBounds(100,100,50,50);
		
		//Start Hour Button	
		endHourButton = new JButton("Submit End Hour");
		endHourButton.addActionListener(this);
		endHourButton.setFocusable(false);
		endHourButton.setBackground(Color.LIGHT_GRAY);
		endHourButton.setBounds(100,100,50,50);
		
		//Start Minute Button
		startMinuteButton = new JButton("Submit Start Min");
		startMinuteButton.addActionListener(this);
		startMinuteButton.setFocusable(false);
		startMinuteButton.setBackground(Color.LIGHT_GRAY);
		startMinuteButton.setBounds(250,250,250,250);
		
		//End Minute Button
		endMinuteButton = new JButton("Submit End Min");
		endMinuteButton.addActionListener(this);
		endMinuteButton.setFocusable(false);
		endMinuteButton.setBackground(Color.LIGHT_GRAY);
		endMinuteButton.setBounds(250,250,250,250);
		
		addButton = new JButton("add");
		addButton.addActionListener(this);
		addButton.setFocusable(false);
		addButton.setBackground(Color.LIGHT_GRAY);
		addButton.setBounds(100,100,50,50);
		
		submitButton = new JButton("submit");
		submitButton.addActionListener(this);
		submitButton.setFocusable(false);
		submitButton.setBackground(Color.LIGHT_GRAY);
		submitButton.setBounds(100,100,50,50);

		
		//Name Button
		//nameButton = new JButton("Enter name");
		//nameButton.addActionListener(this);
		//nameButton.setFocusable(false);
		//nameButton.setBackground(Color.LIGHT_GRAY);
		
		//Text Field for starting hour
		textFieldStartHour =  new JTextField();
		textFieldStartHour.setPreferredSize(new Dimension(150,40));
		textFieldStartHour.setBounds(150,150,150,150);
		
		//Text Field for ending hour
		textFieldEndHour =  new JTextField();
		textFieldEndHour.setPreferredSize(new Dimension(150,40));
		textFieldEndHour.setBounds(150,150,250,250);
		
		//Text Field for starting minute
		textFieldStartMinute = new JTextField();	
		textFieldStartMinute.setPreferredSize(new Dimension(150,40));
		textFieldStartMinute.setBounds(250, 150, 250, 250);
		
		//Text Field for ending minute
		textFieldEndMinute = new JTextField();	
		textFieldEndMinute.setPreferredSize(new Dimension(150,40));
		textFieldEndMinute.setBounds(350, 250, 250, 250);
	
			
		this.getContentPane().setBackground(new Color(0xF5F5DC));
		//this.add(label);
		this.add(beigePanel);
		this.add(whitePanel);
		this.setVisible(true);
		this.setTitle("Get User Input");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		
		whitePanel.add(startHourButton);
		whitePanel.add(endHourButton);
		
		whitePanel.add(textFieldStartHour);
		whitePanel.add(textFieldEndHour);
		whitePanel.add(textFieldStartMinute);
		whitePanel.add(textFieldEndMinute);
		
		
		whitePanel.add(startMinuteButton);
		whitePanel.add(endMinuteButton);
		whitePanel.add(addButton);
		whitePanel.add(submitButton);
		
		//whitePanel.add(nameButton);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			String startMinute = "";
			String endMinute = "";
			String startH = "";
			String endH = "";
			
			//start min button
			if(e.getSource() == startMinuteButton) {
				 startMinute = textFieldStartMinute.getText();
				 startMin = Integer.parseInt(startMinute);
				 System.out.println("Start min = " + startMin);
				 
				
			}
			
			//end min button
			if(e.getSource() == endMinuteButton) {
				 endMinute = textFieldEndMinute.getText();
				 endMin = Integer.parseInt(endMinute);
				 System.out.println("End min = " + endMin);
				
			}
			//start hour button
			if(e.getSource() == startHourButton) {
				 startH = textFieldStartHour.getText();
				 startHour = Integer.parseInt(startH);
				 System.out.println("startHour =  " + startHour);
				
			}
			//end hour button
			if(e.getSource() == endHourButton) {
				 endH = textFieldEndHour.getText();
				 endHour = Integer.parseInt(endH);
				 System.out.println("endHour = " + endHour);
				
			}
			//add button
			if(e.getSource() == addButton) {
	            //this.dispose();
	            //new SecondFrame();
	            int[] a = {year, month , day, startHour, startMin, 0, 0};
	            int[] b = {year, month , day, endHour, endMin, 0, 0};
	            Interval i = new Interval(a,b);
	            System.out.println("Interval Added " + i);
	            user.add(i);
	        }
			
			//submite button
			if(e.getSource() == submitButton) {
	            //this.dispose();
	            //new SecondFrame();
	            System.out.println(Availability.computeOverlap(user, dummyUser));
	        }
			
			
			
			
			
		}
}
			
			


