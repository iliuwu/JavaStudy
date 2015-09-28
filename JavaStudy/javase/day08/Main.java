package day08;



 class AttackImpl implements Attack{
	private String moveString;
	private String attString;
	
	public AttackImpl (String moveString, String attString) {
		this.moveString = moveString;
		this.attString = attString;
	}
	public void move() {
		// TODO Auto-generated method stub
		  System.out.println(moveString);
	}

	public void attack() {
		// TODO Auto-generated method stub
	     move();
	     System.out.println(attString);
	}
}
 class Insect{
		
		private int size;
		private String colorString;
		
		
		public Insect(int size, String colString) {
			// TODO Auto-generated constructor stub
			this.size = size;
			this.colorString = colString;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public String getColorString() {
			return colorString;
		}
		public void setColorString(String colorString) {
			this.colorString = colorString;
		}
		@Override
		public String toString() {
			return "Insect [size=" + size + ", colorString=" + colorString
					+ "]";
		}
	
	}

 class Bee extends Insect implements Attack{
	 private Attack attack;
	 public Bee (int size ,String colString,Attack attack) {
		 super(size,colString);
		 this.attack = attack;
	}
	 public void move() {
		attack.move();
	}
	 public void attack() {
		attack.attack();
	}
 }

 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bee a = new Bee(1, "black", new AttackImpl("fly", "move"));
        a.attack();
 
        Bee b = new Bee(1, "black", new AttackImpl("fly", "sting"));
        b.attack();
	}

}
