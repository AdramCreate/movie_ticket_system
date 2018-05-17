package movieTicketSystem;

public class movieTicket {
	public String movieTitle;
	public String startTime;
	public int theaterNum;
	public double cost;
	
	movieTicket(String title, String time, int tNum, double cost){
		movieTitle = title;
		startTime = time;
		theaterNum = tNum;
		this.cost = cost;
	}
	
	movieTicket(){
		movieTitle = "";
		startTime = "00:00";
		theaterNum = 1;
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
	
	public void setTitle(String title) {
		movieTitle = title;
	}
	
	public void setTime(String time) {
		startTime = time;
	}
	
	public void setTheaterNum(int tNum) {
		theaterNum = tNum;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "Ticket Information: \n\tTitle: " + this.getTitle() + "\n\tTime: " + this.getTime() + "\n\tTheater Number: " + this.getTheaterNum() 
			+ "\n\tCost: $" + this.getCost();
	}
}
