package train.programs.resource;

public class Train {
	static String trainName = "MAHALAXMI EXPRESS";
	static int trainNumber = 1234;
	
	Passenger passenger;

	public String bookedTicket(Passenger passenger) {
		if (this.passenger==null) {
			this.passenger=passenger;
			return "\nTICKET BOOKED SUCCESSFULLY...!!\n";
		} else {
			return "\nNO SEAT AVAILABLE...??\n";
		}		
	}
	
	public void cancelTicket() {
		if (this.passenger==null) {
			System.out.println("\nNO DATA FOUND...\n");
		} else {
			this.passenger=null;
			System.out.println("\nTICKET CANCELLED SUCCESSFULLY...|||\n");
		}
	}
	
	public  void journeyDetails() {
		if(this.passenger==null)
		{
			System.out.println("\nNO PASSENGER FOUND...\n");
		}
		else
		{
			System.out.println("\n================================================");
			System.out.println("THE TRAIN NAME IS : "+trainName);
			System.out.println("THE TRAIN NUMBER IS : "+trainNumber);
			System.out.println("================================================");
			System.out.println("PASSENGER NAME IS : "+passenger.getPassengerNameString());
			System.out.println("PASSENGER CONTACT NUMBER IS : "+passenger.getPassengerContact());
			System.out.println("PASSENGER GENDER IS : "+passenger.getPassengerGendeString());
			System.out.println("PASSENGER AGE IS : "+passenger.getPassengerAge());
			System.out.println("================================================");		
			System.out.println("================================================\n");
				
		}
	}
}
