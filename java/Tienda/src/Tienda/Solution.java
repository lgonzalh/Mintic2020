package Tienda;

import java.util.ArrayList;
public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static Object[] reportes(ArrayList <Cliente> tienda){
        //EN ESTE ESPACIO PONER SU LÓGICA
        double sumaTotal = 0;
        int menorCosto = Integer.MAX_VALUE;
        int mayorCosto = Integer.MIN_VALUE;
        String nombreClienteMayorGasto = "";
        String nombreClienteMenorGasto = "";
        
        for (Cliente recorrido:tienda){
            
            if(recorrido.getTotalAPagar() < menorCosto){
                menorCosto = recorrido.getTotalAPagar();
                nombreClienteMenorGasto = recorrido.getNombreCompleto();
            }
            
            if(recorrido.getTotalAPagar() > mayorCosto){
                mayorCosto = recorrido.getTotalAPagar();
                nombreClienteMayorGasto = recorrido.getNombreCompleto();
            }
            
            sumaTotal += recorrido.getTotalAPagar();
        }
        
        double promedio = sumaTotal / tienda.size();
        
        Object[] valores ={promedio, nombreClienteMenorGasto, menorCosto, nombreClienteMayorGasto, mayorCosto};
        
        return valores;        
    }
}