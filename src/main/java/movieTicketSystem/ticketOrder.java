package movieTicketSystem;

public class ticketOrder {
	public movieTicket ticket;
	public int numTickets;
	public String theaterName;
	public double totalCost;
	private String purchaserName;
	
	ticketOrder(){
		this(null, 0, "", "");
	}
	
	ticketOrder(movieTicket newTicket, int tNum, String tName, String pName){
		ticket = newTicket;
		numTickets = tNum;
		theaterName = tName;
		if(newTicket != null)
			totalCost = this.setTotalCost(ticket.getCost(), numTickets);
		else
			totalCost = 0;
		purchaserName = pName;
	}
	
	public movieTicket getTicket() {
		return ticket;
	}
	
	public int getNumTickets() {
		return numTickets;
	}
	
	public String getTheaterName() {
		return theaterName;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	
	public String getPurchaserName() {
		return purchaserName;
	}
	
	public void setTicket(movieTicket newTicket) {
		ticket = newTicket;
	}
	
	public void setNumTickets(int tNum) {
		numTickets = tNum;
	}
	
	public void setTheaterName(String tName) {
		theaterName = tName;
	}
	
	public void setTotalCost(double tCost) {
		totalCost = tCost;
	}
	
	public void setAccountName(String pName) {
		purchaserName = pName;
	}
	
	public double setTotalCost(double cost, int tNum) {
		return tNum * cost;
	}
	
	public String toString() {
		return "Ticket Order \n\tPurchaser: " + this.getPurchaserName() + "\n\tMovie Title: " + ticket.getTitle() + "\n\tTheater Name: " + this.getTheaterName() + "\n\tNumber of Tickets: " 
				+ this.getNumTickets() + "\n\tTotal Cost: $" + this.getTotalCost();
	}
}
