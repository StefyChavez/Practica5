/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
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
public class Ventana_3 extends JFrame {

    private JPanel jPanel1;
    private List<JLabel> jLabelList;
   
    
    public Ventana_3(String title) throws HeadlessException {
        super(title);
         this.setSize(350, 100);
        this.setLocation(400, 400);
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
        this.jPanel1.setBorder(BorderFactory.createTitledBorder("Tercera Ventana"));
        this.jPanel1.setLayout(new FlowLayout());
          
    }
   
        public void iniciarEtiquetas(){
            this.jLabelList =new ArrayList<>();
            this.jPanel1.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            this.jLabelList.add(new JLabel());
            
            //Panel 0
            this.jLabelList.get(0).setBackground(Color.YELLOW);
            this.jLabelList.get(0).setOpaque(true);
            this.jLabelList.get(0).setText("  Amarillo");
            this.jLabelList.get(0).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(0));
            
            //Panel 1
            this.jLabelList.get(1).setBackground(Color.WHITE);
            this.jLabelList.get(1).setOpaque(true);
            this.jLabelList.get(1).setText(" Blanco");
            this.jLabelList.get(1).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(1));
            
            //Panel 2
            this.jLabelList.get(2).setBackground(Color.MAGENTA);
            this.jLabelList.get(2).setOpaque(true);
            this.jLabelList.get(2).setText("   Magenta");
            this.jLabelList.get(2).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(2));
            
            //Panel 3
            this.jLabelList.get(3).setBackground(Color.GREEN);
            this.jLabelList.get(3).setOpaque(true);
            this.jLabelList.get(3).setText("  Verde");
            this.jLabelList.get(3).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(3));
            
            //Panel 4
            this.jLabelList.get(4).setBackground(Color.CYAN);
            this.jLabelList.get(4).setOpaque(true);
            this.jLabelList.get(4).setText("  Celeste");
            this.jLabelList.get(4).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            this.jPanel1.add(this.jLabelList.get(4));
         
       
        }
}
