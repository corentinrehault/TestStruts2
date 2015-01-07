/**
 * 
 */
package fr.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author dao303
 *
 */
public class DBAdministration {
	
	public static void closeResultSet (ResultSet result) {
		
		if(result!=null) {
			try {
				result.close();
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture d'un resultset");
			}
		}
		
	}
	
	public static void closeRequest (Statement request) {
		
		if(request!=null) {
			try {
				request.close();
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture d'une requête");
			}
		}
	}
	
	public static void closeConnection (Connection connection) {
		if(connection!=null) {
			try {
				connection.close();
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture d'une connexion");
			}
		}
	}

}
