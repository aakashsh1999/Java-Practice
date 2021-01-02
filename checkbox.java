//TexArea
import javax.swing.*;
class checkbox

{
	public static void main(String args[])	{

		JFrame f=new JFrame("User Details");
			JCheckBox l1,l2;
			l1=new JCheckBox("Field 1");
			l1.setBounds(100, 170,200,40);
			l2=new JCheckBox("Field 1",true);
			l2.setBounds(100, 170,200,40);
			f.add(l2);
			f.add(l1);
			f.setSize(400,500);
			f.setLayout(null);
			f.setVisible(true);




	}
}