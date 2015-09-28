package day09;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author janeky Log��ʾ����
 */
public class Log {
	// Loggerʵ��
	private Logger loger;
	// ��Log���װ�ɵ�ʵ����ģʽ�������������ࡣ�Ժ�Ҫ�õ���־�ĵط�ֻҪ���Log��ʵ���Ϳ��Է���ʹ��
	private static Log log;

	// ���캯�������ڳ�ʼ��Logger������Ҫ������
	private Log() {
		// ��õ�ǰĿ¼·��
//		String filePath = this.getClass().getResource("/").getPath();
//		// �ҵ�log4j.properties�����ļ����ڵ�Ŀ¼(�Ѿ�������)
//		filePath = filePath.substring(1).replace("bin", "src");
		// �����־��loger��ʵ��
		loger = Logger.getLogger(this.getClass());
		// loger����������ļ�·��
//		PropertyConfigurator.configure(filePath + "log4j.properties");
		PropertyConfigurator.configure("D:\\Program Files\\eclipse\\workspace\\JavaTest\\javase\\day09\\log4j.properties");
	}

	static Log getLoger() {
		if (log != null)
			return log;
		else
			return new Log();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log log = Log.getLoger();
		try {
			// �����쳣
			int a = 2 / 0;
		} catch (Exception e) {
			// ����̨��ӡ�쳣��Ϣ
			e.printStackTrace();
			// д�뵽�����ļ�
			log.loger.error("error", e);

		}
	}
}

