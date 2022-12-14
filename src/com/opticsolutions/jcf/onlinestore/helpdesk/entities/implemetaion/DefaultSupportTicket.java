package com.opticsolutions.jcf.onlinestore.helpdesk.entities.implemetaion;

import com.opticsolutions.jcf.onlinestore.helpdesk.entities.Priority;
import com.opticsolutions.jcf.onlinestore.helpdesk.entities.RequestType;
import com.opticsolutions.jcf.onlinestore.helpdesk.entities.SupportTicket;

public class DefaultSupportTicket implements SupportTicket {
private static int counter;
	
	private RequestType requestType;
	private int sequentialNumber;
	
	{
		sequentialNumber = ++counter;
	}
	
	public DefaultSupportTicket() {
		// Default empty constructor
	}
	
	public DefaultSupportTicket(RequestType requestType) {
		this.requestType = requestType;
	}
	
	
	
	@Override
	public Priority getPriority() {
		if (requestType == null) {
			return null;
		}
		return this.requestType.getPriority();
	}

	@Override
	public int getSequentialNumber() {
		return this.sequentialNumber;
	}

	@Override
	public RequestType getRequestType() {
		return this.requestType;
	}

}
