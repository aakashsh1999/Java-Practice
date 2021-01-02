import javax.swing.*;

class usingextends extends JFrame
{
	JFrame f;
	usingextends()
		{

			JButton b=new JButton("Click me");
			b.setBounds(100,100,200,40);
			add(b);
			setSize(400,500);
			setLayout(null);
			setVisible(true);

		}

public static void main(String args[])
		{
		new usingextends();
		}


}

