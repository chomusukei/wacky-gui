/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Menu.Burger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class MainFrame 
{   
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    
    Icon burger = new ImageIcon();
    JFrame frame1 = new JFrame();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    
    JTabbedPane tab = new JTabbedPane();
    
    JButton but1 = new JButton();
    JButton but2 = new JButton();
    JButton but3 = new JButton();
    JButton but4 = new JButton();
    
    Burger burgeq = new Burger();
    
    int choices;
    
    public void mainW()
    {   
        text1.setText("WACK-A-BEEF BURGER");
        text2.setText("You ordered WACK-A-BEEF");
                
        panel1.setLayout(null);
        panel2.setLayout(null);
        
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame1.setResizable(false);        
        
        frame1.setSize(500, 500);
        
        text1.setBounds(180, 0, 300, 100);
        text1.setEditable(false);
        text1.setBorder(null);
        text1.setOpaque(false);
        
        text2.setBounds(170, 360, 300, 100);
        text2.setEditable(false);
        text2.setBorder(null);
        text2.setOpaque(false);
        
        but1.setBounds(20, 20, 150, 150);
        
        /*If you dont have the icon, remove this line.
          If you want to have picture, download any png file from the internet,
          then drag and drop it into the same package as this Class.
        */
        but1.setIcon(new ImageIcon(Class.class.getResource("/Frame/burger2.png")));
        
        
        but2.setBounds(20, 200, 150, 150);
        
        /*If you dont have the icon, remove this line.
          If you want to have picture, download any png file from the internet,
          then drag and drop it into the same package as this Class.
        */
        but2.setIcon(new ImageIcon(Class.class.getResource("/Frame/chicken2.png")));
        
        panel1.setSize(400,400);
        panel1.add(text1);
        panel1.add(text2);
        panel1.add(but2);
        panel1.add(but1);    
        
        but3.setBounds(20, 20, 150, 150);
        but4.setBounds(20, 200, 150, 150);
        
        panel2.setSize(400,400);
        panel2.add(but3);
        panel2.add(but4);
        
        frame1.add(tab);
        tab.addTab("Burger", panel1);
        tab.addTab("Water", panel2);       
        
    }
    
    public void testrun()throws IOException,Exception
    {
       frame1.setUndecorated(true);
       frame1.setLocationRelativeTo(null);
       text1.setVisible(true);
       text2.setVisible(false);
       frame1.setVisible(true);   
       
       but1.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                choices = 2;
                try {
                    burgeq.burger(choices);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                text2.setVisible(true);
                System.out.println("Do Something Clicked");
            }
        });
        
        but2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                choices = 1;
                try {
                    burgeq.burger(choices);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Do Something Clicked");
            }
        });
    }

}
