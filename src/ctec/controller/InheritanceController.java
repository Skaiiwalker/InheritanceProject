package ctec.controller;

import java.util.ArrayList;
import ctec.model.Wallet;
import ctec.model.ZeldaWallet;
import ctec.model.ImaginaryWallet;
import ctec.model.WeirdThing;
import java.awt.List;
import ctec.view.InheritanceFrame;

public class InheritanceController 
{
	private int start;
	private InheritanceFrame baseFrame;
	
	public InheritanceController()
	{
		//build all model components
		this.weirdThings = new ArrayList<WeirdThing>();
		makeWeirdList();
		baseFrame = new InheritanceFrame(this);
	}
	private ArrayList<WeirdThing> weirdThings;
	
	public String showWeirdLevels()
	{
		String weirdThings = "";
		for(WeirdThing currentWeird : weirdThings)
		{
			weirdLevels.concat("This is a " + currentWeird.toString() + " and has a weirdness level of " + currentWeird.weirdnessLevel() + "\n");
		}
		
		return weirdLevels;
	}
	
	private void makeWeirdList()
	{
		weirdThings.add(new ZeldaWallet());
		weirdThings.add(new ImaginaryWallet());
	}
	
	public void start()
	{
		
	}
	
	public void insertionSort()
	{
		
	}
}
