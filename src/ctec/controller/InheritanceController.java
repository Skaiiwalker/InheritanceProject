package ctec.controller;

import java.util.ArrayList;
import ctec.model.Wallet;
import ctec.model.ZeldaWallet;
import ctec.model.ImaginaryWallet;

public class InheritanceController 
{
	public InheritanceController()
	{
		//build all model components
		makeWalletList();
		//build view
	}
	private ArrayList<Wallet> wallets;
	
	public String showMoneyAmount()
	{
		String moneyAmount = "";
		
		return moneyAmount;
	}
	
	private void makeWalletList()
	{
		wallets.add(new ZeldaWallet());
		wallets.add(new ImaginaryWallet());
		//keep going....
	}
	
	public void start()
	{
		
	}
}
