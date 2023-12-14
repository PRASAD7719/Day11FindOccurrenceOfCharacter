/* I/P: Prasad Dhame
 * 
 */
package main1;

import java.util.HashMap;

public class Day11CountOcrrencesOfEachCharacter {
	public static void main(String[] args) {
		
		String ab="Prasad Dhame";
		HashMap<Character,Integer>map=new HashMap<>();
		char[]c=ab.toCharArray();
		
		for(int i=0;i<ab.length();i++) {
			
			if(map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i])+1);
			}
			else {
				map.put(c[i], 1);
			}
		}
		System.out.println("the occurrence of character is: "+map);
	}

}
