package dersBirOdev;

public class recapDemo1 {

	public static void main(String[] args) {
		int sayi1 = 36;
		int sayi2 = 35;
		int sayi3 = 32;

		int enBüyük = sayi1;
		int enKücük = sayi2;
		
		if(sayi1<enKücük) {
			enKücük = sayi1;
		} if(sayi3<enKücük) {
			enKücük = sayi3;
		}
		if(enBüyük<sayi2) {
			enBüyük = sayi2;
		} if(enBüyük<sayi3) {
			enBüyük=sayi3;
		}
		System.out.println("En büyük sayı= " + enBüyük);
		System.out.println("En küçük sayı = " + enKücük);

	}

}
