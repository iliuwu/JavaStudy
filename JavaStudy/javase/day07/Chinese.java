package day07;

class Person{
	String nameString;
	


	public Person() {
		System.out.println("A Person");

	}
	
	public Person(String nameString) {
		super();
		this.nameString = nameString;
		System.out.println(" super Person " + nameString );
	}

}

public class Chinese extends Person{

	Chinese(){
		
		super();
	}
	
	Chinese(String nameString){
		super(nameString);
		System.out.println(" chinese " + nameString );
	}
	
	Chinese(String name, int age){
		this(name);
		
		System.out.println("A Chinese Person " + name + " " + age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese cn = new Chinese();
	//	cn = new Chinese("kevin");
				cn = new Chinese("kevin", 22);

	}

}
