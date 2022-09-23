package dersBirOdev;

public class methods {

	public static void main(String[] args) {
		sayıBulmaca();
	
	}
	public static void sayıBulmaca() {
		int[] sayılar = {1,3,5,7,9};
		int bulunacak = 5;
		boolean sonuc = false;
		
		
		for(int sayı : sayılar) {
			if(sayı == bulunacak) {
			sonuc=true;
			
			break;
			}
		}
		if(sonuc) {
			
			//System.out.println("sayı mevcuttur.");
			
			mesajVer("Sayı mevcuttur: " + bulunacak);
		}
		else {
			//System.out.println("Sayı mevcut değildir.");
			
			mesajVer("Sayı mevcut değildir: " + bulunacak);
			
		}
	}
	
	
	public static void mesajVer (String mesaj) {
	
			
	System.out.println(mesaj);
	
	}
	

}

