package ajedrez;

public class Tablero {

    private Pieza tablero[][] = new Pieza[8][8];
    private boolean hayPieza;

    public Tablero() {

    }

    public Pieza[][] getTablero() {
        return tablero;
    }

    public Pieza[][] getTabla() {

        return tablero;
    }

    public void setTabla(Pieza[][] tabla) {

        this.tablero = tabla;
    }

    public boolean hayPieza(Posicion posic) {
        boolean hayPieza = true;
        if (tablero[posic.getFila()][posic.getColumna()] == null) {
            hayPieza = false;
        }
        return true;
    }

    public boolean hayPieza(int fila, int columna) {
        boolean hayPieza = true;
        if (tablero[fila][columna] == null) {
            hayPieza = false;
        }
        return true;
    }

    public boolean hayPiezasEntre(Movimiento mov) {
        boolean piezaEntre = false;
        return true;

    }

    public void ponPieza(Pieza figura, int fila, int columna) {

        tablero[fila][columna] = figura;
    }

    public void ponPieza(Pieza figura, Posicion posic) {

        tablero[posic.getFila()][posic.getColumna()] = figura;
    }

    public void quitaPieza(int fila, int columna) {

        tablero[fila][columna] = null;
    }

    public void quitaPieza(Posicion posic) {

        tablero[posic.getFila()][posic.getColumna()] = null;

    }

    public Pieza devuelvePieza(int fila, int columna) {

        return tablero[fila][columna];
    }

    public Pieza devuelvePieza(Posicion posic) {

        return tablero[posic.getFila()][posic.getColumna()];
    }

    public void Mover(Movimiento mov) {

    }

    public boolean esValido(int valor) {

        return true;
    }

}
