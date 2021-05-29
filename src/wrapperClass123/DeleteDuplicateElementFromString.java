package wrapperClass123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DeleteDuplicateElementFromString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("User enter the String");
	String s = sc.next();
	char[] charArray = s.toCharArray();
	ArrayList<Character> charr=new ArrayList<Character>();
	for (int i = 0; i < charArray.length; i++) {
		charr.add(charArray[i]);
	}
	System.out.println(charr);
	Set set11=new HashSet(charr);
    Set<Character> setNumbers= new LinkedHashSet(charr);
	System.out.println(setNumbers);
	for (Object object : setNumbers) {
		int frequency = Collections.frequency(charr, object);
		System.out.println("the frequency of "+object +": "+frequency);
		
	
		
	}
	
	

	
	
	
	
	
	
}
}
