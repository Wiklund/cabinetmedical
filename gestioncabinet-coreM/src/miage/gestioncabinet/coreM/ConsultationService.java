package miage.gestioncabinet.coreM;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import miage.gestioncabinet.api.Consultation;
import miage.gestioncabinet.api.ConsultationRemoteService;
import miage.gestioncabinet.api.GestionCabinetException;
import miage.gestioncabinet.api.Produit;

public class ConsultationService implements ConsultationRemoteService{

	private Consultation consultation;
	private List<Produit> listProduit = new ArrayList<Produit>();
	private List<Consultation> listConsultation = new ArrayList<Consultation>();
	
	@Override
	public Consultation getConsultation() {
		return this.consultation;
	}

	@Override
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}

	@Override
	public Consultation creerRdv(Calendar date) {
		Consultation consultation = new ConsultationM();
		consultation.setDebut(date);
		return consultation;
	}

	@Override
	public List<Produit> rechercherMedicament(String keyword)
			throws GestionCabinetException {
		List<Produit> listProd = new ArrayList<Produit>();
		for (Produit produit : this.listProduit){
			if (produit.getNom().contains(keyword)){
				listProd.add(produit);
			}
		}
		return listProd;
	}

	@Override
	public void analyserPrescription() throws GestionCabinetException {
		this.consultation.getPrescription();
		
	}

	@Override
	public Consultation enregistrer() throws GestionCabinetException {
		this.listConsultation.add(this.consultation);
		return this.consultation;
	}

	@Override
	public void supprimer() throws GestionCabinetException {
		this.listConsultation.remove(this.consultation);
	}

}
