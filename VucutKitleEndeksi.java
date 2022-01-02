package BackEnd;

import java.util.Scanner;

public class VucutKitleEndeksi {

	public VucutKitleEndeksi() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double boy, kilo, endeks;
		
		System.out.print("Boyunuzu metre cinsinden giriniz: ");
		boy = input.nextDouble();
		System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
		kilo = input.nextDouble();
		
		endeks = kilo / (boy * boy);
		
		System.out.print("Vücut endeksiniz: " + endeks + ".");
		
		
		
	}

}
