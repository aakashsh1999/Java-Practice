//Program to illustrate the use of event handling
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class EventTest implements ActionListener
{
	public static void main(String arg[])
	{
			JFrame f=new JFrame("Event test");
			f.setBounds(400, 400, 400, 400);
			f.setLayout(null);
			f.setVisible(true);
			JButton b=new JButton("Click Here");
			b.setBounds(200,200,100,50);
			b.addActionListener(this);
			f.add(b);
			public void actionPerformed(ActionEvent ae)
			{
				String str=b.getText();
				b.setText(str.toUpper());
				
			}

	}
}