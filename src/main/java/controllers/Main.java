package controllers;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner _scanner = new Scanner(System.in);
		OrderFunctions _orderFunctions = new OrderFunctions();
		String _input = "";
		
		while(true) {
			System.out.println("Would you like to purchase a ticket today? y/n");
			_input = _scanner.nextLine();
			if(_input.equals("y")) {
				_orderFunctions.ticketOrderOperation();
				break;
			} 
			else if(_input.equals("n")) {
				System.out.println("System shall now end.");
				break;
			}
			else {
				System.out.println("Invalid input. Please try again.");
			}
		}
		_scanner.close();
	}
	
	/*public static void ticketOrderOperation() {
		movieTicket ticket1 = new movieTicket("Star Wars", "16:00", 5, 7.50);
		movieTicket ticket2 = new movieTicket("It", "03:00", 3, 12.00);
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		while(true) {
			System.out.println("Enter the number of the ticket you would like to purchase:\n1) " + ticket1 + "\n2) " + ticket2);
			input = scanner.nextLine();
			if(input.equals("1")) {
				orderInfoEntry(ticket1);
				break;
			}
			else if(input.equals("2")) {
				orderInfoEntry(ticket2);
				break;
			} 
			else {
				System.out.println("Invalid input. Please try again.");
			}
		}
		scanner.close();
	}
	
	public static void orderInfoEntry(movieTicket ticket) {
		Scanner scanner = new Scanner(System.in);
		String input = "", theaterName = "Cinemark";
		int numTickets;
	
		System.out.println("Enter your name: ");
		input = scanner.nextLine();
		
		while(true) {
			System.out.println("Enter number of tickets: ");
			try {
				numTickets = Integer.parseInt(scanner.nextLine());
				ticketOrder newOrder = new ticketOrder(ticket, numTickets, theaterName, input);
				System.out.println("Here is your new ticket order:\n" + newOrder+ "\nEnjoy your movie!");
				//scanner.close();
				break;
			}
			catch(Exception e){
				System.out.println("Invalid number. Please try again.");
			}
		}
		scanner.close();
	}*/
}
