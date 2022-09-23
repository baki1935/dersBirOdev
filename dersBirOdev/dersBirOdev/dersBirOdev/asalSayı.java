package dersBirOdev;

public class asalSayı {

	public static void main(String[] args) {
		
		int number =17;
		boolean isPrime = true;
		for(int i=2;i<number;i++) {
			if(number%i == 0) {
				isPrime = false;
			}
		}
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		if(isPrime) {
			System.out.println("Sayı asaldır");
		} 
		else {
			System.out.println("Sayı asal değildir");
		}
		
	
	}
}
