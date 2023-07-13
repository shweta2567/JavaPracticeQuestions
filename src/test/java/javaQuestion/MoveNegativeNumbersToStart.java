package javaQuestion;

import java.util.Arrays;

public class MoveNegativeNumbersToStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-1,2,3,-4,-7,8};
        moveNegativeNumbersTOStart(arr);

	}
	private static void moveNegativeNumbersTOStart(int[] arr)
	{
		int[] tempArr = new int[arr.length];
		int counter =0;
		//System.out.println(tempArr);
		for(int i=0; i<arr.length;  i++)
		{
			if(arr[i]<0) {
				tempArr[counter] = arr[i];
				counter++;
				
			}
		}
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>0){
				tempArr[counter] =arr[i];
				counter++;
			}
		}
		System.out.println(Arrays.toString(tempArr));
	}

}
