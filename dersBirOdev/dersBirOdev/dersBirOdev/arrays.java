package dersBirOdev;

public class arrays {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Baki";
		ogrenciler[1] = "Ali";
		ogrenciler[2] = "Ayşe";
		ogrenciler[3] = "Fatma";
		for(String ogrenci:ogrenciler) {
			
			System.out.println(ogrenci);
		}
		
		System.out.println("-------------------");
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-------------------");
		
		String[] ögrenciler = {"Baki", "Ali", "Ayşe", "Fatma"};
		for(int i=0;i<ögrenciler.length;i++) {
			System.out.println(ögrenciler[i]);
		}
		
		
		

	}

}
