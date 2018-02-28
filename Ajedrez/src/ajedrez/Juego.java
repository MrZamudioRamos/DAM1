package ajedrez;

public class Juego {

	private int turnoJugador = 1; // 0->Negras 1->Blancas

	public int getTurno(){
		
		return turnoJugador;
	}

	public void setElTurno(int elTurno) {
		this.turnoJugador = elTurno;
	}

	public void inicializar(Pieza tablero) {
            System.out.println("Bienvenidos! Soy Ajedrezín\n");
            pintar(tablero);
            System.out.println("Es el turno del jugador " + turnoJugador + " " + this.toString());
            
	}

	public void pintar(Pieza tablero) {
		
	}

	public Movimiento jugada(String jugada, Tablero tablero) {
		return null;
		
	}

	public void moverJuego(Movimiento mov, Tablero tablero) {
		
	}
}
