/**
 * 
 */
package swa.runningeasy.init;

import java.util.ArrayList;
import java.util.List;

import swa.runningeasy.bes.ConvertibleToDTO;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class TransformerFactory {

	/**
	 * transforms a List of BEs to DTOs
	 * 
	 * @param clazz
	 *            - the DTO class it should be tranformed into
	 * @param list
	 *            - List of BEs
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <C> List<C> toDTOList(Class<C> clazz, List<? extends ConvertibleToDTO> list) {
		List<C> result = new ArrayList<>(list.size());
		for (ConvertibleToDTO c : list)
			result.add((C) c.asDTO());

		return result;
	}
}
