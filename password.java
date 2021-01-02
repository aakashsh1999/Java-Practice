import javax.swing.*;
class password

{
	public static void main(String args[])	{

		JFrame f=new JFrame("User Details");
			JPasswordField l1,l2;
			JLabel z=new JLabel("Password 1");
			z.setBounds(60, 170,200,40);
			JLabel y=new JLabel("Password 2");
			y.setBounds(60, 200,200,40);
			l1=new JPasswordField();
			l1.setBounds(100, 170,200,40);
			l2=new JPasswordField();
			l2.setBounds(100, 200,200,40);
			f.add(z);
			f.add(y);
			f.add(l2);
			f.add(l1);
			f.setSize(400,500);
			f.setLayout(null);
			f.setVisible(true);




	}
}