package javaQuestion;

public class FindMaximumDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,90,45,23,1};
		printMaximumDifference(arr);
	}
	private static void printMaximumDifference(int[] arr)
	{
		int max = arr[0];
		int min = arr[0];
		for(int i=0;i<arr.length; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
			else if(arr[i]< min) {
				min = arr[i];
			}
		}
		System.out.println("Max and min differenece is : "+(max- min));
		
	}

}
