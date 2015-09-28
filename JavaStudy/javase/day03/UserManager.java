package day03;

import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.UserException;

public class UserManager {
	private Map<String, User> users = new HashMap<String, User>();
	private int id = 1;
	public User reg(String email,String pwd) throws UserExistException{
		if ( users.containsKey(email))
		{
			throw new UserExistException("注册过了" + email) ;
		}
		User newguy = new User(id++,email,pwd);
		users.put(email, newguy);
		return newguy;
	}
	public User login(String email ,String pwd) throws EmailOrPwdException{
		if (!users.containsKey(email)){
			throw new EmailOrPwdException("无此用户");
		}
		User u = users.get(email);
		if (!u.pwd.equals(pwd)){
			throw new EmailOrPwdException("密码不对");
		}
		return u;
	}
	
	class UserExistException extends Exception {
		public UserExistException(String message){
			super(message);	
		}
	}
	
	class EmailOrPwdException extends Exception {
		public EmailOrPwdException(String message){
			super(message);	
		}
	}


}
