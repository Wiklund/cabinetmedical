/**
 * 
 */
package miage.gestioncabinet.util.planning;

import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * @author Sandyy
 * Singleton permettant d'accéder au fichier de configuration
 *
 */
@Singleton
@Startup
public class ApplicationService {
	/**
	 * Les propriétés de l'application
	 */
	private Properties properties;
	
	/**
	 * Initialise le fichier de propriété
	 */
	@PostConstruct
	private void initialisation(){
		
	}
	
	/**
	 * Retourne les propriétés de l'application
	 * @return les propriétés de l'application
	 */
	public Properties getProperties(){
		return this.properties;
	}
}
