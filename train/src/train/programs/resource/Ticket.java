package train.programs.resource;

public class Ticket {
	int ticketNumber;
	int boarding;
	String destination;
	String date;
	int seatNumber;
	
	
	public Ticket(int ticketNumber, int boarding, String destination, String date, int seatNumber) {
		this.ticketNumber = ticketNumber;
		this.boarding = boarding;
		this.destination = destination;
		this.date = date;
		this.seatNumber = seatNumber;
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public int getBoarding() {
		return boarding;
	}

	public void setBoarding(int boarding) {
		this.boarding = boarding;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public int getSeatNumber() {
		return seatNumber;
	}
	public void ticketDetails() {
		System.out.println("================================================");
		System.out.println("\nPASSENGER TICKET NUMBER IS : "+getTicketNumber());
		System.out.println("\nBOARDING : "+getBoarding());
		System.out.println("\nDESTINATION : "+getDestination());
		System.out.println("\nDATE : "+getDate());
		System.out.println("\nSEAT NUMBER : "+getSeatNumber());
		System.out.println("================================================");
	}
	
}
