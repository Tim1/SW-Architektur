/**
 * 
 */
package swa.runningeasy.business;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import swa.runningeasy.bes.AnmeldungBE;
import swa.runningeasy.bes.LaeuferBE;
import swa.runningeasy.bes.VeranstaltungBE;
import swa.runningeasy.bes.VereinBE;
import swa.runningeasy.dtos.AnmeldungDTO;
import swa.runningeasy.dtos.LaeuferDTO;
import swa.runningeasy.dtos.VeranstaltungDTO;
import swa.runningeasy.dtos.VereinDTO;
import swa.runningeasy.init.BAFactory;
import swa.runningeasy.init.TransformerFactory;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class AnmeldungBA extends AbstractBA {

	private static Logger			logger	= Logger.getLogger(AnmeldungBA.class);
	private static LaeuferBA		laueferBA;
	private static VeranstaltungBA	veranstaltungBA;
	private static VereinBA			vereinBA;

	@Override
	public void init() {
		super.init();
		laueferBA = BAFactory.getLaeuferBA();
		veranstaltungBA = BAFactory.getVeranstaltungBA();
		vereinBA = BAFactory.getVereinBA();
	}


	/**
	 * Creates a new Anmeldung and saves
	 * 
	 * @param anmeldung
	 *            to create
	 * @throws IllegalArgumentException
	 *             if Anmeldung is null or has illegal arguments
	 */
	public void createAnmeldung(final AnmeldungDTO anmeldung) throws IllegalArgumentException {
		logger.trace("call createAnmeldung-method");
		if (anmeldung == null)
			throw new IllegalArgumentException("Argument must not be NULL");


		// check if laufzeit already exists in db
		AnmeldungBE anmeldungBE = getAnmeldung(anmeldung);

		if (anmeldungBE == null) {
			logger.debug("creating: " + anmeldung);

			VeranstaltungDTO veranstaltung = new VeranstaltungDTO(anmeldung.getVeranstaltung(), new Date(), new Date(),
					0);
			veranstaltungBA.createVeranstaltung(veranstaltung);
			VeranstaltungBE veranstaltungBE = veranstaltungBA.getVeranstaltung(veranstaltung);

			LaeuferDTO laeufer = anmeldung.getLaeufer();
			laueferBA.createLaeufer(laeufer);
			LaeuferBE laeuferBE = laueferBA.getLaeufer(laeufer);

			VereinDTO verein = new VereinDTO(anmeldung.getVerein());
			vereinBA.createVerein(verein);
			VereinBE vereinBE = vereinBA.getVerein(verein);

			objectWriter.begin();
			anmeldungBE = new AnmeldungBE(anmeldung);
			anmeldungBE.setLaeufer(laeuferBE);
			anmeldungBE.setVeranstaltung(veranstaltungBE);
			anmeldungBE.setVerein(vereinBE);
			objectWriter.save(AnmeldungBE.class, anmeldungBE);
			objectWriter.commit();
		}
	}

	public AnmeldungBE getAnmeldung(final AnmeldungDTO anmeldung) {
		logger.trace("call getAnmeldung-method");
		if (anmeldung == null)
			throw new IllegalArgumentException("Argument must not be NULL");

		LaeuferDTO laeufer = anmeldung.getLaeufer();
		LaeuferBE laeuferBE = laueferBA.getLaeufer(laeufer);
		if (laeuferBE == null)
			return null;

		VeranstaltungDTO veranstaltung = new VeranstaltungDTO(anmeldung.getVeranstaltung(), new Date(), new Date(), 0);
		VeranstaltungBE veranstaltungBE = veranstaltungBA.getVeranstaltung(veranstaltung);
		if (veranstaltungBE == null)
			return null;

		VereinDTO verein = new VereinDTO(anmeldung.getVerein());
		VereinBE vereinBE = vereinBA.getVerein(verein);
		if (vereinBE == null)
			return null;

		Map<String, String> parameters = new LinkedHashMap<String, String>();
		parameters.put("x.bezahlt", "" + anmeldung.isBezahlt());
		parameters.put("x.startnummer", "" + anmeldung.getStartnummer());
		parameters.put("x.laeufer.id", "" + laeuferBE.getId());
		parameters.put("x.veranstaltung.id", "" + veranstaltungBE.getId());
		parameters.put("x.verein.id", "" + vereinBE.getId());


		AnmeldungBE anmeldungBE = objectReader.getObjectByQuery(AnmeldungBE.class, parameters);


		return anmeldungBE;
	}

	/**
	 * Saves the updated Anmeldung to the database
	 * 
	 * @param Anmeldung
	 *            to update
	 */
	public void updateAnmeldung(final AnmeldungDTO anmeldung) {
		logger.trace("call updateAnmeldung()-method");

	}


	/**
	 * Delete the Anmeldung from the database
	 * 
	 * @param Anmeldung
	 *            to delete
	 */
	public void deleteAnmeldung(final AnmeldungDTO anmeldung) {
		logger.trace("call deleteAnmeldung()-method");

	}

	/**
	 * Generate the StartListe from the database
	 * 
	 * @param Anmeldung
	 *            to generate from database
	 */
	public void generateStartListe(final AnmeldungDTO anmeldung) {
		logger.trace("call generateStartListe()-method");

	}


	/**
	 * Generate the UnpayedLaueferListe from the database
	 * 
	 * @param Anmeldung
	 *            to generate from database
	 */
	public void generateUnpayedLaueferListe(final AnmeldungDTO anmeldung) {
		logger.trace("call generateUnpayedLaueferListe()-method");

	}


	/**
	 * Gets the actual Anzahl Teilnehmer from the database
	 * 
	 * @param Anmeldung
	 *            from which you want to get the actual anzahl Teilnehmer
	 */
	public void getActualAnzahlTeilnehmer(final AnmeldungDTO anmeldung) {
		logger.trace("call getActualAnzahlTeilnehmer()-method");

	}

	/**
	 * diqualificates the Lauefer from the Anmeldung from the database
	 * 
	 * @param Anmeldung
	 */
	public void disqualifiquateLauefer(final AnmeldungDTO anmeldung) {
		logger.trace("call disqualifiquateLauefer()-method");

	}

	/**
	 * 
	 * @return List of all Anmeldungn
	 */
	public List<AnmeldungDTO> getAllAnmeldungen() {
		logger.trace("call getAllAnmeldungen()-method");
		return TransformerFactory.toDTOList(AnmeldungDTO.class, objectReader.getAllObjects(AnmeldungBE.class));
	}
}
