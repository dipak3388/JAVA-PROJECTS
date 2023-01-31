package encapsulation;

public class Bank 
{
	String bank = "BANK OF MAHARASHTRA";
	private String acc_hol_name;
	private long acc_Number;
	private int upi;
	private double acc_Balance;

	//HERE I CREATED A PARAMETERISED CONSTRUTOR
	public Bank(String acc_hol_name, long acc_Number, int upi, double acc_Balance) 
	{
		this.acc_hol_name = acc_hol_name;
		this.acc_Number = acc_Number;
		this.upi = upi;
		this.acc_Balance = acc_Balance;
	}

	//BELLOW I CREATED A GETTER AND SETTER METHODS FOR ALL VARIABLE
	public String getAcc_hol_name() 
	{
		return acc_hol_name;
	}
	
	public void setAcc_hol_name(String acc_hol_name,int newupi) 
	{
	//HERE I USED THE VALIDATION AND VERIFICATION FOR THE DATA
		if(this.upi==newupi)
		{
			this.acc_hol_name = acc_hol_name;
			System.out.println("ACCOUNT HOLDER NAME CHANGE SUCCESSFULLY");
		}
		else
		{
			System.out.println("INVALID UPI NUMBER");
		}		
	}
	public int getUpi() 
	{
		return upi;
	}
	public void setUpi(int upi) 
	{
		this.upi = upi;
	}
	
	public long getAcc_Number() 
	{
		return acc_Number;
	}
	public void setAcc_Number(long newacc_Number,int newupi) 
	{
		if(this.upi==newupi)
		{
			this.acc_Number = newacc_Number;
			System.out.println("ACCOUNT HOLDER NUMBER CHANGE SUCCESSFULLY");
		}
		else
		{
			System.out.println("INVALID UPI NUMBER");
		}
	}	
	public double getAcc_Balance() 
	{
		return acc_Balance;
	}
	public void setAcc_Balance(double acc_Balance,int newupi) 
	{
		if(this.upi==newupi)
		{
			this.acc_Balance = acc_Balance;
			System.out.println("ACCOUNT BALANCE CHANGE SUCCESSFULLY");
		}
		else
		{
			System.out.println("INVALID UPI NUMBER");
		}	
	}
	
	//HERE I CREATED A NON STATIC METHOD TO GET ALL THE DATA
	public void data()
	{
		System.out.println();
		System.out.println("THE BANK NAME IS :-"+this.bank);
		System.out.println("THE ACCOUNT HOLDER NAME IS :-"+this.acc_hol_name);
		System.out.println("THE ACCOUNT NUMBER IS :-"+this.acc_Number);
		System.out.println("THE UPI PIN IS :-"+this.upi);
		System.out.println("THE ACCOUNT BALANCE IS :-"+this.acc_Balance);
	}	
}
