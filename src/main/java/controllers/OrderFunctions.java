package controllers;

import java.util.Scanner;

import models.movieTicket;
import models.ticketOrder;

public class OrderFunctions {
	movieTicket ticket1 = new movieTicket("Star Wars", "16:00", 5, 7.50);
	movieTicket ticket2 = new movieTicket("It", "03:00", 3, 12.00);
	String theaterName = "Cinemark";
	
	public void ticketOrderOperation() {
		Scanner _scanner = new Scanner(System.in);
		String _input = "";
		
		while(true) {
			System.out.println("Enter the number of the ticket you would like to purchase:\n1) " + ticket1 + "\n2) " + ticket2);
			_input = _scanner.nextLine();
			if(_input.equals("1")) {
				orderInfoEntry(ticket1);
				break;
			}
			else if(_input.equals("2")) {
				orderInfoEntry(ticket2);
				break;
			} 
			else {
				System.out.println("Invalid input. Please try again.");
			}
		}
		_scanner.close();
	}
	
	public void orderInfoEntry(movieTicket ticket) {
		Scanner _scanner = new Scanner(System.in);
		String _input = "";
		int _numTickets;
	
		System.out.println("Enter your name: ");
		_input = _scanner.nextLine();
		
		while(true) {
			System.out.println("Enter number of tickets: ");
			try {
				_numTickets = Integer.parseInt(_scanner.nextLine());
				ticketOrder newOrder = new ticketOrder(ticket, _numTickets, theaterName, _input);
				System.out.println("Here is your new ticket order:\n" + newOrder+ "\nEnjoy your movie!");
				//scanner.close();
				break;
			}
			catch(Exception e){
				System.out.println("Invalid number. Please try again.");
			}
		}
		_scanner.close();
	}
}
