/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author admin
 */
public class Ventana_1 extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabelList;

    public Ventana_1(String title) {
        super(title);
        this.setSize(200, 150);
        this.setLocation(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
        
    }
    
    
    public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
     
        
    }
    public void iniciarPanel(){
        this.jPanel1 = new JPanel();
         this.jPanel1.setBackground(Color.LIGHT_GRAY);
         this.jPanel1.setBorder(BorderFactory.createTitledBorder("Primera Ventana"));
         this.jPanel1.setLayout(new BorderLayout());
    }
   
        public void iniciarEtiquetas(){
            this.jLabelList =new ArrayList<>();
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            
           
            //Panel 0 en la parte norte
            this.jLabelList.get(0).setBackground(Color.ORANGE);
            this.jLabelList.get(0).setOpaque(true);
            this.jLabelList.get(0).setText("                           1 ");
            this.jLabelList.get(0).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(0),BorderLayout.NORTH);
            this.jLabelList.get(0).setBorder(new EmptyBorder(5, 5, 5, 5));
            
            //Panel 1 en la parte sur
            this.jLabelList.get(1).setBackground(Color.BLUE);
            this.jLabelList.get(1).setOpaque(true);
            this.jLabelList.get(1).setText("                           2 ");
            this.jLabelList.get(1).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(1),BorderLayout.SOUTH);
            this.jLabelList.get(1).setBorder(new EmptyBorder(5, 5, 5, 5));
            
            //Panel 2 en la parte Este
            this.jLabelList.get(2).setBackground(Color.RED);
            this.jLabelList.get(2).setOpaque(true);
            this.jLabelList.get(2).setText("      4 ");
            this.jLabelList.get(2).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(2),BorderLayout.EAST);
            this.jLabelList.get(2).setBorder(new EmptyBorder(10, 10, 10, 10));
            
            //Panel 3 en la parte Oeste
            this.jLabelList.get(3).setBackground(Color.YELLOW);
            this.jLabelList.get(3).setOpaque(true);
            this.jLabelList.get(3).setText("      3 ");
            this.jLabelList.get(3).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(3),BorderLayout.WEST);
            this.jLabelList.get(3).setBorder(new EmptyBorder(10, 10, 10, 10));
            
            //Panel 4 en la parte central
            this.jLabelList.get(4).setBackground(Color.WHITE);
            this.jLabelList.get(4).setOpaque(true);
            this.jLabelList.get(4).setText("          5 ");
            this.jLabelList.get(4).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(4),BorderLayout.CENTER);
            this.jLabelList.get(4).setBorder(new EmptyBorder(5, 5, 5, 5));
            
        }

}
