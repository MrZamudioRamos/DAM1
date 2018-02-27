package ajedrez;

/**
 *
 * @author Ricardo
 */
public class Alfil extends Pieza {

    String pieza;

    public Alfil(String pieza) {
        this.pieza = pieza;
    }

    public Alfil(String pieza, String color, String nombre) {
        super(color, nombre);
        this.pieza = pieza;
    }
    
    public boolean puedeMoverse(Movimiento mov) {
        boolean puedeMoverse = false;

        if (mov.movAlfil()) {
            puedeMoverse = true;
        }
        return puedeMoverse;
    }

    @Override
    public String figuraPieza() {
        if (this.getColor().compareToIgnoreCase("blanca") == 0) {
            pieza = "2657";
        } else {
            pieza = "265D";
        }
        return pieza;
    }
}
