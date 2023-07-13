package javaQuestion;

public class FindLargestSmallestAnd2ndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,5,1,6,7,8,94,234,423,1};
		printLargest2ndLargestAndSmallest(arr);

	}
	private static void printLargest2ndLargestAndSmallest(int[] arr) {
		int lengthOfArray = arr.length;
		int largest = arr[0];
		int smallest = arr[0];
		int secondLargest = arr[0];
		for(int i =0; i<lengthOfArray; i++) {
			if(arr[i]>largest) {
				secondLargest =largest;
				largest =arr[i];
				
			}
			else if(arr[i]< smallest) {
				smallest = arr[i];
			}
		
		}

		System.out.println(largest+" "+secondLargest+" "+smallest);

	}
}
