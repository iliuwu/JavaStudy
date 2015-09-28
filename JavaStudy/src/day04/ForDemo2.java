package day04;

public class ForDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 3; i < 6 ;i++)
		{
			sum = i + sum;
			System.out.print(i + " ");
		}
		System.out.println(sum);
	}

}
