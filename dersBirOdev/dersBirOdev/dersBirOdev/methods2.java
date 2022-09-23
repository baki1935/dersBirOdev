package dersBirOdev;

public class methods2 {

	public static void main(String[] args) {
		String mesaj = "Bunları sonra öğreneceğiz";
		String yeniMesaj = mesaj.substring(0, 3);
		int sayi = topla(5,7);
		System.out.println(sayi);
		String mesaj2 = sehirVer("Ankara");
		System.out.println(mesaj2);

	}
	public static void sil () {
		
	}
	public static void ekle() {
		
	}
	public static void güncelle() {
		
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
		
	}
	public static String sehirVer (String sehir1) {
		return sehir1;
	}

}
