package miage.gestioncabinet.coreM;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import miage.gestioncabinet.api.Consultation;
import miage.gestioncabinet.api.GestionCabinetException;
import miage.gestioncabinet.api.Medecin;
import miage.gestioncabinet.api.Patient;
import miage.gestioncabinet.api.PlanningRemoteService;
import miage.gestioncabinet.api.Utilisateur;

/**
 * 
 * 
 * EJB Gestion des RDV , recherche medecins et recherche des patients
 *
 */
@Remote(PlanningRemoteService.class)
@Stateful
public class PlanningService implements PlanningRemoteService {
	
	private Utilisateur utilisateur ;
	private Calendar dateDebut ; 
	private Calendar datefin ; 
	private Medecin medecin;
	
	@Override
	public Utilisateur getUtilisateur() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Medecin> rechercherMedecins() throws GestionCabinetException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Patient> rechercherPatients(String nom, String prenom,
			Calendar dateNaissance) throws GestionCabinetException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Calendar getDateDebut() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDateDebut(Calendar date) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Calendar getDateFin() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDateFin(Calendar date) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Medecin getMedecin() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setMedecin(Medecin medecin) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Consultation> listerRdv() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Consultation getRdvCourant() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setRdvCourant(Consultation rdv) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Consultation creerRdv(Calendar date) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Consultation enregistrerRdv() throws GestionCabinetException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void supprimerRdv() throws GestionCabinetException {
		// TODO Auto-generated method stub
		
	}
	
	

}
