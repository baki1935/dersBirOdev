package dersBirOdev;

public class reCapDemo2 {

	public static void main(String[] args) {
		
		double[] myList = {1.2,2.3,3.4,4.5};
		double total = 0;
		double max = myList[0];
		double min = myList[0];
		
		for(double number:myList) {
			total = total + number;
			if(max<number) {
				max =number;
			}
			System.out.println(number);
			if(min>number) {
				min = number;
			}
		}
		System.out.println("Toplam = " + total);
		System.out.println("En büyük = " + max);
		System.out.println("En küçük = " + min);
		
		System.out.println("---------------------");
		
		//or
		double toplam = 0;
		double maximum = myList[0];
		double minimum = myList[0];
		
		for(int i= 0; i<myList.length; i++) {
			System.out.println(myList[i]);
			toplam = toplam + myList[i];
			if(maximum<myList[i]) {
				maximum =myList[i];
			} if(minimum>myList[i]) {
				minimum = myList[i];
			}
			
			
		} 
		System.out.println("Toplam = " +toplam);
		System.out.println("En büyük = " + maximum);
		System.out.println("En küçük = " + minimum);
		
		
		
	}

}
