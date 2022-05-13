/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_03_01;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
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
public class Bandera extends JFrame{

    private JPanel jPanel1;
    private JPanel jPanelBandera;
    private List<JLabel> jLabelList;
    private List<JLabel> jLabelBanderaList;
    
    
   public Bandera(String title) {
        super(title);
        this.setSize(250, 200);
        this.setLocation(800, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }

   public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarBandera();
        this.iniciarEtiquetas();
   }
   
   public void iniciarPanel(){
       this.jPanel1 = new JPanel();
       this.jPanel1.setBackground(Color.LIGHT_GRAY);
       this.jPanel1.setBorder(BorderFactory.createTitledBorder("Bandera de Noruega"));
       this.jPanel1.setLayout(new BorderLayout());
   }
   
   public void iniciarEtiquetas(){
       this.jLabelList = new ArrayList<>();
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       this.jLabelList.add(new JLabel());
       
       this.jLabelList.get(0).setBackground(Color.YELLOW);
       this.jLabelList.get(0).setOpaque(true);
       this.jLabelList.get(0).setText("                             Norte");
       this.jLabelList.get(0).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
       this.jLabelList.get(0).setBorder(new EmptyBorder(8, 8, 8, 8));
       
       this.jLabelList.get(1).setBackground(Color.ORANGE);
       this.jLabelList.get(1).setOpaque(true);
       this.jLabelList.get(1).setText("                              Sur");
       this.jLabelList.get(1).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
       this.jLabelList.get(1).setBorder(new EmptyBorder(8, 8, 8, 8));
       
       this.jLabelList.get(2).setBackground(Color.BLUE);
       this.jLabelList.get(2).setOpaque(true);
       this.jLabelList.get(2).setText("Este ");
       this.jLabelList.get(2).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
       this.jLabelList.get(2).setBorder(new EmptyBorder(10, 10, 10, 10));
       
       this.jLabelList.get(3).setBackground(Color.CYAN);
       this.jLabelList.get(3).setOpaque(true);
       this.jLabelList.get(3).setText("Centro");
       this.jLabelList.get(3).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
       this.jLabelList.get(3).setBorder(new EmptyBorder(10, 10, 10, 10));
       
       this.jLabelList.get(4).setBackground(Color.GREEN);
       this.jLabelList.get(4).setOpaque(true);
       this.jLabelList.get(4).setText("Oeste");
       this.jLabelList.get(4).setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
       this.jLabelList.get(4).setBorder(new EmptyBorder(10, 10, 10, 10));
       
       this.jPanel1.add(this.jLabelList.get(0),BorderLayout.NORTH);
       this.jPanel1.add(this.jLabelList.get(1),BorderLayout.SOUTH);
       this.jPanel1.add(this.jLabelList.get(2),BorderLayout.EAST);
       this.jPanel1.add(this.jPanelBandera,BorderLayout.CENTER);
       this.jPanel1.add(this.jLabelList.get(4),BorderLayout.WEST);
       
   }
   
   public void iniciarBandera(){
       this.jPanelBandera = new JPanel();
       this.jPanelBandera.setLayout(new GridLayout(6,6));
       
       this.jLabelBanderaList = new ArrayList<>();
       for(var i=0;i<60;i++)
       this.jLabelBanderaList.add(new JLabel());
     
       this.jLabelBanderaList.get(0).setBackground(Color.RED);
       this.jLabelBanderaList.get(0).setOpaque(true);
       this.jLabelBanderaList.get(1).setBackground(Color.RED);
       this.jLabelBanderaList.get(1).setOpaque(true);
       this.jLabelBanderaList.get(2).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(2).setOpaque(true);
       this.jLabelBanderaList.get(3).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(3).setOpaque(true);
       this.jLabelBanderaList.get(4).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(4).setOpaque(true);
       this.jLabelBanderaList.get(5).setBackground(Color.RED);
       this.jLabelBanderaList.get(5).setOpaque(true);
       this.jLabelBanderaList.get(6).setBackground(Color.RED);
       this.jLabelBanderaList.get(6).setOpaque(true);
       this.jLabelBanderaList.get(7).setBackground(Color.RED);
       this.jLabelBanderaList.get(7).setOpaque(true);
       this.jLabelBanderaList.get(8).setBackground(Color.RED);
       this.jLabelBanderaList.get(8).setOpaque(true);
       this.jLabelBanderaList.get(9).setBackground(Color.RED);
       this.jLabelBanderaList.get(9).setOpaque(true);
       this.jLabelBanderaList.get(10).setBackground(Color.RED);
       this.jLabelBanderaList.get(10).setOpaque(true);
       this.jLabelBanderaList.get(11).setBackground(Color.RED);
       this.jLabelBanderaList.get(11).setOpaque(true);
       this.jLabelBanderaList.get(12).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(12).setOpaque(true);
       this.jLabelBanderaList.get(13).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(13).setOpaque(true);
       this.jLabelBanderaList.get(14).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(14).setOpaque(true);
       this.jLabelBanderaList.get(15).setBackground(Color.RED);
       this.jLabelBanderaList.get(15).setOpaque(true);
       this.jLabelBanderaList.get(16).setBackground(Color.RED);
       this.jLabelBanderaList.get(16).setOpaque(true);
       this.jLabelBanderaList.get(17).setBackground(Color.RED);
       this.jLabelBanderaList.get(17).setOpaque(true);
       this.jLabelBanderaList.get(18).setBackground(Color.RED);
       this.jLabelBanderaList.get(18).setOpaque(true);
       this.jLabelBanderaList.get(19).setBackground(Color.RED);
       this.jLabelBanderaList.get(19).setOpaque(true);
        this.jLabelBanderaList.get(20).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(20).setOpaque(true);
       this.jLabelBanderaList.get(21).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(21).setOpaque(true);
       this.jLabelBanderaList.get(22).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(22).setOpaque(true);
       this.jLabelBanderaList.get(23).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(23).setOpaque(true);
       this.jLabelBanderaList.get(24).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(24).setOpaque(true);
       this.jLabelBanderaList.get(25).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(25).setOpaque(true);
       this.jLabelBanderaList.get(26).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(26).setOpaque(true);
       this.jLabelBanderaList.get(27).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(27).setOpaque(true);
       this.jLabelBanderaList.get(28).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(28).setOpaque(true);
       this.jLabelBanderaList.get(29).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(29).setOpaque(true);
       this.jLabelBanderaList.get(30).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(30).setOpaque(true);
       this.jLabelBanderaList.get(31).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(31).setOpaque(true);
       this.jLabelBanderaList.get(32).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(32).setOpaque(true);
       this.jLabelBanderaList.get(33).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(33).setOpaque(true);
       this.jLabelBanderaList.get(34).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(34).setOpaque(true);
       this.jLabelBanderaList.get(35).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(35).setOpaque(true);
       this.jLabelBanderaList.get(36).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(36).setOpaque(true);
       this.jLabelBanderaList.get(37).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(37).setOpaque(true);
       this.jLabelBanderaList.get(38).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(38).setOpaque(true);
       this.jLabelBanderaList.get(39).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(39).setOpaque(true);
       this.jLabelBanderaList.get(40).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(40).setOpaque(true);
       this.jLabelBanderaList.get(41).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(41).setOpaque(true);
       this.jLabelBanderaList.get(42).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(42).setOpaque(true);
       this.jLabelBanderaList.get(43).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(43).setOpaque(true);
       this.jLabelBanderaList.get(44).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(44).setOpaque(true);
       this.jLabelBanderaList.get(45).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(45).setOpaque(true);
       this.jLabelBanderaList.get(46).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(46).setOpaque(true);
       this.jLabelBanderaList.get(47).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(47).setOpaque(true);
       this.jLabelBanderaList.get(48).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(48).setOpaque(true);
       this.jLabelBanderaList.get(49).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(49).setOpaque(true);
       this.jLabelBanderaList.get(50).setBackground(Color.RED);
       this.jLabelBanderaList.get(50).setOpaque(true);
       this.jLabelBanderaList.get(51).setBackground(Color.RED);
       this.jLabelBanderaList.get(51).setOpaque(true);
       this.jLabelBanderaList.get(52).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(52).setOpaque(true);
       this.jLabelBanderaList.get(53).setBackground(Color.BLUE);
       this.jLabelBanderaList.get(53).setOpaque(true);
       this.jLabelBanderaList.get(54).setBackground(Color.WHITE);
       this.jLabelBanderaList.get(54).setOpaque(true);
       this.jLabelBanderaList.get(55).setBackground(Color.RED);
       this.jLabelBanderaList.get(55).setOpaque(true);
       this.jLabelBanderaList.get(56).setBackground(Color.RED);
       this.jLabelBanderaList.get(56).setOpaque(true);
       this.jLabelBanderaList.get(57).setBackground(Color.RED);
       this.jLabelBanderaList.get(57).setOpaque(true);
       this.jLabelBanderaList.get(58).setBackground(Color.RED);
       this.jLabelBanderaList.get(58).setOpaque(true);
       this.jLabelBanderaList.get(59).setBackground(Color.RED);
       this.jLabelBanderaList.get(59).setOpaque(true);
       
//    
         for(var i=0;i<60;i++)
           this.jPanelBandera.add(this.jLabelBanderaList.get(i));
          
   }

}
