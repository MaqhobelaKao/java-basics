package com.opticsolutions.jcf.onlinestore.helpdesk.facade;

import com.opticsolutions.jcf.onlinestore.helpdesk.entities.SupportTicket;

public interface HelpdeskFacade {
	SupportTicket getNextSupportTicket();

	/**
	 * @return amount of tickets that are not processed
	 */
	int getNumberOfTickets();
}
