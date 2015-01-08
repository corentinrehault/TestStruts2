/**
 * 
 */
package fr.controllers;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

import domainService.ImpClientService;
import domainService.IserviceCRUD;
import fr.beans.Client;
import fr.model.DAOModelClient;

/**
 * @author dao303
 *
 */
public class ClientAction extends ActionSupport implements Preparable, ModelDriven<Object> {


	/**
	 * 
	 */
	private static final long serialVersionUID = -6319059011712816711L;

	private Client client;
	private List<Client> clientList;
	private int idCurrentClient;
	
	IserviceCRUD<Client> iserviceCRUD = new ImpClientService();

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Override
	public Object getModel() {
		return client;
	}

	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.Preparable#prepare()
	 */
	@Override
	public void prepare() throws Exception {
		
		if(idCurrentClient==0) {
			client=new Client();
		} else {
			client=iserviceCRUD.getObject(idCurrentClient);
		}
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the clientList
	 */
	public List<Client> getClientList() {
		DAOModelClient daoModelClient=new DAOModelClient();
		clientList=(ArrayList<Client>)daoModelClient.getClientList();
		return clientList;
	}

	/**
	 * @param clientList the clientList to set
	 */
	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}

	/**
	 * @return the idCurrentClient
	 */
	public int getIdCurrentClient() {
		return idCurrentClient;
	}

	/**
	 * @param idCurrentClient the idCurrentClient to set
	 */
	public void setIdCurrentClient(int idCurrentClient) {
		this.idCurrentClient = idCurrentClient;
	}

	/**
	 * @return
	 */
	public String lister() {
		
		System.out.println("dans la méthode fr.controllers.ClientAction.lister()");

		DAOModelClient daoModelClient=new DAOModelClient();

		clientList = daoModelClient.getClientList();
		
		return SUCCESS;
	}

	/**
	 * @return
	 */
	public String ajouter() {

		DAOModelClient daoModelClient=new DAOModelClient();

		daoModelClient.addClient(client);
		return SUCCESS;
	}

	/**
	 * @return
	 */
	public String modifier() {

		DAOModelClient daoModelClient=new DAOModelClient();

		daoModelClient.editClient(client);
		return SUCCESS;
	}

	/**
	 * @return
	 */
	public String editer() {
		return SUCCESS;
	}

	/**
	 * @return
	 */
	public String supprimer() {

		DAOModelClient daoModelClient=new DAOModelClient();

		daoModelClient.deleteClient(idCurrentClient);
		return SUCCESS;
	}

}
