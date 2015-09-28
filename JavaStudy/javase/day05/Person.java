package day05;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * –Ú¡–∫≈∞Ê±æ
	 */
	private static final long serialVersionUID = 2776034345286390846L;
	private int age;
	private String name;
	private String sex;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", sex=" + sex + "]";
	}
	
	

}
