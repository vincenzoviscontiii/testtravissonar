package logic.utils;

import logic.actors.User;
import logic.dao.UserDAO;

public class HomepageUtils {

	static User user = null;
	static UserDAO userDAO = new UserDAO();

	public static User getUser() {

		if (user == null) {
			user = new User();
		}
		return user;
	}

	public static UserDAO getUserDAO() {

		if (userDAO == null) {
			userDAO = new UserDAO();
		}
		return userDAO;
	}

	public static void setUser(String username, String password) {

		user = userDAO.getUserFromUsernameAndPassword(username, password);

	}

	public static void setLog() {

		if (user.getLogged().equals("LOGGATO")) {

			user.setLogged("NON LOGGATO");
		} else {

			user.setLogged("LOGGATO");
		}

	}

}
