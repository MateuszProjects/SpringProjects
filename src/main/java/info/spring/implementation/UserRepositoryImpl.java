package info.spring.implementation;

import info.spring.api.Logger;
import info.spring.api.UsersRepository;
import info.spring.domain.User;

public class UserRepositoryImpl implements UsersRepository{
	
	private Logger logger;
	
	public UserRepositoryImpl(String dane){
		System.out.println("dane: " + dane);
	}
	
	public User createUser(String name) {
		logger.log("tworzenie u¿ytknika " + name);
		return new User(name);
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}
