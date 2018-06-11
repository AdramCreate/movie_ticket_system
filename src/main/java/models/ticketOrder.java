package models;

public class ticketOrder {
	public movieTicket ticket;
	public int numTickets;
	public String theaterName;
	public double totalCost;
	private String purchaserName;
	
	ticketOrder(){
		this(null, 0, "", "");
	}
	
	ticketOrder(movieTicket newTicket_, int tNum_, String tName_, String pName_){
		ticket = newTicket_;
		numTickets = tNum_;
		theaterName = tName_;
		if(newTicket_ != null)
			totalCost = this.setTotalCost(ticket.getCost(), numTickets);
		else
			totalCost = 0;
		purchaserName = pName_;
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
	
	public void setTicket(movieTicket newTicket_) {
		ticket = newTicket_;
	}
	
	public void setNumTickets(int tNum_) {
		numTickets = tNum_;
	}
	
	public void setTheaterName(String tName_) {
		theaterName = tName_;
	}
	
	public void setTotalCost(double tCost_) {
		totalCost = tCost_;
	}
	
	public void setAccountName(String pName_) {
		purchaserName = pName_;
	}
	
	public double setTotalCost(double cost_, int tNum_) {
		return tNum_ * cost_;
	}
	
	public String toString() {
		return "Ticket Order \n\tPurchaser: " + this.getPurchaserName() + "\n\tMovie Title: " + ticket.getTitle() + "\n\tTheater Name: " + this.getTheaterName() + "\n\tNumber of Tickets: " 
				+ this.getNumTickets() + "\n\tTotal Cost: $" + this.getTotalCost();
	}
}
