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
public class Moto {
    //Aqui voy a crea los atributos de la moto
    String marca, modelo, color;
    int precio, llantas;
    
    
    //Aqui vamos a crear los diferentes metodos de la moto
    
    void EncenderMoto(String marka){
        System.out.println("La moto "+ marka +" ha encendido");
    }
    void ArrancarMoto(String marka){
        System.out.println("La moto"+ marka +"ha arrancado");
    }
    void AcelerarMoto(String marka,int velocidad) throws InterruptedException{
        for(int i=0; i<=velocidad; i+=2) {
            System.out.println("La moto de marca "+ marka + " ha acelerado hasta: "+ i + " km/h");
            Thread.sleep(125);
        }
        
    }
    void FrenarMoto(String marka, int frenado) throws InterruptedException{
        for(int j=frenado; j>-1; j=j-2){
            System.out.println("La moto de marca "+ marka + " esta frenando a: "+ j + " km/h");
            Thread.sleep(100);
        }
        
    }
    void PararMoto(){
        System.out.println("la moto se ha detenido");
    }
    void ApagarMoto(){
        System.out.println("La moto se ha apagado");
    }
}
