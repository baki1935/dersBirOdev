package dersBirOdev;

public class StringDemo2 {
	
	
	public static void main(String[] args) {
		String write = "Sıklıkla kullanılan bir metottur";
		System.out.println(write);
		System.out.println(write.substring(3,6));
		System.out.println(write.toUpperCase());
		System.out.println(write.toLowerCase());
		System.out.println(write.trim());
		String word = write.replace(' ', '-');
		System.out.println(word);
		String regex;
		for(String words: write.split(regex = " ")){
			System.out.println(words);

	
		

	
		}

	
	

	
	}

}
