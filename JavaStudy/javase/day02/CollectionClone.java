package day02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionClone {
	public static void main(String[] args) {
		ArrayList<Foo> list = new ArrayList<Foo>();
		list.add(new Foo());
		list.add(new Foo());
		//���ֿ�����ʽ��"=" clone���� ���캯������
		/**clone����***/
		ArrayList<Foo> list2 = (ArrayList<Foo>) list.clone();
		ArrayList<Foo> list3 = list;
		System.out.println(list3==list);
		System.out.println(list2==list);
		System.out.println(list2.get(0)==list.get(0));
		System.out.println(list.get(0));
		/**���캯������**/
		LinkedList<Foo> list4 =new LinkedList<Foo>(list);
		HashSet<Foo> set = new HashSet<Foo>(list);
		System.out.println(list4.containsAll(list));
		System.out.println(set.containsAll(list));
	}

}
