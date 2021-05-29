package wrapperClass123;

public class TestWrapper 
{
public static void main(String[] args) {
	char[] arr= {'x','b'};
	int i=45;
	int parseInt = Integer.parseInt("45");
	System.out.println(parseInt);
	System.out.println(Character.isDigit(arr[0]));
	boolean upperCase = Character.isUpperCase(arr[0]);
	System.out.println(upperCase);
	int compare = Character.compare(arr[0], arr[1]);
	System.out.println(compare);
}
}
