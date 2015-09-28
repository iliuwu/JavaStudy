package day03;
import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		System.out.print("intput x:");
		int x = console.nextInt();
		int y = f(x);
		System.out.println("f(x) = 3x + 6 =" + y);
		console.close();
		
	}
	
	public static int f(int x)
	{
		int y = 8 *x +7;
		return y;
	}

}
