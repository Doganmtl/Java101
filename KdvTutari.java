package BackEnd;

import java.util.Scanner;

public class KdvTutari {

	public KdvTutari() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double mik, kdv, nkdv;
		
		System.out.print("Hesaplamak istediğiniz miktarı giriniz: ");
		mik = input.nextDouble();
		
		kdv = (mik * 0.18) + mik;
		nkdv = kdv - mik;
		
		System.out.println("Girmiş olduğunuz tutar: " + mik + " lira.");
		System.out.println("Kdv'li miktar: " + kdv + " lira.");
		System.out.println("Kdv tutarı: " + nkdv + " lira.");
		
		
		
	}

}
