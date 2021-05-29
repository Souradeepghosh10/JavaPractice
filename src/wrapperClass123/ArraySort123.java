package wrapperClass123;

import java.util.Scanner;

public class ArraySort123 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int [] arr=new int[5];
for (int i = 0; i < arr.length; i++) {
	System.out.println("enter the value in the array");
	arr[i] = sc.nextInt();
}

int[] sortArray = sortArray(arr);
for (int i = 0; i < sortArray.length; i++) {
	System.out.println(sortArray[i]);
}
	}
	
	public static int [] sortArray(int [] arr1)
	{
		int temp=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i+1; j < arr1.length; j++) {
				if(arr1[i]>arr1[j])
				{
				temp=arr1[i];
				arr1[i]=arr1[j];
				arr1[j]=temp;
				}
				
			}
			
		}
		return arr1;
	}

}
