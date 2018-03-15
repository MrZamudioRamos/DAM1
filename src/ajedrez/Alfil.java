package ajedrez;

/**
 *
 * @author Ricardo
 */
public class Alfil extends Pieza {

    String pieza;
    double valor = 3.5;

    public Alfil(String pieza) {
        this.pieza = pieza;
    }

    public Alfil(String pieza, char color, char nombre) {
        super(color, nombre);
        this.pieza = pieza;
    }
    
    public double getValor(){
        return valor;
    }
    
    public boolean puedeMoverse(Movimiento mov) {
        boolean puedeMoverse = false;

        if (mov.movAlfil()) {
            puedeMoverse = true;
        }
        return puedeMoverse;
    }

    @Override
    public boolean movimientoValido(Movimiento mov) {
        return false;
    }

}
