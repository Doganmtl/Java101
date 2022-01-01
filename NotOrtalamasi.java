package BackEnd;

import java.util.Scanner;

public class NotOrtalamasi {

	public NotOrtalamasi() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int mat, fizik, kimya, turkce, tarih, muzik;
		
		System.out.print("Matematik notunuzu giriniz: ");
		mat = input.nextInt();
		
		System.out.print("Fizik notunuzu giriniz: ");
		fizik = input.nextInt();
		
		System.out.print("Kimya notunuzu giriniz: ");
		kimya = input.nextInt();
		
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce = input.nextInt();
		
		System.out.print("Tarih notunuzu giriniz: ");
		tarih = input.nextInt();
		
		System.out.print("Müzik notunuzu giriniz: ");
		muzik = input.nextInt();
		
		int toplam = mat + fizik + kimya + turkce + tarih + muzik;
		int sonuc = toplam / 6;
		System.out.println("Ortalamanız, " + sonuc + ".");
		
		while (sonuc == 60) {
			System.out.print("Sınıfı geçtiniz.");
			break;
		}
		
		while (sonuc > 60) {
			System.out.print("Sınıfı geçtiniz.");
			break;
		}
		
		while (sonuc < 60) {
			System.out.print("Sınıfı geçemediniz.");
			break;
		}
		
	}

}
