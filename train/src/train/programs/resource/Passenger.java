package train.programs.resource;

public class Passenger {
	String passengerName;
	int passengerAge;
	String passengerGender;
	long passengerContact;
	
	public Passenger(String passengerNameString, int passengerAge, String passengerGendeString, long passengerContact) {
		this.passengerName = passengerNameString;
		this.passengerAge = passengerAge;
		this.passengerGender = passengerGendeString;
		this.passengerContact = passengerContact;
	}

	public String getPassengerNameString() {
		return passengerName;
	}

	public void setPassengerNameString(String passengerNameString) {
		this.passengerName = passengerNameString;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getPassengerGendeString() {
		return passengerGender;
	}

	public void setPassengerGendeString(String passengerGendeString) {
		this.passengerGender = passengerGendeString;
	}

	public long getPassengerContact() {
		return passengerContact;
	}

	public void setPassengerContact(long passengerContact) {
		this.passengerContact = passengerContact;
	}
	
	
	
	
}
