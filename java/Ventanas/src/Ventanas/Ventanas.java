/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author luis
 */
public class Ventanas extends JFrame{
    public Ventanas(){
        this.setSize(600, 600);
        setTitle("Java - MisionTic 2020 - Programacion orientada a Objetos");
        //setLocation(600,20);
        setLocationRelativeTo(null);
        setMinumumSize(new Dimension(200,200));
        this.getContentPane().setBackground(Color.red);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void setMinumumSize(Dimension dimension) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
