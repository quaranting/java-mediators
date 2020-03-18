package com.ing.esb.log;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class Logger extends AbstractMediator{
	
	private static final Log log = LogFactory.getLog(Logger.class);

	@Override
	public boolean mediate(MessageContext mc) {
		String token = mc.getEnvelope().getBody().getFirstElement().getFirstElement().getFirstElement().getFirstElement().getFirstElement().getText();
		mc.getEnvelope().getBody().getFirstElement().getFirstElement().getFirstElement().getFirstElement().getFirstElement().setText("***********************");
 
        log.info("funcionooo Este es el token que se puede ocultar: " + token);
        log.info(mc);
		System.out.println("Este es el token: " + token);
		return true;
	}

}
