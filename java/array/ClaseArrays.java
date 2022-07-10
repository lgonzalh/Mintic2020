//[01, 02, 03, 04,05, 06, 07, 08, 09, 10, 11, 12, 13]
//[19, 22, 21, 25,32, 38, 16, 31, 30, 26, 19, 17, 23]
//System.out.println(numeros[3] + numeros[7]);
//System.out.println(numeros[6] / numeros[5]);
//Se cambian los valores de algunos elementos del array
//  numeros[7] = -14;
//  numeros[3] = numeros[2] * numeros[1];
//Se imprimen acceden los nuevos valores
//  System.out.println(numeros[7]);
//  System.out.println(numeros[3]);
//importamos libreria funciones con Arrays
import java.util.Arrays;

public class ClaseArrays {
    /**
     * @param args
     */
    public static void main(String[] args) {
//Se declara y crea el array
    int[] numeros = new int[13];
    int max, min;
    max=min=numeros[0];
//Se asignan valores a (inicializan) los elementos del array
    numeros[0] = 19;
    numeros[1] = 22;
    numeros[2] = 21;
    numeros[3] = 25;
    numeros[4] = 32;
    numeros[5] = 38;
    numeros[6] = 16;
    numeros[7] = 31;
    numeros[8] = 30;
    numeros[9] = 26;
    numeros[10] = 19;
    numeros[11] = 17;
    numeros[12] = 23;

    //System.out.println("Array: "+numeros);
//Se acceden los elementos del array
    for (int i = 0; i < numeros.length; i++) {
        //Ordena el Array
        Arrays.sort(numeros);
        if(numeros[i]>max){
            max=numeros[i];
        }
        min=numeros[0];
        System.out.println(numeros[i]);
    }

    System.out.println("\nLargo:"+numeros.length);
    System.out.println("Valor Maximo = "+max+"\nValor Minimo = "+min);
    
    }
}