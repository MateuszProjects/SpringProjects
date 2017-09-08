package info.spring.user;
import java.util.logging.Logger;
public class UserCreate {
	Logger logger = Logger.getLogger(this.getClass().getName());
	
	public UserObject createUser(String name){
		logger.info("Tworzenie użytkownika Logger" + name);
		UserObject user = new UserObject();
		user.setName(name);
		return user;
	}
}
