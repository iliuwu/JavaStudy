package day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");

		for(int i=0; i<list.size(); i++){
			list.remove(i);
		}
		
		for(String item:list){
			System.out.println(item);
		}
	}

}
