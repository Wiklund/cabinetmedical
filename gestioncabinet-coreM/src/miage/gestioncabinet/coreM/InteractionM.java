package miage.gestioncabinet.coreM;

import miage.gestioncabinet.api.Interaction;
import miage.gestioncabinet.api.Produit;

public class InteractionM implements Interaction{

	private Produit produitA;
	private Produit produitB;
	private String severite;
	private String risques;
	private String precautions;
	
	@Override
	public Produit getProduitA() {
		return produitA;
	}
	
	@Override
	public void setProduitA(Produit produitA) {
		this.produitA = produitA;
	}
	
	@Override
	public Produit getProduitB() {
		return produitB;
	}
	
	@Override
	public void setProduitB(Produit produitB) {
		this.produitB = produitB;
	}
	
	@Override
	public String getSeverite() {
		return severite;
	}
	
	@Override
	public void setSeverite(String severite) {
		this.severite = severite;
	}
	
	@Override
	public String getRisques() {
		return risques;
	}
	
	@Override
	public void setRisques(String risques) {
		this.risques = risques;
	}
	
	@Override
	public String getPrecautions() {
		return precautions;
	}
	
	@Override
	public void setPrecautions(String precautions) {
		this.precautions = precautions;
	}
	
	
	
	

}
