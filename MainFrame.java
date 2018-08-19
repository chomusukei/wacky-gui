/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Menu.Burger;
import Logging.Logging;
import Menu.Water;
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
import javax.swing.JTextArea;

public class MainFrame 
{   
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    JTextField text4 = new JTextField();
    JTextField text5 = new JTextField();
    JTextField text6 = new JTextField();
    JTextField text7 = new JTextField();
    JTextField text8 = new JTextField();
    JTextArea logText = new JTextArea();  
    
    Icon burger = new ImageIcon();
    JFrame frame1 = new JFrame();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    
    JTabbedPane tab = new JTabbedPane();
    
    JButton but1 = new JButton();
    JButton but2 = new JButton();
    JButton but3 = new JButton();
    JButton but4 = new JButton();
    JButton logButt = new JButton("Show Log");

    Burger burgeq = new Burger();
    Water ayaq = new Water();
    Logging logt = new Logging();   
    
    int choices;
    
    public void mainW() throws Exception
    {   
        text1.setText("WACK-A-BEEF BURGER");
        text2.setText("You ordered WACK-A-BEEF");
        
        text3.setText("WACK-A-CHICKEN BURGER");
        text4.setText("You ordered WACK-A-CHICKEN");
        
        text5.setText("COCA-COLA WATER");
        text6.setText("You ordered COCA-COLA WATER");
        
        text7.setText("MINERAL WATER");
        text8.setText("You ordered MINERAL WATER");
       
        logText.setText(logt.readLog()); 
                
        panel1.setLayout(null);
        panel2.setLayout(null);
        panel3.setLayout(null);
        
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame1.setResizable(false);        
        
        frame1.setSize(500, 500);
        
        text1.setBounds(180, 0, 300, 100);
        text1.setEditable(false);
        text1.setBorder(null);
        text1.setOpaque(false);
        
        text5.setBounds(180, 0, 300, 100);
        text5.setEditable(false);
        text5.setBorder(null);
        text5.setOpaque(false);
        
        text2.setBounds(170, 360, 300, 100);
        text2.setEditable(false);
        text2.setBorder(null);
        text2.setOpaque(false);
        
        text3.setBounds(180, 180, 300, 100);
        text3.setEditable(false);
        text3.setBorder(null);
        text3.setOpaque(false);
        
        text4.setBounds(170, 360, 300, 100);
        text4.setEditable(false);
        text4.setBorder(null);
        text4.setOpaque(false);
        
        text7.setBounds(180, 180, 300, 100);
        text7.setEditable(false);
        text7.setBorder(null);
        text7.setOpaque(false);
        
        logText.setBounds(10, 50, 400, 400);
        logText.setEditable(false);
        logText.setBorder(null);
        logText.setOpaque(false);
        
        
        //Setting up button size and position.
        but1.setBounds(20, 20, 150, 150);
        but2.setBounds(20, 200, 150, 150);              
        but3.setBounds(20, 20, 150, 150);
        but4.setBounds(20, 200, 150, 150);
        logButt.setBounds(10, 10, 100, 30);
        
        /*If you dont have the icon, remove this line.
          If you want to have picture, download any png file from the internet,
          then drag and drop it into the same package as this Class.
        */
        but1.setIcon(new ImageIcon(Class.class.getResource("/Frame/burger2.png")));        
        but2.setIcon(new ImageIcon(Class.class.getResource("/Frame/chicken2.png")));
        but3.setIcon(new ImageIcon(Class.class.getResource("/Frame/coke.png")));
        but4.setIcon(new ImageIcon(Class.class.getResource("/Frame/mineral.png")));
        
        //Adding text and button to panels.
        panel1.setSize(400,400);
        panel1.add(text1);
        panel1.add(text3);
        panel1.add(text2);
        panel1.add(text4);
        panel1.add(but2);
        panel1.add(but1);   

        panel2.setSize(400,400);
        panel2.add(but3);
        panel2.add(but4);
        panel2.add(text5);
        panel2.add(text6);
        panel2.add(text7);
        
        panel3.setSize(400,400);
        panel3.add(logText);
        panel3.add(logButt);
        
        
        //Creating tab for frame
        frame1.add(tab);
        tab.addTab("Burger", panel1);
        tab.addTab("Water", panel2);
        tab.addTab("Log", panel3);
    }
    
    public void testrun()throws IOException,Exception
    {
       frame1.setUndecorated(true);
       frame1.setLocationRelativeTo(null);
       
       text1.setVisible(true);
       text2.setVisible(false);
       text4.setVisible(false);
       
       frame1.setVisible(true);   
       
       
       //Button action for Burger
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
                text4.setVisible(false);
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
                text4.setVisible(true);
                text2.setVisible(false);
                System.out.println("Do Something Clicked");
            }
        });  
        
        
        //Button action for Water
        but3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                choices = 1;
                try {
                  ayaq.water(choices);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                text4.setVisible(true);
                text2.setVisible(false);
                System.out.println("Do Something Clicked");    
                               
               /*     
                JFrame test = new JFrame();
                test.setLocationRelativeTo(null);
                frame1.setVisible(false);
                test.setSize(500, 500);
                test.setVisible(true);
                
                JButton butt = new JButton();         
                butt.setBounds(10, 10, 100, 30);
                test.add(butt);
                
                butt.addActionListener(new ActionListener()
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)
                        {
                           frame1.setVisible(true);
                           test.setVisible(false);
                        }
                  }); 
                */
            }
        }); 
        
        but4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                choices = 2;
                try {
                    ayaq.water(choices);
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                text4.setVisible(true);
                text2.setVisible(false);
                System.out.println("Do Something Clicked");
            }
        }); 
        
        logButt.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {                            
                try 
                {
                    logText.setText(logt.readLog());
                } catch (Exception ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Do Something Clicked");
            }
        });
    }

}
