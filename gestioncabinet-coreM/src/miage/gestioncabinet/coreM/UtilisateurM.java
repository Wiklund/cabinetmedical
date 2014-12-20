package miage.gestioncabinet.coreM;

import miage.gestioncabinet.api.Utilisateur;

public class UtilisateurM extends PersonneM implements Utilisateur {

	private String compte;
	
	@Override
	public String getCompte() {
		return this.compte;
	}

}
