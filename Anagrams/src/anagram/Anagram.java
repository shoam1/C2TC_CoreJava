package anagram;
import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter strings");
		String s1 = sc.next();
		String s2 = sc.next();
		
		char arr[] = new char[s1.length()];
		char arr2[] = new char[s2.length()];
		
		if(s1.length()!=s2.length()) {
			System.out.println("Anagram!");
		}else {
			
			s1.toLowerCase();
			s2.toLowerCase();
			
			arr = s1.toCharArray();
			arr2 = s2.toCharArray();
			
			Arrays.sort(arr);
			Arrays.sort(arr2);
			
			s1 = new String(arr);
			s2 = new String(arr2);
			
			if(s1.equals(s2))
				System.out.println("Anagram");
				else
					System.out.println("Not an Anagram");
		}
		
	}
}
