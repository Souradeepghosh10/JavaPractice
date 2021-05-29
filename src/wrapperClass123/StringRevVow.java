package wrapperClass123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StringRevVow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to check");
		String s = sc.next();
		char[] charArray = s.toCharArray();
		ArrayList<Character> arr = new ArrayList<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if (isCharBoolean(charArray[i]) == true) {
				arr.add(charArray[i]);
			}
		}
		Collections.reverse(arr);
		int Fir = s.indexOf(arr.get(arr.size() - 1));
		int las = s.indexOf(arr.get(0));
		StringBuilder string = new StringBuilder(s);
		string.setCharAt(Fir, arr.get(0));
		string.setCharAt(las, arr.get(arr.size() - 1));
		System.out.println(string);
	}

	public static boolean isCharBoolean(char character) {
		if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i'
				|| character == 'I' || character == 'o' || character == 'O' || character == 'u' || character == 'U') {
			return true;
		} else {
			return false;
		}
	}

}
