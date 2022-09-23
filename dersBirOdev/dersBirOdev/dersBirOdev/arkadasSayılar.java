package dersBirOdev;

public class arkadasSayılar {

	public static void main(String[] args) {
		/* 220-284 en küçük arkadaş sayılardır. 
		220yi tam bölenlerin toplamı =284, 
		  284 ü tam bölenlerin toplamı =220 dir.
		 */
		int sayı1 = 220;
		int sayı2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		for(int i=1;i<sayı1;i++) {
			if(sayı1%i ==0) {
			toplam1 = i + toplam1;
			}
		}
		for(int a = 1;a<sayı2;a++) {
			if(sayı2%a == 0) {
				toplam2 = a + toplam2;
			}
		}
		if(sayı1==toplam2 && sayı2==toplam1) {
			System.out.println("Sayılar arkadaş.");
		} else {
			System.out.println("Sayılar arkadaş değiller.");
		}
		

	}

}
