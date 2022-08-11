public class Main {

    public static void main(String[] arg){

        Integer [] filaCoches = {1,2,3,4,5,9,7,8,6,4,0,3,0,2,5,6};

        ArrayList<Integer> cochesFlyPass = new ArrayList<Integer>();
        System.out.print(cochesFlyPass);

        for (int i = 0; i < filaCoches.length; i++){
            cochesFlyPass.add(-1);
        }

    }

    String[] cancionesEscogidas = new String[]{
        "Mil horas",
        "Por ese hombre",
        "A esa",
        "Algo de mi",
        "Si me dejas ahora",
        "¿Quieres ser mi amante?",
        "Quel sorriso in volto",
        "Per una notte insieme",
        "Como un pintor",
        "Sencillamente",
        "Un segundo",
        "Enciéndeme",
        "Cuando me enamoro",
        "Tu eres mi tesoro",
        "Piccola anima",
        "Solo a ti pertenezco",
        "Todos por todos"
    };
    
    /*ReproductorMusica ventana1 = new ReproductorMusica(cancionesEscogidas);
    System.out.println(ventana1);*/
}

