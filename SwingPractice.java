/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
        
public class SwingPractice {

    public static void main(String[] args) {
       JFrame frame=new JFrame("Window");
       frame.setSize(400,300);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(new FlowLayout());
       
       JLabel name=new JLabel("Username");
       frame.add(name);
       
       JTextField txt1=new JTextField(10);
       frame.add(txt1);
       
       JLabel password=new JLabel("Password");
       frame.add(password);
       
       JTextField txt2=new JTextField(10);
       frame.add(txt2);
       
       JButton submit=new JButton("Submit");
       frame.add(submit);
       
       JLabel result=new JLabel("Result");
       frame.add(result);
       
       submit.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
           String name=txt1.getText();
           String password=txt2.getText();
           
       }});
       
       frame.setVisible(true);
    }
    
}
