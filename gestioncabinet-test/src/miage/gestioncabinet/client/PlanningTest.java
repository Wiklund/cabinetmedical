/**
 * 
 */
package miage.gestioncabinet.client;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import miage.gestioncabinet.api.Consultation;
import miage.gestioncabinet.api.GestionCabinetException;
import miage.gestioncabinet.api.Patient;
import miage.gestioncabinet.api.PlanningRemoteService;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.novarem.jndi.ServiceLocator;

/**
 * @author l11626937
 *
 */
public class PlanningTest {
	private static PlanningRemoteService ejb;
	
	@BeforeClass
	public static void initialization(){
		String service = "ejb:gestioncabinet/gestioncabinet-coreM//PlanningService!miage.gestioncabinet.api.PlanningRemoteService?stateful";
		try{
			ServiceLocator locator = ServiceLocator.INSTANCE;
			PlanningTest.ejb = (PlanningRemoteService) locator.getRemoteInterface(service);
			String[] noms = {"MARTIN", "DUPOND", "GIUDICELLI"};
			String[] prenoms = {"Jean", "Henri", "Jeannette"};
			String[] datesNaissance = {"12/03/1964", "23/02/1958", "20/07/1943"};
			for(int i=0 ; i<3 ; i++){
				Calendar date = (Calendar) PlanningTest.ejb.getDateDebut().clone();
				date.set(Calendar.HOUR_OF_DAY, 9);
				date.add(Calendar.HOUR_OF_DAY, i);
				Consultation rdv = PlanningTest.ejb.creerRdv(date);
				rdv.getPatient().setNom(noms[i]);
				rdv.getPatient().setPrenom(prenoms[i]);
				Calendar dateNaissance = Calendar.getInstance();
				dateNaissance.setTime(new SimpleDateFormat("dd/MM/yyyy").parse(datesNaissance[i]));
				rdv.getPatient().setDateNaissance(dateNaissance);
				PlanningTest.ejb.setRdvCourant(rdv);
				PlanningTest.ejb.enregistrerRdv();
				System.out.println("Enregistrement réussi du rdv de "+rdv+" (patient(e) de "+rdv.getPatient().getAge()+" ans).");
			}
		}
		catch(Exception e){
			System.out.println("Le service "+service+" est introuvable");
			e.printStackTrace();
		}
	}
	
	@Test
	public void rechercherPatient() throws GestionCabinetException{
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 23);
		calendar.set(Calendar.MONTH, 2);
		calendar.set(Calendar.YEAR, 1958);
		List<Patient> patients = ejb.rechercherPatients("DUPOND", "Henri", calendar);
		Assert.assertTrue(patients.size() == 1);
		Assert.assertTrue(patients.get(0).getNom().equals("DUPOND"));
		Assert.assertTrue(patients.get(0).getPrenom().equals("Henri"));
		Assert.assertTrue(patients.get(0).getDateNaissance().equals(calendar));
	}

}
