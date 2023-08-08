package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {

	public double largura;
	public double altura;
	public double lado;
	public Retangulo(int posX, int posY, double largura, double altura ) {
		super(posX, posY);
		this.largura = largura;
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}
	public Retangulo(int posX, int posY, double lado) {
		super(posX, posY);
		lado = this.largura;
	}
	
	public double getArea() {
		double a = this.largura*this.altura;
		return a;
	}
	

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		double c = 2*(this.altura+this.largura);
		return c;
	}
	
	public String toString() {
		return "Retângulo na " + getPosString() + " com largura de " + this.largura +
				"cm e altura de " + this.altura + "cm (área=" + getArea() +"cm2, perímetro=" + getPerimetro() + "cm)";
	}
}
