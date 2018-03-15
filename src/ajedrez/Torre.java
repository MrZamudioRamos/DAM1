package ajedrez;

/**
 *
 * @author Ricardo
 */
public class Torre extends Pieza {

    String pieza;
    double valor = 5.5;

    public Torre(String pieza) {
        this.pieza = pieza;
    }

    public Torre(String pieza, char color, char nombre) {
        super(color, nombre);
        this.pieza = pieza;
    }
    
    public double getValor(){
        return valor;
    }

    public boolean puedeMoverse(Movimiento mov) {
        boolean puedeMoverse = false;

        if (mov.movTorreHorizontal() || mov.movTorreVertical()) {
            puedeMoverse = true;
        }
        return puedeMoverse;
    }

    @Override
    public boolean movimientoValido(Movimiento mov) {
        return false;
    }


}
