/**
 * 
 */
package fr.controllers;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author dao303
 *
 */
public class UserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 642222817797870387L;

	String login;
	String password;

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return
	 */
	public String doLogin () {
		String check = ERROR;
		if (login.equals("toto")) {
			check = SUCCESS;
		}
		return check;
	}

}
