package BackEnd;

import java.util.Scanner;

public class TaksimetreHesaplama {

	public TaksimetreHesaplama() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double mesafe, acilis = 10, minimum = 20, km, kmbasi = 2.20;
		
		System.out.print("Açılış ücreti 10 TL'dir. Toplam gitmek istediğiniz mesafeyi giriniz: ");
		mesafe = input.nextDouble();
		
		km = (mesafe * kmbasi) + acilis;
		
		if (km < 20) {
			System.out.println("Toplam mesafe ücretiniz minimum değerin altında kaldığı için yolculuk bedeliniz: " + minimum + " TL'dir.");
		} else if (km > 20) {
			System.out.print("Yolculuk ücretiniz: " + km + " TL'dir.");
		} else if (km == 20) {
			System.out.print("Yolculuk ücretiniz: " + minimum + " TL'dir.");
		} else {
			System.out.print("Lütfen geçerli bir değer giriniz.");
		}	
	}

}
