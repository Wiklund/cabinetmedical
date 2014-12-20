package miage.gestioncabinet.coreM;

import miage.gestioncabinet.api.Produit;

public class ProduitM implements Produit {

	private static final long serialVersionUID = 2817066384767986928L;
	private String cis;
	private String nom;
	

	
	@Override
	public String getCis() {
		return this.cis;
	}

	@Override
	public void setCis(String cis) {
		this.cis = cis;
	}

	@Override
	public String getNom() {
		return this.nom;
	}

	@Override
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + " " + this.getCis() + " " + this.getNom();
	}

}
