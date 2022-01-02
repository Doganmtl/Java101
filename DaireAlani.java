package BackEnd;

import java.util.Scanner;

public class DaireAlani {

	public DaireAlani() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double r, pi = 3.14, alan, cevre;
		
		System.out.print("Lütfen dairenin yarı çarpını giriniz: ");
		r = input.nextDouble();
		
		alan = pi * r * r;
		cevre = 2 * pi * r;
		
		System.out.println("Daire alanı: " + alan);
		System.out.println("Daire çevresi: " + cevre);
	}

}
