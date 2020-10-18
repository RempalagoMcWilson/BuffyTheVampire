package org.ucm.tp1;

public class Slayer {
	private int x, y;
	private int life;
	private Game game;
	public static final int COST;
	public static final int HARM;
	
	public Slayer (int x, int y, Game game) {
		this.x = x;
		this.y = y;
		this.game = game;
		this.life = 3;
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
	
	private void attack() {
		// Para hacer esta hay que hacer antes game creo
	}
	
	public String toString() {
		String aux = "S[";
		//String aux = "S[" + this.life.toString() + "]";
		aux += this.life;
		aux += "]";
		return aux;
	}
}
