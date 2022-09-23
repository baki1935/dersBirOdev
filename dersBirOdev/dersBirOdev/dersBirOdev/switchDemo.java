package dersBirOdev;

public class switchDemo {

	public static void main(String[] args) {
		
		char grade = 'C';
		switch(grade){
		case 'A':
			System.out.println("Mükemmel, geçtiniz.");
			break;
		case 'B':
			System.out.println("Çok iyi, geçtiniz.");
			break;
		case 'C':
			System.out.println("İyi, geçtiniz.");
			break;
		case 'D':
			System.out.println("Fena değil, geçtiniz.");
			break;
		case 'F':
			System.out.println("Üzgünüm, kaldınız");
			break;
		}

	}

}
