package day02;

import day02.Goo.Moo;

public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 内部类的使用
		 */
		Goo goo = new Goo();
		Moo moo = goo.new Moo();
		goo.a = 2;
		System.out.println(moo.add());
	}

}

class Goo{
	int a =1;
	static int b = 2;
	class Moo {
		int add(){
			return a + b;
		}
	}
}
