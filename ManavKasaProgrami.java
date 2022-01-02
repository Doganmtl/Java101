package BackEnd;

import java.util.Scanner;

public class ManavKasaProgrami {

	public ManavKasaProgrami() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double armut, elma, domates, muz, patlican, toplam;
		
		System.out.print("Armut kaç kilogram? ");
		armut = input.nextDouble();
		System.out.print("Elma kaç kilogram? ");
		elma = input.nextDouble();
		System.out.print("Domates kaç kilogram? ");
		domates = input.nextDouble();
		System.out.print("Muz kaç kilogram? ");
		muz = input.nextDouble();
		System.out.print("Patlıcan kaç kilogram? ");
		patlican = input.nextDouble();
		
		armut *= 2.14;
		elma *= 3.67;
		domates *= 1.11;
		muz *= 0.95;
		patlican *= 5.00; 
		
		toplam = armut + elma + domates + muz + patlican;
		
		System.out.print("Toplam tutar: " + toplam + " TL.");
		
		
		
		
		
		
		
		
		
		
		
	}

}
