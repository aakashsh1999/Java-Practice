//Program to illustrate the use of event handling
import java.util.event;
import javax.swing.*;
class buttontest extends JFrame	implements ActionListener
{	
		JFrame f;
		JButton b;
		buttontest()
		{
			f=new JFrame("Event Handle");
			f.setBounds(200, 200, 400, 400);
			f.setVisible(true);
			f.setLayout(null);
			b=new JButton("Clear Here");
			b.setBounds(100, 100, 100, 50);
			f.add(b);
			b.addActionListener(this);
		}
		@Override
		public void actionPerformed(ActionEvent ae)
		{
		JOptionPane.showMessageDialog(null, "Hello Aakash");
	}


		public static void main(String arg[])
		{
				buttontest b=new buttontest();

		}
}