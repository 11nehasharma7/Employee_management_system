/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author JSHARMA
 */
public class Welcome_Page extends JFrame implements ActionListener{
    JButton proff,workers,stud;
    Welcome_Page(){
        
        proff = new JButton("PROFESSOR");
        proff.setBounds(490, 120, 130, 30);
        proff.setBackground(Color.WHITE);
        proff.setForeground(Color.BLACK);
        proff.addActionListener(this);
        add(proff);
        
        workers = new JButton("WORKER");
        workers.setBounds(490, 170, 130, 30);
        workers.setBackground(Color.WHITE);
        workers.setForeground(Color.BLACK);
        workers.addActionListener(this);
        add(workers);
        
        stud = new JButton("STUDENT");
        stud.setBounds(490, 220, 130, 30);
        stud.setBackground(Color.WHITE);
        stud.setForeground(Color.BLACK);
        stud.addActionListener(this);
        add(stud);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/cms.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(700, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 700, 400);
        add(image);
        
        setSize(700, 400);
        setLocation(450, 200);
        setVisible(true);
    }
    public static void main(String[] args){
        new Welcome_Page();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==proff){
            setVisible(false);
            new Home();
        }
        else if(e.getSource()==workers){
            setVisible(false);
            new Worker_ms();
        }
        else if(e.getSource()==stud){
            setVisible(false);
        }
    }
}
