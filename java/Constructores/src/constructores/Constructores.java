/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructores;

/**
 *
 * @author luis
 */
public class Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleados emple1=new Empleados("Luis Antonio", "Gonzalez H.", "79862885", "Director",4000000);
        
        /*emple1.nombre="Luis Antonio";
        emple1.apellidos="Gonzalez H.";
        emple1.cedula="79862885";
        emple1.cargo="Director";
        emple1.sueldo=4000000;*/
        
        emple1.VerDatos();
            }
    
}
