package com.wat.abstraction;

public class Cercle extends Forme{
	
	private double rayon=4;

	@Override
	public double air() {
	
		return rayon*(Math.sqrt(Math.PI));
	}

}
