package BackEnd;

import java.util.Scanner;

public class Hipotenus {

	public Hipotenus() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int a, b;
		double c, u, cevre, alan, alankare;
		
		System.out.print("Hipotenüs hesaplaması için birinci kenarı giriniz: ");
		a = input.nextInt();
		System.out.print("Hesaplama için ikinci kenarı giriniz: ");
		b = input.nextInt();
		
		c = Math.sqrt((a * a) + (b * b));
		u = (a+b+c) / 2;
		cevre = 2 * u;
		alan = u * (u - a) * (u - b) * (u - c);
		alankare = alan * alan;
		
		System.out.println("Hipotenüs: " + c);
		System.out.println("Çevre: " + cevre);
		System.out.println("Alan: " + alan);
		System.out.println("Alankare: " + alankare);
		

	}
}
