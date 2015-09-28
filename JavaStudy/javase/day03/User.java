package day03;

public class User {
	int id;
	String email;
	String pwd;
	public User() {};
	public User(int id, String email, String pwd){
		super();
		this.id = id;
		this.email = email;
		this.pwd = pwd;
	}
	public String toString() {
		return id + "," + email;
	}
	public boolean equals(Object obj) {
		if (obj == null){
			return false;
		}
		
		if (this == obj){
			return true;
		}
		if (obj instanceof User){
			User o = (User) obj;
			return id == o.id;
		}
		return false;
	}
	public int hashCode() {
		return id;
	}

}
