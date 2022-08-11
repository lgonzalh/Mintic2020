public class ReproductorMusica {

    private String[] canciones;
    private ArrayList<Integer> cancionesFavoritas;
    private boolean pausado=true;
    private int cancionReproduciendo=0;

    public ReproductorMusica(String[] canciones) {
        this.canciones = canciones;
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public String[] getCanciones() {
        return canciones;
    }

    public void setCanciones(String[] canciones) {
        this.canciones = canciones;
    }

    public Int[] getCancionesFavoritas() {
        return cancionesFavoritas;
    }

    public void setCancionesFavoritas(Int[] cancionesFavoritas) {
        this.cancionesFavoritas = cancionesFavoritas;
    }

    public boolean isPausado() {
        return pausado;
    }

    public void setPausado(boolean pausado) {
        this.pausado = pausado;
    }

    public int getCancionReproduciendo() {
        return cancionReproduciendo;
    }

    public void setCancionReproduciendo(int cancionReproduciendo) {
        this.cancionReproduciendo = cancionReproduciendo;
    }

    

public void proximaCancion(){
        this.cancionReproduciendo = this.cancionReproduciendo+1 % canciones.lenght;
}
public void devolverCancion(){
        
}
public void cambirEstadoReproduccion(){}
public void agregarCancionesFavoritas(){}

}
