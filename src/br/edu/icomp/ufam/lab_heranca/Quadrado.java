package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo {

		

	public Quadrado(int posX, int posY, double lado) {
		
		super(posX, posY, lado);
		// TODO Auto-generated constructor stub
		this.altura = lado;
		this.largura = lado;
		
	}
	
	
	public String toString() {
		return "Quadrado na" + getPosString() + " com lado de " + this.largura + "cm (área=" +
	this.getArea() + "cm2, perímetro="+ this.getPerimetro() + "cm)";
	}

}
	