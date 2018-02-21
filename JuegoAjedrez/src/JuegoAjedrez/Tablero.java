package JuegoAjedrez;

public class Tablero {
	
	private char tabla[][] = new char[8][8];
	private char casilla = 'B';
	
	
	public Tablero() {
		
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla [i][j] = casilla;
				
				if (casilla == 'B') {
					casilla = 'N';
				}else {
					casilla = 'B';
				}
			}
		}
		
	}
	
	public char[][] getTabla() {
		
		return tabla;
	}
	
	public void setTabla(char[][] tabla) {
		
		this.tabla = tabla;
	}

	public boolean hayPieza(Posicion pos) {
	
		return true;
	}
	public boolean hayPieza(int fila, int columna) {
		
		
		return true; 
	}
	
	public boolean hayPiezasEntre(Movimiento mov){
		
		return true;
		
	}
	
	public void ponPieza (Pieza figura, int fila, int columna) {
		
	}
	
	public void ponPieza (Pieza figura, Posicion pos) {
		
	}
	
	public void quitaPieza(int fila,int columna) {
		
	}
	public void quitaPieza(Posicion pos) {
		
	}
	public Pieza devuelvePieza(int fila, int columna) {
		
		return devuelvePieza(fila, columna);
	}
	public Pieza devuelvePieza(Posicion pos) {
		
		return devuelvePieza(pos);
	}
	public void Mover(Movimiento mov) {
		
		
	}
	
	public boolean esValido(int valor) {
		
		return true;
	}
	
	
}
