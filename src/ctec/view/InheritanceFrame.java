package ctec.view;

import ctec.controller.InheritanceController;
import ctec.view.InheritancePanel;
import javax.swing.*;

/**
 * 
 * @author Luke Barrowes
 *@version 0.x Apr 20, 2016
 */

public class InheritanceFrame extends JFrame
{
	private InheritanceController baseController;
	private InheritancePanel basePanel;
	
	public InheritanceFrame(InheritanceController baseController)
	{
		this.baseController = baseController;
		this.basePanel = new InheritancePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);;
		this.setSize(600,600);
		this.setTitle("inheritance Frame");
		
	}
}
