package principal;

import modelos.*;

public class Programa {
	public static void main(String args[]) {
		Bike minhaBike = new Bike("Caloi", 0, 1, 4, new Quadro(25, "Vermelho", "Alumínio"), new Roda(10, "Alumínio", "Prata"), new Roda(10, "Alumínio", "Prata"));
		
		minhaBike.getQuadro().setCor("Amarelo");
		
		System.out.println("Cor da quadro: " + minhaBike.getQuadro().getCor());
	}
}
