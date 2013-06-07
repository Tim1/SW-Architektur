/**
 * 
 */
package swa.runningeasy;

import swa.runningeasy.dtos.LaeuferDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class TestData {
	private static final LaeuferDTO	laeuferDTO	= new LaeuferDTO(null, null, 0, (char) 0, null, null, null, null, null,
														null);

	/**
	 * @return the laeuferdto
	 */
	public static LaeuferDTO getLaeuferDTO() {
		return laeuferDTO;
	}
}
