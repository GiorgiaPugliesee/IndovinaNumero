package it.polito.tdp.IndovinaNumero.model;

public class Difficoltà {
	
	public enum LivelloDifficolta {
		Facile,
		Medio,
		Difficile
	}
	
	private int NMax;
	private int TMax;
	private LivelloDifficolta livello;
	
	public Difficoltà(LivelloDifficolta d) {
		switch (d) {
			case Facile : {
				this.NMax = 100;
				this.TMax = 15;
				break;
			}
			case Medio : {
				this.NMax = 100;
				this.TMax = 8;
				break;
			}
			case Difficile : {
				this.NMax = 100;
				this.TMax = 5;
				break;
			}
		}
	}
	

}
