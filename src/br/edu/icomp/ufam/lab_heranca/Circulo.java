package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {
	public double raio;
	
	public Circulo(int posX, int posY, double raio) {
		super(posX, posY);
		this.raio = raio;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double pi = Math.PI;
		double a = pi*(Math.pow(raio, 2));
		return a;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		double pi = Math.PI;
		double c = 2*pi*raio;
		return c;
	}

	@Override
	public String toString() {
		return "Círculo na " + getPosString() + " com raio de " + this.raio + "cm (área=" 
	+ this.getArea() + "cm2, perímetro=" + this.getPerimetro() + "cm)";
		
	}
}
