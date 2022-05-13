/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class Ventana_2 extends JFrame {
     private JPanel jPanel1;
    private List<JLabel> jLabelList;

    public Ventana_2 (String title) {
        super(title);
        this.setSize(300, 200);
        this.setLocation(450, 100);
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
         this.jPanel1.setBorder(BorderFactory.createTitledBorder("Segunda Ventana"));
         this.jPanel1.setLayout(new GridLayout(3,2));
          
    }
   
        public void iniciarEtiquetas(){
            this.jLabelList =new ArrayList<>();
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            
            //Panel 0 
            this.jLabelList.get(0).setBackground(Color.BLUE);
            this.jLabelList.get(0).setOpaque(true);
            this.jLabelList.get(0).setText("              Piscis");
            this.jLabelList.get(0).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(0));
            
            //Panel 1 en la parte central
            this.jLabelList.get(1).setBackground(Color.WHITE);
            this.jLabelList.get(1).setOpaque(true);
            this.jLabelList.get(1).setText("              Acuario");
            this.jLabelList.get(1).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(1));
            
            //Panel 2 en la parte central
            this.jLabelList.get(2).setBackground(Color.RED);
            this.jLabelList.get(2).setOpaque(true);
            this.jLabelList.get(2).setText("              Tauro");
            this.jLabelList.get(2).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(2));
            
            //Panel 3 en la parte central
            this.jLabelList.get(3).setBackground(Color.CYAN);
            this.jLabelList.get(3).setOpaque(true);
            this.jLabelList.get(3).setText("              Geminis");
            this.jLabelList.get(3).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(3));
            

            //Panel 4 en la parte central
            this.jLabelList.get(4).setBackground(Color.ORANGE);
            this.jLabelList.get(4).setOpaque(true);
            this.jLabelList.get(4).setText("              Leo");
            this.jLabelList.get(4).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(4));
        }
}
