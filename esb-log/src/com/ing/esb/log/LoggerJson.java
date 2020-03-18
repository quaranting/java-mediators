package com.ing.esb.log;



import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

public class LoggerJson extends AbstractMediator{
	
	private static final Log log = LogFactory.getLog(LoggerJson.class);

	@Override
	public boolean mediate(MessageContext mc) {
		
		Iterator iterator = mc.getEnvelope().getBody().getChildren();
		while(iterator.hasNext()){
			System.out.println("i "+ iterator.next().toString());
		}
		Iterator iterator2 = mc.getEnvelope().getBody().getAllAttributes();
		while(iterator2.hasNext()){
			System.out.println("i2 "+ iterator2.next().toString());
		}
		Iterator iterator3 = mc.getEnvelope().getBody().getChildElements();
		while(iterator3.hasNext()){
			System.out.println("i3 "+ iterator3.next().toString());
		}
		//Iterator iterator4 = mc.getEnvelope().getBody().getDescendants(true);
		
		
        log.info(mc);
		return true;
	}

}
