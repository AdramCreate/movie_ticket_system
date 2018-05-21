package movieTicketSystem;

public class movieTicket {
	public String movieTitle;
	public String startTime;
	public int theaterNum;
	public double cost;
	
	movieTicket(String title_, String time_, int tNum_, double newCost_){
		movieTitle = title_;
		startTime = time_;
		theaterNum = tNum_;
		cost = newCost_;
	}
	
	movieTicket(){
		movieTitle = "";
		startTime = "00:00";
		theaterNum = 0;
		cost = 0.0;
	}

	public String getTitle() {
		return movieTitle;
	}
	
	public String getTime() {
		return startTime;
	}
	
	public int getTheaterNum() {
		return theaterNum;
	}
	
	public double getCost() {
		return this.cost;
	}
	
	public void setTitle(String title_) {
		movieTitle = title_;
	}
	
	public void setTime(String time_) {
		startTime = time_;
	}
	
	public void setTheaterNum(int tNum_) {
		theaterNum = tNum_;
	}
	
	public void setCost(double cost_) {
		this.cost = cost_;
	}
	
	public String toString() {
		return "Ticket Information: \n\tTitle: " + this.getTitle() + "\n\tTime: " + this.getTime() + "\n\tTheater Number: " + this.getTheaterNum() 
			+ "\n\tCost: $" + this.getCost();
	}
}
