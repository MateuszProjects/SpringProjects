package info.spring.implementation;

import info.spring.api.Logger;
import info.spring.api.UsersRepository;
import info.spring.domain.User;

public class UserRepositoryImpl implements UsersRepository {

	private Logger logger;

	public UserRepositoryImpl(Logger logger,String localization) {
		this.logger = logger;
		logger.log("lokalizacja repozytorium " + localization );
	}

	public User createUser(String name) {
		logger.log("tworzenie u¿ytknika " + name);
		return new User(name);
	}

}
