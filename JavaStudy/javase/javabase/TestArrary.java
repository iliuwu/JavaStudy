package javabase;

import java.lang.ref.SoftReference;



class Person{
	private int age;
	private double height;
	public  Person(int age, double height) {
		this.age = age;
		this.height =height;
	}
	public void info(){
		System.out.println("age: " + age + " height: " + height);
	}
}

public class TestArrary {

	
	public static void main(String[] args) {
		/**
		 * 不存在泛型数组
		 * 
		 */
		// TODO Auto-generated method stub
		int[] iArr = null;
		System.out.println(iArr);
		iArr = new int[10];
		System.out.println(iArr.length);
		/***/
		Person[] students;
		students = new Person[2];
		Person zhangPerson  = new Person(20,172);
		Person leePerson = new Person(30,180);
		students[0] = zhangPerson;
		students[1] = leePerson;
		students[0].info();
		students[1].info();
		/***/
		int[] arr;
		arr = new int[6];
		for (int i = 0;i < arr.length; i++)
		{
			arr[i] = i ;
			System.out.println("i: "+ arr[i]);
		}
	
	


	}

}
