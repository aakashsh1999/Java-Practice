//Menu Button
import javax.swing.*;

class menu
{
JMenu Menu, submenu;
JMenuItem 1,2,3,4,5;
menu()
	{
		JFrame f=new Frame("menu bar");
		JMenuBar mb=new MenuBar();
		mb.setBounds(20,30,50,100);
		Menu=new JMenu("Menu");
		submenu=new JMenu("submenu");
		1.new jMenu("Item 1");
		2.new jMenu("Item 2");
		3.new jMenu("Item 3");
		4.new jMenu("Item 4");
		5.new jMenu("Item 5");
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

}