package miage.gestioncabinet.coreM;

import miage.gestioncabinet.api.Produit;
import miage.gestioncabinet.api.Traitement;

public class TraitementM implements Traitement {

	private static final long serialVersionUID = -5516761953484876445L;

	private Produit produit;
	
	private String posologie;

	@Override
	public Produit getProduit() {
		return this.produit;
	}

	@Override
	public void setProduit(Produit produit) {
		this.produit = produit;
		
	}

	@Override
	public String getPosologie() {
		return this.posologie;
	}

	@Override
	public void setPosologie(String posologie) {
		this.posologie = posologie;
		
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + " " + this.getProduit() + " : " + this.getPosologie();
	}

}
