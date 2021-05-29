package wrapperClass123;

public class StingRev {

	public static void main(String[] args) {
String s="Souradeep";
String rev="";
char[] charArray = s.toCharArray();
for (int i = charArray.length-1; i >=0; i--) {
	rev=rev+charArray[i];
}
System.out.println(rev);
	}

}
