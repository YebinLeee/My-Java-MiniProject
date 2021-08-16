package classes;

import java.awt.*;
import javax.swing.*;

public class List extends JPanel{

	List(){
		GridLayout layout = new GridLayout(4,1);
		layout.setVgap(5);
		
		this.setLayout(layout);
		// this.setBackground(Color.LIGHT_GRAY);
	}
	
	public void updateNumbers()
	{
		Component[] listItems = this.getComponents();
		
		for(int i=0;i<listItems.length;i++)
		{
			if(listItems[i] instanceof Task)
			{
				((Task)listItems[i]).changeIndex(i+1);
				
			}
		}
	}
}

