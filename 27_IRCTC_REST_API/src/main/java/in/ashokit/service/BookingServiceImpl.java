package in.ashokit.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService{

	private Map<Integer,Ticket>ticketsMap=new HashMap<>();
	private Integer ticketNum=1;
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		Ticket t=new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(124.0);
		t.setStatus("CONFIRMED");
		t.setTicketNum(ticketNum);
		
		
		ticketsMap.put(ticketNum, t);
		ticketNum++;
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {
	
		if(ticketsMap.containsKey(ticketNumber)) {
			return ticketsMap.get(ticketNumber);  
		}
		
		
		
		return null;
	}

}
