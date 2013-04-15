/**
 * 
 */
package swa.runningeasy.util;

import java.util.ArrayList;
import java.util.List;

import swa.runningeasy.data.be.AbstractBE;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class TransformerFactory {
	private static final TransformerFactory	instance	= new TransformerFactory();

	/**
	 * Transforms a BE to a DTO
	 * 
	 * @param be
	 *            to be transformed
	 * @return transformed DTO
	 */
	public Object transformToDTO(final AbstractBE be) {
		return null;
	}

	/**
	 * Transforms a DTO to BE
	 * 
	 * @param dto
	 *            to be transformed
	 * @return transformed BE
	 */
	public AbstractBE transformToBE(final Object dto) {
		return null;
	}

	/**
	 * Transforms a List of BE to a DTO
	 * 
	 * @param bes
	 *            to be transformed
	 * @return transformed DTO-List
	 */
	public List<Object> transformToDTOList(final List<? extends AbstractBE> bes) {
		List<Object> list = new ArrayList<>();

		for (AbstractBE be : bes) {
			list.add(transformToDTO(be));
		}

		return list;
	}

	/**
	 * Transforms a List of DTO to BE
	 * 
	 * @param dto
	 *            to be transformed
	 * @return transformed BE-List
	 */
	public List<AbstractBE> transformToBEList(final List<Object> dtos) {
		List<AbstractBE> list = new ArrayList<>();

		for (Object dto : dtos) {
			list.add(transformToBE(dto));
		}

		return list;
	}

	/**
	 * @return the instance
	 */
	public static TransformerFactory getInstance() {
		return instance;
	}

}
