import javax.swing.*;

class firstSwing
{
	public static void main(String args[])
		{
			JFrame f=new JFrame("First Swing");
			JButton b=new JButton("Click me");
			b.setBounds(100,130,100,40);
			f.add(b);	//Adding Button in the Frame
			f.setSize(400,500);
			f.setLayout(null);
			f.setVisible(true);
		}

}