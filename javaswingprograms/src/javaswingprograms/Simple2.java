package javaswingprograms;

import javax.swing.*;  
public class Simple2 extends JFrame{ 
private static final long serialVersionUID = 1L;
JFrame f;  
Simple2(){  
JButton b=new JButton("click");
b.setBounds(130,100,100, 40);  
          
add(b);  
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
new Simple2();  
}}