/**
 * Aqui vamos a encapsular datos del Alumno
 **/
package encapsular;

/**
 *
 * @author cesar augusto guerrero mateus
 * 30/06/22
 */
public class Alumno {
    //Aqui vamos a crear atributos del Alumno
    private String documento,nombre, apellidos, celular, email;
    protected String carrera, semestre;
    private int edad;
    private double  matematicas, poo, ingles;
    double promedio;
    double m1,m2,m3,p1,p2,p3,i1,i2,i3;
    //construir los metodos GET y SET de los atributos privados
    String getDocumento(){
        return this.documento;
    }
    String getNombre(){
        return this.nombre;
    }
    String getApellidos(){
        return this.apellidos;
    }
    void setDocumento(String Doc){
        this.documento=Doc;
    }
    void setNombre(String Nom){
        this.nombre=Nom;
    }
    void setApellidos(String Ape){
        this.apellidos=Ape;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    //Este metodo nos muestra los datos personales y academicos del alumno
    
    void verDatos(){
        System.out.println("\nLos datos del alumno son");
        System.out.println("El número de documento es "+documento+" El nombre del alumno es "+ nombre +" "+apellidos);
        System.out.println("La carrera a la que pertenece el alumno es "+ carrera +" Y el semestre es "+semestre);
        System.out.println("El celular  del alumno es "+ celular +" Y el email es "+email);
    }
    
}

