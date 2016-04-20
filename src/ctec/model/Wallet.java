package ctec.model;

public abstract class Wallet 
{
	private String ownerName;
	private String topCard;
	private int money;
	
	public String getOwnerName() 
	{
		return ownerName;
	}
	
	public String getTopCard() 
	{
		return topCard;
	}
	
	public int getMoney() 
	{
		return money;
	}
	
	public void setOwnerName(String ownerName) 
	{
		this.ownerName = ownerName;
	}
	
	public void setTopCard(String topCard) 
	{
		this.topCard = topCard;
	}
	
	public void setMoney(int money) 
	{
		this.money = money;
	}
	
	
	/**
	 * If the supplied variable compared comes before the calling variable
	 * return 1
	 * If the supplied variable is after the calling variable return -1
	 * Else if they are the same, return 0
	 */
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof Wallet)
		{
			if(this.getMoney() > ((Wallet) compared).getMoney())
			{
				comparedValue = 1;
			}
			else if(this.getMoney() < ((Wallet) compared).getMoney())
			{
				comparedValue = -1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		
		return comparedValue;
	}
}
