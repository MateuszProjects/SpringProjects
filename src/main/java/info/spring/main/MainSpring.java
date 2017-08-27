package info.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.spring.api.UsersRepository;
import info.spring.domain.User;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
		
		UsersRepository usersRepository = context.getBean(
				"repozytoriumUzytkownikow", UsersRepository.class);

		User janek = usersRepository.createUser("Janek");
		
		
	}

}
