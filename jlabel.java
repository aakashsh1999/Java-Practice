//Example of JLabel

import javax.swing.*;

class label
{
	public static void main(String args[])
		{
			JFrame f=new JFrame("User Details");
			JLabel l1, l2;
			l1=new JLabel("Aakash Sharma");
			l2=new JLabel("Amit Sharma");
			l1.setBounds(100, 170,200,40);
			l2.setBounds(150, 235,200,40);
			f.add(l1);
			f.add(l2);
			f.setSize(400,500);
			f.setLayout(null);
			f.setVisible(true);
		}
}

