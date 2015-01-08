/**
 * 
 */
package fr.controllers;

import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

/**
 * @author dao303
 *
 */
public class ApplicationListener implements ServletContextListener {

	Context context=null;

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {

		try {
			if(context!=null) {
				context.close();
			}
		} catch (NamingException e) {
			e.printStackTrace();
			System.out.println("Erreur lors de contextDestroyed !");
		}

	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		
		ServletContext servletContext=servletContextEvent.getServletContext();
		String dataSourceJNDI=servletContext.getInitParameter("dataSourceJNDI");
		
		try {
			context=new InitialContext();
			DataSource dataSource=(DataSource)context.lookup(dataSourceJNDI);
			if(dataSource==null) {
				System.out.println("il n'y a pas de source de données pour le projet TestStruts2.");
			} else {
				System.out.println("DataSource : TestStruts2 chargé !");
				servletContext.setAttribute("dataSource2", dataSource);
				
				try {
					System.out.println("?????????" + !dataSource.getConnection().isClosed());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch(NamingException e) {
			throw new RuntimeException();
		} finally {
			try {
				if(context!=null) {
					context.close();
				}
			} catch(Exception e) {
				System.out.println("Erreur lors de contextInitialized !");
			}
		}
		
	}

}
