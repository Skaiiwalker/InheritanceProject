package ctec.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ctec.controller.InheritanceController;
import ctec.model.Wallet;

public class InheritancePanel extends JPanel
{
	private InheritanceController baseController;
	private JButton sortButton;
	private JTextArea textArea;
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				
				textArea.setText(baseController.showMoneyAmount());
				
				String temp = "the sorted contents are: \n";
				for(Wallet current : baseController.getWallets())
				{
					temp += current.toString() + "\n";
				}
				textArea.setText(temp);
			}
		});
	}
}
