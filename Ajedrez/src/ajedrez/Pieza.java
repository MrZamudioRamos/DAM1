package ajedrez;

public abstract class Pieza {

    private String color;
    private String nombre;
    private String posicion;
    private boolean enJuego;

    public Pieza() {

    }

    public Pieza(String color, String nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEnJuego() {
        return enJuego;
    }

    public abstract String figuraPieza();

    @Override
    public String toString() {
        return "Pieza{" + "color=" + color + ", nombre=" + nombre + ", posicion=" + posicion + ", enJuego=" + enJuego + '}';
    }

}
