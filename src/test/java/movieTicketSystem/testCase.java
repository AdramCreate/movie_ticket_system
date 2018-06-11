package movieTicketSystem;

import static org.junit.Assert.*;

import org.junit.Test;

import models.movieTicket;
import models.ticketOrder;

public class testCase {
	movieTicket ticket1 = new movieTicket();
	movieTicket ticket2 = new movieTicket("Star Wars", "16:00", 5, 7.50);
	movieTicket ticket3 = new movieTicket("It", "03:00", 3, 12.00);
	
	ticketOrder order1 = new ticketOrder();
	ticketOrder order2 = new ticketOrder(ticket1, 0, "", "");
	ticketOrder order3 = new ticketOrder(ticket2, 1, "Cinemark", "Adrian");
	ticketOrder order4 = new ticketOrder(ticket3, 4, "AMC", "Bob");
	
	@Test
	public void testTicket1() {
		assertEquals("Title of ticket1 is \"\"", ticket1.getTitle(), "");
		assertEquals("Time of ticket1 is 00:00", ticket1.getTime(), "00:00");
		assertEquals("Theater number of ticket1 is 0", ticket1.getTheaterNum(), 0);
		assertEquals("Cost of ticket1 is $00.00", ticket1.getCost(), 0.0, 0.0);
	}
	
	@Test
	public void testTicketOrder1() {
		assertNull("order1 has null ticket", order1.getTicket());
		assertEquals("order1 has 0 tickets", order1.getNumTickets());
		assertEquals("order1 has theater name \"\"", order1.getTheaterName(), "");
		assertEquals("order1 has total cost = $00.00", order1.getTotalCost(), 0.0, 0);
		assertEquals("order1 has purchaser name \"\"", order1.getPurchaserName(), "");
		//assertNotNull("order3 has ticket ticket2", order3.getTicket());
		//assertSame("order2 has ticket1", order2.getTicket(), ticket1);
		//assertNotSame("order2 does not have ticket2", order2.getTicket(), ticket2);
	}
	
	@Test
	public void testTicketOrder2_miscTests() {
		assertNotNull("order2 has ticket ticket1", order2.getTicket());
		assertSame("order2 has ticket1", order2.getTicket(), ticket1);
		assertNotSame("order2 does not have ticket2", order2.getTicket(), ticket2);
	}

}
