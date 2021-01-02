//Menu Button
import javax.swing.*;

class menu
{
JMenu Menu, submenu;
JMenuItem a,b, c,d , e;
menu()
	{
		JFrame f=new Frame("menu bar");
		JMenuBar mb=new MenuBar();
		mb.setBounds(20,30,50,100);
		Menu=new JMenu("Menu");
		submenu=new JMenu("submenu");
		a=new jMenuItem("Item 1");
		b=new jMenuItem("Item 2");
		c=new jMenuItem("Item 3");
		d=new jMenuItem("Item 4");
		e=new jMenuItem("Item 5");
		Menu.add(1);
		Menu.add(2);
		Menu.add(3);
		submenu.add(4);
		submenu.add(5);
		mb.add(menu);
		f.add(mb);
		f.setSize(500,400);
		f.setLayout(null);
		f.setVisible(true);

		}
		public static void main(String args[])
			{
				new menu();
			}

}