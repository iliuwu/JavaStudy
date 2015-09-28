package day05;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;
/***
 * 1）Java序列化就是把对象转换成字节序列，而Java反序列化就是把字节序列还原成Java对象。
 * 2）采用Java序列化与反序列化技术，一是可以实现数据的持久化，在MVC模式中很是有用；二是可以对象数据的远程通信。
 * @author liuwu
 *
 */
public class TestObjSerializeAndDeserialize {
	public static void main(String[] args) throws Exception {
	SerializePerson();
	Person person = DeserializePerson();
//	System.out.println(MessageFormat.format("name={0} ,age={1},sex={2}", person.getName(),person.getAge(),person.getSex()));
	System.out.println(person);
	}
	private static void  SerializePerson () throws FileNotFoundException,IOException {
		Person person = new Person();
		person.setName("gacl");
		person.setAge(25);
		person.setSex("man");
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("D:/person.txt")));
		oo.writeObject(person);
		System.out.println("Person对象序列化成功");
		oo.close();
	}
	
	private static Person DeserializePerson() throws Exception,IOException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:/person.txt")));
		Person person = (Person) ois.readObject();
		System.out.println("Person反对象序列化成功");
		ois.close();
		return person;
	}
}
