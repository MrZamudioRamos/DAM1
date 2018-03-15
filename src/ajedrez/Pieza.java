package ajedrez;

public abstract class Pieza {

    private char color;
    private char nombre;
    private String posicion;
    private boolean enJuego;

    public Pieza() {
        
    }

    public Pieza(char color, char nombre) {
        this.color = color;
        this.nombre = nombre;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public boolean isEnJuego() {
        return enJuego;
    }

   public abstract boolean movimientoValido(Movimiento mov);

    @Override
    public String toString() {
        return "Pieza{" + "color=" + color + ", nombre=" + nombre + ", posicion=" + posicion + ", enJuego=" + enJuego + '}';
    }

}
