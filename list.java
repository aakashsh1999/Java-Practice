//Program to Print list on Swing
import javax.swing.*;
class list
{
	JFrame f;
	list()
		{
		f=new JFrame("Fruits List");
		DefaultListModel <String> li=new DefaultListModel<>();
		li.addElement("Apple");
		li.addElement("Mango");
		li.addElement("banana");
		li.addElement("Papaya");
		JList <String> list=new JList<>(li);
		list.setBounds(100,200,100,50);
		f.add(list);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
				}
	public static void main(String args[])
		{
		new list();
		}

}