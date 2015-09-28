package day03;

public class ExceptionDemo {
	public static void main(String[] args) 
			throws Exception{
		UserManager mgr  = new UserManager();
		User u = mgr.reg("liuwu@allinpay.com", "123");
		System.out.println("注册成功");
		User someone2 = mgr.login("liuwu@allinpay.com", "123");
		System.out.println("登陆成功");
		u = mgr.reg("liuwu@allinpay.com", "123");
		System.out.println("注册成功");
	}

}
