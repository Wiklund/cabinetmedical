package miage.gestioncabinet.coreM;

import miage.gestioncabinet.api.Patient;
import miage.gestioncabinet.api.Personne;

public class PersonneM implements Personne {

	private String nom;
	private String prenom;

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String getPrenom() {
		return prenom;
	}

	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean equals(Object arg0){
		Boolean equals = super.equals(arg0);
		if(!equals)
			if(arg0 instanceof Patient){
				Personne personne = (Personne) arg0;
				equals = this.getNom().equals(personne.getNom());
				if(equals){
					equals = this.getPrenom().equals(personne.getPrenom());
				}
			}
		return equals; 
	}

	public String toString(){
		return this.getClass().getSimpleName() + " " + this.getPrenom() + " " + this.getNom();
	}


}
