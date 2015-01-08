/**
 * 
 */
package fr.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fr.beans.Client;
import fr.controllers.DBAdministration;

/**
 * @author dao303
 *
 */
public class DAOModelClient extends DAOModel implements IDaoCRUD<Client> {

	Connection connection=null;
	ResultSet result=null;
	private static List<Client> clientList;

	/**
	 * @return
	 */
	public List<Client> getClientList() {

		PreparedStatement request=null;
		
		Client client=null;
		String stringRequest=null;
		clientList=new ArrayList<Client>();
		
		System.out.println("dans la méthode fr.model.DAOModelClient.getClientList()");

		try {
			connection=super.getConnection();
			stringRequest="SELECT * FROM clients WHERE 1 ORDER BY CLIENT_Num";
			request=connection.prepareStatement(stringRequest);
			result=request.executeQuery();
			if(result!=null) {
				while(result.next()) {
					client=clientMapper(result);
					clientList.add((Client)client);
				}
			}
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("Erreur dans la requête dans la classe DAOModelClient method getClientList");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelClient method getClientList");
			}
		}

		return clientList;
	}

	/**
	 * @param idClient
	 * @return
	 */
	public Client getObject(int idClient) {

		PreparedStatement request=null;
		Client client=null;
		String stringRequest=null;

		try {
			connection=super.getConnection();
			stringRequest="SELET * FROM clients WHERE CLIENT_Num=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, idClient);
			result=request.executeQuery();
			if(result!=null) {
				if(result.next()) {
					client=clientMapper(result);
				}
			}
		} catch(Exception e) {
			client=null;
			System.out.println("Erreur dans la requête dans la classe DAOModelClient method getClient");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelClient method getClient");
			}
		}

		return client;
	}

	/**
	 * @param client
	 * @return
	 */
	public int addClient (Client client) {

		PreparedStatement request=null;
		String stringRequest=null;
		int errorCode=0;

		try {
			connection=super.getConnection();
			stringRequest="INSERT INTO clients (CLIENT_MotDePasse,CLIENT_CodePostal,CLIENT_Ville,CLIENT_Adresse,CLIENT_Prenom,CLIENT_nom) VALUES(?,?,?,?,?,?)";
			request=connection.prepareStatement(stringRequest);
			request.setString(1, client.getMotdepasse());
			request.setString(2, client.getCodepostal());
			request.setString(3, client.getVille());
			request.setString(4, client.getAdresse());
			request.setString(5, client.getPrenom());
			request.setString(6, client.getNom());
			client=null;
			errorCode=request.executeUpdate();
		} catch(Exception e) {
			errorCode=0;
			System.out.println("Erreur dans la requête dans la classe DAOModelClient method addClient");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelClient method addClient");
			}
		}

		return errorCode;

	}

	/**
	 * @param idClient
	 * @return
	 */
	public int deleteClient (int idClient) {

		PreparedStatement request=null;
		String stringRequest=null;
		int errorCode=0;

		try {
			connection=super.getConnection();
			stringRequest="DELETE FROM clients WHERE CLIENT_Num=?";
			request=connection.prepareStatement(stringRequest);
			request.setInt(1, idClient);
			errorCode=request.executeUpdate();
		} catch(Exception e) {
			errorCode=0;
			System.out.println("Erreur dans la requête dans la classe DAOModelClient method deleteClient");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelClient method deleteClient");
			}
		}

		return errorCode;

	}

	public int editClient (Client client) {

		PreparedStatement request=null;
		String stringRequest=null;
		int errorCode=0;

		try {
			connection=super.getConnection();
			stringRequest="UPDATE clients set CLIENT_MotDePasse=?,CLIENT_CodePostal=?,CLIENT_Ville=?,CLIENT_Adresse=?,CLIENT_Prenom=?,CLIENT_nom=? WHERE CLIENT_Num=?";
			request=connection.prepareStatement(stringRequest);
			request.setString(1, client.getMotdepasse());
			request.setString(2, client.getCodepostal());
			request.setString(3, client.getVille());
			request.setString(4, client.getAdresse());
			request.setString(5, client.getPrenom());
			request.setString(6, client.getNom());
			request.setInt(7, client.getNum());
			client=null;
			errorCode=request.executeUpdate();
		} catch(Exception e) {
			errorCode=0;
			System.out.println("Erreur dans la requête dans la classe DAOModelClient method editClient");
		} finally {
			try {
				if(result!=null) {
					DBAdministration.closeResultSet(result);
				}
				if(request!=null) {
					DBAdministration.closeRequest(request);
				}
				if(connection!=null) {
					DBAdministration.closeConnection(connection);
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de la fermeture de la connexion avec la base de données dans la classe DAOModelClient method editClient");
			}
		}

		return errorCode;

	}

	/**
	 * @param result
	 * @return
	 */
	private Client clientMapper(ResultSet result) {

		Client client=new Client();

		try {

			if(result.getString("CLIENT_Num")==null) {
				client.setNum(0);
			} else {
				client.setNum(result.getInt("CLIENT_Num"));
			}

			if(result.getString("CLIENT_MotDePasse")==null) {
				client.setMotdepasse("");
			} else {
				client.setMotdepasse(result.getString("CLIENT_MotDePasse"));
			}

			if(result.getString("CLIENT_CodePostal")==null) {
				client.setCodepostal("");
			} else {
				client.setCodepostal(result.getString("CLIENT_CodePostal"));
			}

			if(result.getString("CLIENT_Ville")==null) {
				client.setVille("");
			} else {
				client.setVille(result.getString("CLIENT_Ville"));
			}

			if(result.getString("CLIENT_Adresse")==null) {
				client.setAdresse("");
			} else {
				client.setAdresse(result.getString("CLIENT_Adresse"));
			}

			if(result.getString("CLIENT_Prenom")==null) {
				client.setPrenom("");
			} else {
				client.setPrenom(result.getString("CLIENT_Prenom"));
			}

			if(result.getString("CLIENT_Nom")==null) {
				client.setNom("");
			} else {
				client.setNom(result.getString("CLIENT_Nom"));
			}

		} catch(Exception e) {
			client=null;
			System.out.println("Erreur lors du mapping des attributs d'un client dans la classe DAOModelClient method clientMapper");
		}

		return client;
	}

}
