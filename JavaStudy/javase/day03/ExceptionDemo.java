package day03;

public class ExceptionDemo {
	public static void main(String[] args) 
			throws Exception{
		UserManager mgr  = new UserManager();
		User u = mgr.reg("liuwu@allinpay.com", "123");
		System.out.println("ע��ɹ�");
		User someone2 = mgr.login("liuwu@allinpay.com", "123");
		System.out.println("��½�ɹ�");
		u = mgr.reg("liuwu@allinpay.com", "123");
		System.out.println("ע��ɹ�");
	}

}
