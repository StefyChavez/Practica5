/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_03_01;

/**
 *
 * @author admin
 */
public class Ejercicio_03_01 {

    public static void main(String[] args) {
        
        var panel1= new Ventana_1("Numeros");
        panel1.setVisible(true);
        var panel2= new Ventana_2("Signos Zodiacales");
        panel2.setVisible(true);
        var panel3= new Ventana_3("Colores");
        panel3.setVisible(true);
        var panel4=new Bandera("Puntos Cardinales");
        panel4.setVisible(true);
    }
}
