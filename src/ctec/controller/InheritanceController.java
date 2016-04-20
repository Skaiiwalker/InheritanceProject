package ctec.controller;

import java.util.ArrayList;
import ctec.model.Wallet;
import ctec.model.ZeldaWallet;
import ctec.model.ImaginaryWallet;
import java.awt.List;

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
	
	public Wallet getWallets()
	{
		
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
	
	public void insertionSort()
	{
		
	}
}
