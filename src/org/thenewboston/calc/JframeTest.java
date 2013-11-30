package org.thenewboston.calc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JframeTest extends JFrame {
	
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JPasswordField passwordField;
	
	public JframeTest(){
		super("The title bar");
		setLayout(new FlowLayout());
		
		text1 = new JTextField(10);
		this.add(text1);
		
		text2 = new JTextField("enter text here");
		this.add(text2);
		
		text3 = new JTextField("uneditable", 20);
		text3.setEditable(false);
		this.add(text3);
		
		passwordField = new JPasswordField("mypass");
		this.add(passwordField);
		
		text1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, String.format("Text1: %s", event.getActionCommand()));
			}
		});
		text2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, String.format("Text2: %s", event.getActionCommand()));
			}
		});
		text3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, String.format("Text3: %s", event.getActionCommand()));
			}
		});
		passwordField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, String.format("PWD: %s", event.getActionCommand()));
			}
		});
	}
	
	public static void main(String[] args) {
		JframeTest jt = new JframeTest();
		jt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jt.setSize(275, 180);
		jt.setVisible(true);
	}

}
