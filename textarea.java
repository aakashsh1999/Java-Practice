//TexArea
import javax.swing.*;
class textarea
{
	public static void main(String args[])	{

		JFrame f=new JFrame("User Details");
			JTextArea l1;
			l1=new JTextArea("Field 1");
			l1.setBounds(100, 170,200,40);
			f.add(l1);
			f.setSize(400,500);
			f.setLayout(null);
			f.setVisible(true);




	}
}