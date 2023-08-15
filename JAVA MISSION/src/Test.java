import java.util.Calendar;
import java.util.Date;

public class Test {
	static Calendar cal = Calendar.getInstance();
	
	static Date now = new Date();
	public static void main(String[] args) {
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
	}
}
