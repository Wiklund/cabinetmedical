package miage.gestioncabinet.coreM;

import java.util.Calendar;

import miage.gestioncabinet.api.Medecin;
import miage.gestioncabinet.api.Patient;

public class MedecinM implements Medecin {

	private static final long serialVersionUID = -2795187985951315891L;
	private String RPPS;
	private String nom;
	private String prenom;
	private String compte;


	public MedecinM(){
		this.RPPS = String.valueOf(Calendar.getInstance().hashCode());
	}

	@Override
	public String getCompte() {
		return this.compte;
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;

	}

	@Override
	public String getPrenom() {
		return this.prenom;
	}

	@Override
	public void setPrenom(String prenom) {
		this.prenom = prenom;

	}

	@Override
	public String getRPPS() {
		return this.RPPS;
	}

	@Override
	public boolean equals(Object arg0){
		Boolean equals = super.equals(arg0);
		if(!equals){
			if(arg0 instanceof Medecin){
				Medecin medecin = (Medecin) arg0;
				equals = this.getRPPS().equals(medecin.getRPPS());
			}
		}
		return equals; 
	}

	public String toString(){
		return this.getClass().getSimpleName() + " " + this.getPrenom() + " " + this.getNom();
	}


}
