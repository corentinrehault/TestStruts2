/**
 * 
 */
package fr.model;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.sql.DataSource;

import org.apache.struts2.ServletActionContext;

/**
 * @author dao303
 *
 */
public class DAOModel implements DAO {
	
	DataSource dataSource=null;

	/* (non-Javadoc)
	 * @see fr.model.DAO#getConnection()
	 */
	@Override
	public Connection getConnection() {
		
		
		
		if(this.dataSource == null) {
			
			ServletContext servletContext=ServletActionContext.getServletContext();
			
			dataSource =(DataSource)servletContext.getAttribute("dataSource2");
			try {
				System.err.println("La connection est " + !dataSource.getConnection().isClosed());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Connection connection=null;
		
		if(dataSource != null) {
			try {
				connection=dataSource.getConnection();

				System.err.println("La connection est " + !connection.isClosed());
			} catch(SQLException e) {
				System.out.println(e);
			}
		}
		
		return connection;
		
	}
	
	/**
	 * @param dataSource
	 */
	public void setConnection(DataSource dataSource) {
		this.dataSource=dataSource;
	}

}
