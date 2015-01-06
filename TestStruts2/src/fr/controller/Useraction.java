/**
 * 
 */
package fr.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author dao303
 *
 */
public class Useraction extends ActionSupport {

	String currentError;
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

	public Useraction() {
		addFieldError("oo", "error message");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1066689614258122078L;

	/**
	 * @param login
	 * @param password
	 * @return
	 */
//	public static String doLogin (String login, String password) {
//		String check = ERROR;
//		if (login=="toto") {
//			check = SUCCESS;
//		}
//		return check;
//	}
	
	public String doLogin() {
		return SUCCESS;
	}

}
