//[19,22,21,25,32,38,16,31,30,26,19,17,23]
//int[] participantes = {19,22,21,25,32,38,16,31,30,26,19,17,23};
 public class Solution{
    //ESTA CLASE NO TIENE MAIN
    
    
    public static int [] reporte(int [] participantes){
        //EN ESTE ESPACIO PONER SU LÓGICA
        int max, min;
    max=min=participantes[0];
        for (int i=0;i<participantes.length;i++) {
        if(participantes[i]<min){
            min=participantes[i];
        }
        if(participantes[i]>max){
            max=participantes[i];
        }
    }
    int[] reporte = new int[3];
    reporte[0] = participantes.length;
    reporte[1] = min;
    reporte[2] = max;
    return reporte;    
    }
}