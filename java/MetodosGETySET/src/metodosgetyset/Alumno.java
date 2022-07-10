/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosgetyset;

/**
 *
 * @author luis
 */
public class Alumno {
    String documento, nombre, apellidos, carrera, semestre, celular, email;
    int edad;
    double promedio, matematicas, poo, ingles, m1, m2, m3, p1, p2, p3,i1,i2,i3;

    public Alumno(String documento, String nombre, String apellidos, String carrera, String semestre, String celular, String email, int edad, double promedio, double matematicas, double poo, double ingles, double m1, double m2, double m3, double p1, double p2, double p3, double i1, double i2, double i3) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.semestre = semestre;
        this.celular = celular;
        this.email = email;
        this.edad = edad;
        this.promedio = promedio;
        this.matematicas = matematicas;
        this.poo = poo;
        this.ingles = ingles;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }
    
    String getDocumento(){
        return this.documento;
    }
    String getNombre(){
        return this.nombre;
    }
    String getApellidos(){
        return this.apellidos;
    }
    String getCarrera(){
        return this.carrera;
    }
    String getSemestre(){
        return this.semestre;
    }
    String getCelular(){
        return this.celular;
    }
    String getEmail(){
        return this.email;
    }
    int getEdad(){
        return this.edad;
    }
    double getMatematicas(){
        return this.matematicas=(m1+m2+m3)/3;
    }
    double getPOO(){
        return this.poo=(p1+p2+p3)/3;
    }    
    double getIngles(){
        return this.ingles=(i1+i2+i3)/3;
    }      
    void setDocumento(String Doc){
        this.documento=Doc;
    }
    void setNombre(String Nom){
        this.nombre=Nom;
    }
    void set(String Nom){
        this.nombre=Nom;
    }
    void setMatematicas(double Mat){
        this.matematicas=Mat;
    }
    void setPOO(double Poo){
        this.poo=Poo;
    }
    void setIngles(double Ing){
        this.ingles=Ing;
    }
    //Metodo para calcular el promedio de notas del alumno semestre
    double Calcular(){
        return promedio=(matematicas+poo+ingles)/3;
    }
        
    void verDatos(){
        System.out.println("\nLos datos del alumno son:");
        System.out.println("Nombre completo: "+ nombre +" "+apellidos+", Documento: "+documento);
        System.out.println("Carrera: "+carrera+" , Semestre: "+semestre);
        System.out.println("Celular: "+celular+" , Email: "+email);
        
        System.out.println("\nDatos Academicos");
        System.out.println("Nota matematicas final: "+matematicas);
        System.out.println("Nota programacion final: "+poo);
        System.out.println("Nota ingles final: "+ingles);
        System.out.println("Nota promedio final: "+promedio);
    }
}
