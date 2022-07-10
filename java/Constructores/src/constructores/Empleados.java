/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores;

/**
 *
 * @author luis
 */
public class Empleados {
    String nombre, apellidos, cargo, cedula;
    int sueldo;
    
    Empleados(String nom, String ape, String ced, String car,int suel){
        nombre=nom;
        apellidos=ape;
        cedula=ced;
        cargo=car;
        sueldo=suel;
    }
    
    void VerDatos(){
        
        System.out.println("El nombre del empleado es: "+nombre +" "+apellidos);
        System.out.println("La cedula del empleado es: "+cedula);
        System.out.println("El cargo del empleado es: "+cargo +" y su salario "+sueldo);
    }
}
