package wrapperClass123;

public class NumberPalindrom {

	public static void main(String[] args) {
int num=56;
int sum=0;
int rev=num;
while (num!=0) {
	
	int digit=num%10;
	sum=sum*10+digit;
	num=num/10;
}

System.out.println(sum);
if(rev==sum)
{
	System.out.println("number is palindrom");
	}
else {
	System.out.println("number is not palindrom");
}
	}

}
