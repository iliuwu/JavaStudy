package day02;

import java.util.Map;
import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asvfss.";
		Map<Character, Integer> map = count(str);
		System.out.println(map);
		

	}
	
	public static Map<Character, Integer> count(String s){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if (map.containsKey(c)){
				int count = map.get(c) +1 ;
				System.out.println(" map.get(c) :"+  map.get(c) +" c :" + c+ " i:"+ i + " count:" +count);
				map.put(c, count);	
			}else {
				map.put(c, 1);
			}
		}
		
		
		return map;
		
	
	}

}
