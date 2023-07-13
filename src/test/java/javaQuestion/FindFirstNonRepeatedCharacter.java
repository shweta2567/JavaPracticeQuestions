package javaQuestion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "shwetaswiss";
		findNonRepeatingCharacter(str);
		

	}
	private static void findNonRepeatingCharacter(String str) {
		Map<Character,Integer> map =new HashMap<Character, Integer>();
		int counter =1 ;
		for(int i =1;i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), counter);
				
			}
		}
//		for(Map.Entry<Character, Integer> entryMap: map.entrySet()) using this iterator u can't solve below problem 
		//it will throw concurrentmodificationsexception

		 Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();

	        // Iterate through the map and remove the keys that have a value greater than 1
	        while (iterator.hasNext()) {
	            Map.Entry<Character, Integer> entryMap = iterator.next();
	            if(entryMap.getValue()==1) {
					System.out.println(entryMap.getKey());
					//break
					continue;
				}
				if(entryMap.getValue() > 1) {
					
					 iterator.remove();
					
					
				}
	        }
	            
		System.out.println(map);
	}

}
