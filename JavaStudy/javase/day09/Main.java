package day09;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {
	
	
	public enum SeasonEnum{
		SPRING,SUMMER,FALL,WINTER;
	}
	public void judge(SeasonEnum s) {
		switch (s) {
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case FALL:
			System.out.println("秋天");
			break;
		case WINTER:
			System.out.println("冬天");
			break;
		default:
			break;
		}
	}
	static Logger logger = Logger.getLogger(Main.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(SeasonEnum s : SeasonEnum.values()){
			System.out.println(s);
		}
		new Main().judge(SeasonEnum.SPRING);
		PropertyConfigurator.configure("D:\\Program Files\\eclipse\\workspace\\JavaTest\\javase\\day09\\log4j.properties");
		logger.info("hello.spring");
	}

}
