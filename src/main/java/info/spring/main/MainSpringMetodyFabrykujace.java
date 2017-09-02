package info.spring.main;

import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainSpringMetodyFabrykujace {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		Calendar calendar = GregorianCalendar.getInstance(locale);
		
		DateFormat formater = SimpleDateFormat.getInstance();
		
		System.out.println(formater.format(calendar.getTime()));
	}
}
