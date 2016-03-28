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
}
