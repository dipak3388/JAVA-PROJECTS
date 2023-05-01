package train.programs.main;

import java.util.Scanner;

import train.programs.resource.Passenger;
import train.programs.resource.Ticket;
import train.programs.resource.Train;

public class TrainDriver {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Train train = new Train();
		boolean exit = true;
		
		while(exit) {
			System.out.println("ENTER \n 1. GET TICKET \n 2. CANCEL TICKET \n 3. DISPLAY PASSENGER DETAILS \n 4. DISPLAY TICKET DETAILS \n 5. EXIT");
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:{
					System.out.println("ENTER PASSENGER NAME");
					String name=scanner.next();
					System.out.println("ENTER PASSENGER AGE");
					int age=scanner.nextInt();
					System.out.println("ENTER PASSENGER GENDER");
					String gender=scanner.next();
					System.out.println("ENTER PASSENGER MOBILE NUMBER");
					long contactNumber=scanner.nextLong();
					
					System.out.println(train.bookedTicket(new Passenger(name, age, gender, contactNumber)));
				}
				break;
				case 2:{
					train.cancelTicket();
				}
				break;
				case 3:{
					train.journeyDetails();
				}
				break;
				case 4:{
					Ticket ticket = new Ticket(101, 200, "PUNE STATION", "01-05-2023", 2000);
					ticket.ticketDetails();
				}
				break;
				case 5:{
					exit=false;
					System.out.println("THANK YOU...");
					scanner.close();
					
				}
				break;
	
				default:
					System.out.println("INVALID CHOICE");
					break;
			}
		}
	}

}
