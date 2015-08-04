package hackerRank;
import java.util.Scanner;

public class FunnyString {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		String string = scanner.nextLine();
		
		char chars[] = new char[string.length()];
		
		for (int i=string.length()-1; i >= 0; i--) 
		{
			chars[string.length()-1-i] = string.charAt(i);
		}
		String stringR = new String(chars);
		
		System.out.println(string);
		System.out.println(stringR);
		
		int count = 0;
		
		for (int i = 1; i < string.length(); i++) {
			int c1 = string.charAt(i) - string.charAt(i-1);
			int c2 = stringR.charAt(i) - stringR.charAt(i-1);
	if ((c1 != c2) && (c1 != c2*(-1))) {
		count++;
		
	}
			
//			System.out.println(c1);
//			System.out.println(c2);

		}
		if (count == 0) {
			System.out.println("FUNNY");
		} else {
			System.out.println("NOT FUNNY");
			
		}
	}

}
