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
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	
	public InheritancePanel(InheritanceController baseController)
	{
		this.baseController = baseController;
		sortButton = new JButton("Click here to sort the data");
		textArea = new JTextArea(10, 20);
		baseLayout = new SpringLayout();
		
		setupPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPane()
	{
		textPane = new JScrollPane();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(textPane);
		this.add(sortButton);
		textArea.setText(baseController.showWeirdLevels());
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				
				textArea.setText(baseController.showWeirdLevels());
			}
		});
	}
}
