package info.spring.api;

import info.spring.domain.User;

public interface UsersRepository {
		User createUser(String name);
		void setLogger(Logger logger);
}
