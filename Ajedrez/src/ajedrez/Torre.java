package ajedrez;

/**
 *
 * @author Ricardo
 */
public class Torre extends Pieza {

    String pieza;

    public Torre(String pieza) {
        this.pieza = pieza;
    }

    public Torre(String pieza, String color, String nombre) {
        super(color, nombre);
        this.pieza = pieza;
    }

    public boolean puedeMoverse(Movimiento mov) {
        boolean puedeMoverse = false;

        if (mov.movTorreHorizontal() || mov.movTorreVertical()) {
            puedeMoverse = true;
        }
        return puedeMoverse;
    }

    @Override
    public String figuraPieza() {
        if (this.getColor().compareToIgnoreCase("blanca") == 0) {
            pieza = "2656";
        } else {
            pieza = "265C";
        }
        return pieza;
    }

}
