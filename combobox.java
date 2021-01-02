		import javax.swing.*;
		class combobox
		{
			public static void main(String args[])	{

				JFrame f=new JFrame("User Details");
					String country[]={"India", "USA","Nepal","Sri Lanka"};
					JComboBox cb=new JComboBox(country);
					cb.setBounds(100, 170,200,40);
					f.add(cb);
					f.setSize(400,500);
					f.setLayout(null);
					f.setVisible(true);

			}
		}