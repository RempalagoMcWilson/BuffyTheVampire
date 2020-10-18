package org.ucm.tp1;

public class Vampire {
	private int x, y;
	private int life;
	private Game game;
	private int nextStep;
	public static final int SPEED;
	public static final int HARM;
	private Random rand;
	
	public Vampire (int x, int y, Game game) {
		this.x = x;
		this.y = y;
		this.game = game;
		this.nextStep = 1;
		this.life = 5;
	}
	
	public int toX() {
		return this.x;
	}
	
	public int toY() {
		return this.y;
	}
	
	private boolean isAlive() {
		if(this.life != 0) return true;
	}
	
	private void decreaseLife() {
		if(this.life > 0) this.life--;
	}
	
	private void move() {
		this.x--;
	}
	
	private void attack() {
		//se necesita tener game hecho? para saber que cambiar
	}
	
	public String toString() {
		String aux = "S[";
		//String aux = "S[" + this.life.toString() + "]";
		aux += this.life;
		aux += "]";
		return aux;
	}
	
	//Metodos estaticos para el tratamiento del número de vampiros que hay en el tablero 
	// y el número de los que quedan por salir
}
