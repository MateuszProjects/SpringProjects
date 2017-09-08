package info.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import info.spring.user.UserObject;


public class MainInstanceFactoryMethod {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		UserObject userCreate  = context.getBean("ownUser", UserObject.class);
		
		System.out.println(userCreate);
	}

}
