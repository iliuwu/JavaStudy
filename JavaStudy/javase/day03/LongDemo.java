package day03;
import java.sql.Date;
import java.util.Calendar;
public class LongDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long now = System.currentTimeMillis();
		Date date = new Date(now);
		int y = date.getYear() + 1900 ;
		int month = date.getMonth() + 1;
		System.out.println(y);
		System.out.println(month);
	}

}
