/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Student_ms extends JFrame implements ActionListener{

    JButton view, add, update, remove;
    
    Student_ms() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3); 
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Student Management System");
        heading.setBounds(620, 20, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(heading);
        
        add = new JButton("Add Student");
        add.setBounds(650, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Student");
        view.setBounds(820, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
        update = new JButton("Update Student");
        update.setBounds(650, 140, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
        remove = new JButton("Remove Student");
        remove.setBounds(820, 140, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddStudent();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewStudent();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewStudent();
        } else {
            setVisible(false);
            new RemoveStudent();
        }
    }

    public static void main(String[] args) {
        new Student_ms();
    }
}
