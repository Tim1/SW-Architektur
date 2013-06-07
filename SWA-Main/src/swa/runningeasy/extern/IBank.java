/**
 * 
 */
package swa.runningeasy.extern;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public interface IBank {

	/**
	 * Bankanwendung will call this Method to give Information about the
	 * Kontostatus
	 */
	public void liefereZalungseingaenge();
}
