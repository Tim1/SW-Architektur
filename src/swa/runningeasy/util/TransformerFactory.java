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
public final class TransformerFactory {
	private static final TransformerFactory	instance	= new TransformerFactory();

	/**
	 * Transforms a BE to a DTO
	 * 
	 * @param be
	 *            to be transformed
	 * @return transformed DTO
	 */
	public <C> C transformToDTO(final AbstractBE be, final Class<C> clazz) {
		return null;
	}

	/**
	 * Transforms a DTO to BE
	 * 
	 * @param dto
	 *            to be transformed
	 * @return transformed BE
	 */
	public <C extends AbstractBE> C transformToBE(final Object dto, final Class<C> clazz) {
		return null;
	}

	/**
	 * Transforms a List of BE to a DTO
	 * 
	 * @param bes
	 *            to be transformed
	 * @return transformed DTO-List
	 */
	public <C> List<C> transformToDTOList(final List<? extends AbstractBE> bes, final Class<C> clazz) {
		List<C> list = new ArrayList<>();

		for (AbstractBE be : bes) {
			list.add(transformToDTO(be, clazz));
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
	public <C extends AbstractBE> List<C> transformToBEList(final List<Object> dtos, final Class<C> clazz) {
		List<C> list = new ArrayList<>();

		for (Object dto : dtos) {
			list.add(transformToBE(dto, clazz));
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
