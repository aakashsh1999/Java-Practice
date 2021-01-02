					import javax.swing.*;
					class radiobutton
					{
						public static void main(String args[])	{

							JFrame f=new JFrame("User Details");
								JRadioButton l1,l2;
								l1=new JRadioButton("Male");
								l1.setBounds(150, 200,200,40);
								l2=new JRadioButton("Female",true);
								l2.setBounds(100, 170,200,40);
								f.add(l2);
								f.add(l1);
								f.setSize(400,500);
								f.setLayout(null);
								f.setVisible(true);




						}
					}