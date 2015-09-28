package day07;
/*
 * 
 * 
 * static ÓÃ·¨
 * 
 */
public class Static {
	static int a = 3;
	static int b;
	static void meth(int x){
		System.out.println("x = " +x);
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth(42);
	}
	static {
		System.out.println("static block init");
		b = a* 4;
		a = 5;
	}

}
