/**
 * 
 */
package swa.runningeasy.business.extern;

import org.apache.log4j.Logger;

import swa.runningeasy.business.AbstractBA;
import swa.runningeasy.business.VereinBA;
import swa.runningeasy.extern.IMessageService;

/**
 * @author Tim Schmiedl (Cyboot)
 * 
 */
public class MessageServiceBA extends AbstractBA implements IMessageService {
	private static Logger	logger	= Logger.getLogger(MessageServiceBA.class);

	@Override
	public void sendSMS() {
		logger.debug("call sendSMS()-method");
	}

	@Override
	public void sendEmail() {
		logger.debug("call sendEmail()-method");
	}

}
