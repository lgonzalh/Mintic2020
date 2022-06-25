/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author luis
 */
public class Operaciones {
    public static void main(String[] args){
       int resultado;
       double resultado1;
       //Instanciar objetos
       Opera op1=new Opera();
       //Asignar valores a los atributos del objeto
       op1.a=34;
       op1.b=24;
       //Llamar metodos
       resultado=op1.suma(op1.a,op1.b);
       System.out.println("La suma de dos numeros es: "+resultado);
       resultado=op1.resta(op1.b,op1.a);
       System.out.println("La resta de dos numeros es: "+resultado);
       resultado=op1.resta(op1.a,op1.b);
       System.out.println("La resta de dos numeros inv es: "+resultado);       
       resultado=op1.multiplicar(op1.a,op1.b);
       System.out.println("La multiplicacion de dos numeros es: "+resultado); 
       resultado1=op1.dividir(op1.b,op1.a);
       System.out.println("La division de dos numeros es: "+resultado1);
       resultado1=op1.dividir(op1.a,op1.b);
       System.out.println("La division de dos numeros inv es: "+resultado1);    
    }
    
}
