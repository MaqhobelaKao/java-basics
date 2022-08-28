package com.opticsolutions.jcf.onlinestore.helpdesk.facade.implementations;

import java.util.PriorityQueue;
import java.util.Queue;

import com.opticsolutions.jcf.onlinestore.helpdesk.entities.SupportTicket;
import com.opticsolutions.jcf.onlinestore.helpdesk.facade.HelpdeskFacade;
import com.opticsolutions.jcf.onlinestore.helpdesk.utils.CustomSupportTicketsComparator;



public class DefaultHelpdeskFacede implements HelpdeskFacade{

private Queue<SupportTicket> tickets;
	
	{
		tickets = new PriorityQueue<>(new CustomSupportTicketsComparator());
	}

	public void addNewSupportTicket(SupportTicket supportTicket) {
		tickets.offer(supportTicket);
	}

	@Override
	public SupportTicket getNextSupportTicket() {
		return tickets.poll();
	}

	@Override
	public int getNumberOfTickets() {
		return tickets.size();
	}


}
