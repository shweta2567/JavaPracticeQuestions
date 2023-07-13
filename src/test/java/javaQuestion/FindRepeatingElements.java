package javaQuestion;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,2,3,6,7,4,2,27,8,9,3,2,27};
		printRepeatingElements(arr);
		

	}
	private static void printRepeatingElements(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i<arr.length; i++) {
			Integer mapValue = map.get(arr[i]);
			if(mapValue==null) {
				map.put(arr[i],1);
			}
			else {
				map.put(arr[i], mapValue+1);
			}
		}
		System.out.println(map);
		
		//now we need to retrieve only keys greater than vaue 1
		for(Map.Entry<Integer,Integer> mapEntry :map.entrySet())
		{
			if(mapEntry.getValue()>1)
			{
				System.out.println("Key:"+mapEntry.getKey()+"Value:"+mapEntry.getValue());
			}
		}
	}

}
