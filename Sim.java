package encapsulation;

public class Sim 
{
	private String serviceProvider;
	private long simNo;
	private double balance;
	
	//PARAMETERISED CONSTRUCTOR
		public Sim(String serviceProvider, long simNo, double balance) 
		{
			this.serviceProvider = serviceProvider;
			this.simNo = simNo;
			this.balance = balance;
		}
	
	//GETTER METHOD IS USED TO GET THE DATA
	public String getServiceProvider()
	{
		return serviceProvider;
	}
	//SETTER METHOD IS USED TO SET THE DATA
	public void setServiceProvider(String serviceProvider)
	{
		this.serviceProvider=serviceProvider;
	}
	public long getSimNo() 
	{
		return simNo;
	}
	public void setSimNo(long simNo)
	{
		this.simNo = simNo;
	}
	public double getBalance() 
	{
		return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	//NON STATIC METHOD
	public void display()
	{
		System.out.println("Service Provider = "+this.serviceProvider);
		System.out.println("Sim No. = "+this.simNo);
		System.out.println("Balance = "+this.balance);
	}
		
}
