package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
	public static void main(String args[]) {
		Circulo circulo = new Circulo(32, 87, 6);
		Retangulo retangulo = new Retangulo(12, 65, 2, 7);
		Quadrado q1 = new Quadrado(4, 5 , 11);
		System.out.println(circulo.toString());
	}
}
