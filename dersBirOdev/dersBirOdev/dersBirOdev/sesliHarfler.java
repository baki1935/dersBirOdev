package dersBirOdev;

public class sesliHarfler {

	public static void main(String[] args) { 
	    //videodan önce
		char harf = 'E';
		char[] kalın = {'A','I','O','U'};
		char[] ince = {'E','İ','Ö','Ü'};
		
		for(int i=0;i<kalın.length;i++) {
			if(kalın[i] ==harf)  {
				System.out.println("Kalın sesli harf");
			} 
			
		}
		for(int a=0;a<ince.length;a++) {
			if(ince[a]==harf) {
				System.out.println("İnce sesli harf");
			}
			
		}
		//videodan sonra 
		char ses = 'E';
		switch(ses) {
			case  'A':
			case 'O':
			case 'U':
			case  'I':
		System.out.println("Kalın sesli harf");
			break;
			default :
				System.out.println("İnce sesli harf");
			
			
			
				
				
			
		
		}
		
	}

}
