/**
 * Vamos a crear objetos y vamos a corre un aplicativo de notas
 **/
package encapsular;

/**
 *
 * @author cesar augusto guerrero mateus
 * 30/06/22
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aqui vamos a instaciar un objeto
        Alumno alu1=new Alumno();
        alu1.setDocumento("1012344566");
        alu1.setNombre("Luis Arturo");
        alu1.setApellidos("Soto Prieto");
        alu1.setCarrera("Desarrollo de Software");
        alu1.setSemestre("V");
        alu1.getDocumento();
        alu1.getNombre();
        alu1.getApellidos();
        alu1.getCarrera();
        alu1.getSemestre();
        
        System.out.println("\nDatos Personales");
        System.out.println("El número de documento es "+alu1.getDocumento()+" El nombre del alumno es "+ alu1.getNombre() +" "+alu1.getApellidos());
        System.out.println("La carrera a la que pertenece el alumno es "+alu1.carrera  +" Y el semestre es "+alu1.semestre);
        alu1.verDatos();
    }
    
}
