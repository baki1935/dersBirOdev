package dersBirOdev;

public class StringDemo {

	private static final int srcBegin = 0;
	private static final int srcEnd = 8;
	private static final int dstBegin = 0;
	private static int dst;

	public static void main(String[] args) {
		String message = "Boşlukta bir karakterdir arkadaşlar! ";
		System.out.println(message);
		System.out.println("Karakter sayısı: "+message.length());
		System.out.println("3. Eleman: "+message.charAt(2));
		System.out.println(message.concat("Noktalama işaretleri de öyledir."));
		System.out.println("Bu cümle A kelimesi ile başlar: " +message.startsWith("A"));
		System.out.println("Bu cümle b kelimesi ile biter: "+message.endsWith("b"));
		System.out.println(message.indexOf("a"));
		System.out.println(message.lastIndexOf("b"));
		char[] characters = new char[8];
		message.getChars(srcBegin, srcEnd,characters, dstBegin);
		System.out.println(characters);
	
	
	
	}

}
