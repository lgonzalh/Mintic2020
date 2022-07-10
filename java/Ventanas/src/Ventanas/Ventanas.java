/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import javax.swing.JFrame;

/**
 *
 * @author luis
 */
public class Ventanas extends JFrame{
    public Ventanas(){
        this.setSize(600, 600);
        setTitle("Mi primer ventana- Titulo");
        setLocation(600,20);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
