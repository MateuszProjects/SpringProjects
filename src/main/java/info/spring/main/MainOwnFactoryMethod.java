package info.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.spring.factory_method.*;

public class MainOwnFactoryMethod {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		
		User user = context.getBean("someUser",User.class);
		System.out.println(user);

	}

}
