package day07;


class DataWrap{
	public int a;
	public int b;
}
public class Main {

	public static void swap(DataWrap dw) {
		int temp = dw.a;
		dw.a = dw.b;
		dw.b = temp;
		System.out.println("dw.a :" + dw.a +"\t" +"dw.b :" + dw.b);
		dw= null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataWrap dwDataWrap = new DataWrap();
		dwDataWrap.a = 6;
		dwDataWrap.b = 9;
		swap(dwDataWrap);
		System.out.println("dwDataWrap.a :" + dwDataWrap.a +"\t" +"dwDataWrap.b :" + dwDataWrap.b);
		
		
	}

}
