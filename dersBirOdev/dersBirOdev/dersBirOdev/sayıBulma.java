package dersBirOdev;

public class sayıBulma {

	public static void main(String[] args) {
		
		int[] sayılar = {1,3,5,7,9};
		int bulunacak = 5;
		boolean sonuc = false;
		
		
		for(int sayı : sayılar) {
			if(sayı == bulunacak) {
			sonuc=true;
			
			break;
			}
		}
		if(sonuc==true) {
			System.out.println("sayı mevcuttur.");
		}
		else {
			System.out.println("Sayı mevcut değildir.");
		}
	}

}
