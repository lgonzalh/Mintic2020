/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosmoto;

/**
 *
 * @author cesarguerreromateus
 */
public class MetodosMoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        // Aqui vamos a instanciar un objeto o crearlo
        Moto moto1=new Moto();
        Moto moto2=new Moto();
        
        //Aqui vamos a asignaar los atributos al objeto
        moto1.marca="KTM";
        moto1.modelo="2021";
        System.out.println("\nLos datos de la moto son");
        System.out.println("Su marca es "+ moto1.marca);
        System.out.println("El modelo de la moto es "+ moto1.modelo);
        //Aqui llamaremos las acciones que hace el objeto
        System.out.println("\nLas acciones que puede hacer la moto son\n");
        
        moto1.EncenderMoto("KTM");
        moto1.ArrancarMoto("KTM");
        moto1.AcelerarMoto("KTM",100);
        moto1.FrenarMoto(moto1.marca,100);
        moto1.PararMoto();
        moto1.ApagarMoto();
        
        //Aqui vamos a asignaar los atributos al objeto
        moto2.marca="Ducatti";
        moto2.modelo="2022";
        System.out.println("\nLos datos de la moto son");
        System.out.println("Su marca es "+ moto2.marca);
        System.out.println("el modelo de la moto es "+ moto2.modelo);
        //Aqui llamaremos las acciones que hace el objeto
        System.out.println("\nLas acciones que puede hacer la moto son\n");
        
        moto2.EncenderMoto("Ducatti");
        moto2.ArrancarMoto("Ducatti");
        moto2.AcelerarMoto(moto2.marca, 180);
        moto2.FrenarMoto(moto2.marca, 180);
        moto2.PararMoto();
        moto2.ApagarMoto();
    }
    
}
