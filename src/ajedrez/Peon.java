package ajedrez;

/**
 *
 * @author Ricardo
 */

public class Peon extends Pieza {

    private int valor = 1;
    private boolean esPrimerMovimiento;

    public Peon() {
        
    }

    public Peon(char color, char nombre, boolean esPrimerMoviemiento) {
        
        super(color, nombre);
        
        this.esPrimerMovimiento = esPrimerMoviemiento;
        
    } 
    
    public int getValor() {
        
        return valor;
        
    }

    @Override
    public boolean movimientoValido(Movimiento mov) {
        return false;
        
    }

}
