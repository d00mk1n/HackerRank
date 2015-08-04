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
		
	}

}
