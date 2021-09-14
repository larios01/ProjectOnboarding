package week1;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(encrypt("What is the title of your book?"));
		System.out.println(octalEquivalent(19));

	}
	//1)Write a program to encrypt a message using the ROT13 technique.
	public static String encrypt(String message) {
		StringBuilder encryption = new StringBuilder();
		for(int i=0;i<message.length();i++) {
			char letter = message.charAt(i);
			if(letter >= 'a' && letter <= 'm') {
				letter +=13;
			}if(letter >= 'n' && letter <= 'z') {
				letter -=13;
			}if(letter >= 'A' && letter <= 'M') {
				letter +=13;
			}if(letter >= 'N' && letter <= 'Z') {
				letter -=13;
			}encryption.append(letter);
		}
		return encryption.toString();
	}
	
	//2)Write a program to convert a decimal number to its octal equivalent.
	public static String octalEquivalent(int num) {
		String octal = Integer.toOctalString(num);
		return octal;
	}
}
