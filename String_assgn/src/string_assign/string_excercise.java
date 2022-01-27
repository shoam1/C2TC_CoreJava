package string_assign;
import java.util.*;

public class string_excercise {
	
	void sumOfString(String s1, String s2) {
		System.out.println(s1.length()+s2.length());
	}
	
	void lexivarible(String s1, String s2){
		System.out.print((s1.compareTo(s2))>0?"Yes":"No");
	}
	
	void titleFirstLetter(String s1, String s2) {
		String new_s1 = Character.toUpperCase(s1.charAt(0))+s1.substring(1);
		String new_s2 = Character.toUpperCase(s2.charAt(0))+s2.substring(1);
		
		System.out.println(new_s1+" "+new_s2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two strings");
		String st1 = sc.next();
		String st2 = sc.next();
		string_excercise se = new string_excercise();
		
		se.sumOfString(st1, st2);
		se.lexivarible(st1, st2);
		se.titleFirstLetter(st1, st2);
	}
}
