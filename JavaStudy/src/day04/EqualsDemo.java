package day04;

public class EqualsDemo {
	public static void main(String[] args) {
		String email = "LIUWU@ALLINPAY.COM";
		int i = email.indexOf("@");
		System.out.println(i);
		String name = email.substring(0, i);
		System.out.println(name);
		String upper = email.toLowerCase();
		System.out.println(upper);
		
	}

}
