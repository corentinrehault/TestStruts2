/**
 * 
 */
package domainService;

import fr.beans.Client;
import fr.model.DAOModelClient;
import fr.model.IDaoCRUD;

/**
 * @author dao303
 *
 */
public class ImpClientService implements IserviceCRUD<Client> {
	
	
	// on instancie l'objet implémentant
	IDaoCRUD<Client> daoCrud = new DAOModelClient();

	/* (non-Javadoc)
	 * @see domainService.IserviceCRUD#getClient(int)
	 */
	@Override
	public Client getObject(int id) {
		// TODO Auto-generated method stub
		return daoCrud.getObject(id);
	}
	
	

}
