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
 * 1��Java���л����ǰѶ���ת�����ֽ����У���Java�����л����ǰ��ֽ����л�ԭ��Java����
 * 2������Java���л��뷴���л�������һ�ǿ���ʵ�����ݵĳ־û�����MVCģʽ�к������ã����ǿ��Զ������ݵ�Զ��ͨ�š�
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
		System.out.println("Person�������л��ɹ�");
		oo.close();
	}
	
	private static Person DeserializePerson() throws Exception,IOException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:/person.txt")));
		Person person = (Person) ois.readObject();
		System.out.println("Person���������л��ɹ�");
		ois.close();
		return person;
	}
}
