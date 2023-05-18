package javaswingprograms;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JFrame;

public class PasswordFieldExample {
	public static void main(String[] args) {
		JFrame f=new JFrame("password field example");
		JLabel l=new JLabel("password:");
		JPasswordField value= new JPasswordField();
		l.setBounds(20,100, 80,30);
		value.setBounds(100,100,100,30);
		f.add(value);f.add(l);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
}
