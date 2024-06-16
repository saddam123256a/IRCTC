package in.ashokit.service;

import org.springframework.stereotype.Component;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

@Component
public interface BookingService {
public Ticket bookTicket(Passenger passenger);

public Ticket getTicket(Integer ticketNumber);
}
