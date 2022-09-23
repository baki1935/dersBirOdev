package dersBirOdev;

public class mükemmelSayı {

	public static void main(String[] args) {
		int sayı=5;
		int total=0;
	
		for(int i=1;i<sayı;i++) {
			
			if(sayı%i==0) {
				total = total +i;
				
			
			}
		}
		if(sayı ==total) {
			System.out.println("Mükemmel sayıdır.");
		} else {
			System.out.println("Mükemmel sayı değildir.");
		}
	}

}
