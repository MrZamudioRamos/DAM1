package ajedrez;

public class Juego {

    private boolean turnoJugadorBlancas;

    public boolean getTurnoJugadorBlancas() {
        return turnoJugadorBlancas;
    }

    public void setElTurno(boolean turnoJugadorBlancas) {
        this.turnoJugadorBlancas = turnoJugadorBlancas;
    }

    public void inicializar(Pieza tablero) {
        System.out.println("Bienvenidos! Soy Ajedrezín\n");
        pintar(tablero);
        

    }

    public void pintar(Pieza tablero) {

    }

    public Movimiento jugada(String jugada, Tablero tablero) {
        return null;

    }

    public void moverJuego(Movimiento mov, Tablero tablero) {

    }
}
