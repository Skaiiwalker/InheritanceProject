package ctec.model;

import javax.swing.JOptionPane;
/**
 * 
 * @author Luke Barrowes
 * @version 1.0 4/12/2016
 */
public class ZeldaWallet extends Wallet 
{
	/**
	 * 
	 */
	public ZeldaWallet()
	{
		this.setMoney(0);
		this.setOwnerName("Luke");
		this.setTopCard("McDonalds Gift Card");
	}
	
	public int amountOfMoney()
	{
		int amountOfMoney = this.getMoney();
		
		return amountOfMoney;
	}
	
	public String topCard()
	{
		String topCard = this.getTopCard();
		
		return topCard;
	}
	
	public void payForStuff(int expense)
	{
		
	}
	
	public String toString()
	{
		String description = "This is a " + this.getClass() + " and has a " + topCard();
		
		return description;
	}
	
	/**
	 * If the supplied variable compared comes before the calling variable return -1.
	 * If the supplied variable is after the calling variable return 1.
	 * Else if they are the same, return 0.
	 */
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if( compared instanceof Wallet)
		{
			if(this.amountOfMoney() > ((Wallet) compared).getMoney())
			{
				comparedValue = 1;
			}
			else if(this.amountOfMoney() < ((Wallet) compared).getMoney())
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
