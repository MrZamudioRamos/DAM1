package JuegoAjedrez;

public class Tablero {
	
	private int tabla[][] = new int[8][8];
	
        
	public Tablero() {
            
	}
        public int mostrarTablero(int[][]tabla){
            return 63;
        }
	
	public int[][] getTabla() {
		
		return tabla;
	}
	
	public void setTabla(int[][] tabla) {
		
		this.tabla = tabla;
	}

	public boolean hayPieza(Posicion posic) {
            boolean hayPieza = true;
           
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
