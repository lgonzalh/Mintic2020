/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosgetyset;

/**
 *
 * @author luis
 */
public class MetodosGETySET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String documento, String nombre, String apellidos, String carrera, String semestre, String celular, String email, int edad, double promedio, double matematicas, double poo, double ingles, double m1, double m2, double m3, double p1, double p2, double p3, double i1, double i2, double i3
        Alumno alu1=new Alumno("555589676","Luis A.","Gonzalez","Desarrollo Software","II","3002271061","lantonium@outlook.com",46,0,0,0,0,0,0,0,0,0,0,0,0,0);
        alu1.m1=3.3;
        alu1.m2=2.4;
        alu1.m3=3;
        alu1.p1=3.3;
        alu1.p2=2.5;
        alu1.p3=3.5;
        alu1.i1=3.6;
        alu1.i2=3.4;
        alu1.i3=3.7;
        
        alu1.getMatematicas();
        alu1.getPOO();
        alu1.getIngles();
        alu1.Calcular();
        
        System.out.println("Datos Personales");
        alu1.verDatos();
        
        alu1.setMatematicas(3.5);
        System.out.println("\nRevisando la nota final de matematicas del alumno 1, se cambio a: "+alu1.matematicas);
        alu1.Calcular();
        alu1.verDatos();
                     
        alu1.setPOO(4);
        System.out.println("\nRevisando la nota final de programacion o. bjt del alumno 1, se cambio a: "+alu1.poo);
        alu1.Calcular();
        alu1.verDatos();
        
        
    }
    
}
