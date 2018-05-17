package movieTicketSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCase {
	movieTicket ticket1 = new movieTicket();
	movieTicket ticket2 = new movieTicket("Star Wars", "16:00", 5, 7.50);
	movieTicket ticket3 = new movieTicket("It", "03:00", 3, 12.00);
	
	ticketOrder order1 = new ticketOrder();
	ticketOrder order2 = new ticketOrder(ticket1, 0, "", "");
	ticketOrder order3 = new ticketOrder(ticket2, 1, "Cinemark", "Adrian");
	ticketOrder order4 = new ticketOrder(ticket3, 4, "AMC", "Bob");
	
	@Test
	public void testTicket() {
		assertEquals("Title of ticket1 is \"\"", ticket1.getTitle(), "");
		assertEquals("Title of ticket2 is Star Wars", ticket2.getTitle(), "Star Wars");
	}
	
	@Test
	public void testTicketOrder() {
		assertNull("order1 has null ticket", order1.getTicket());
		assertSame("order2 has ticket1", order2.getTicket(), ticket1);
		assertNotSame("order2 does not have ticket2", order2.getTicket(), ticket2);
	}

}
