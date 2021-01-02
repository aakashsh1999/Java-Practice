import javax.swing.*;

class firstSwing2{

	JFrame f;
	firstSwing2()
		{
		f=new JFrame("First Swing 2");
		JButton b=new JButton("Click me");
		b.setBounds(170,200, 200,40);
		f.add(b);
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
		}	
public static void main(String args[])	
	{
			new firstSwing2();
	}


}