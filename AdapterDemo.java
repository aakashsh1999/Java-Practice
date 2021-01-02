//Program to illustrate the use of adapter class
import java.util.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class AdapterDemo extends Applet
{	public void init()
{
	addMouseListener(new MyMouseAdapter(this));
	}
}
class MyMouseAdapter extends MouseAdapter
{	
	AdapterDemo adapterdemo;
	public MyMouseAdapter(AdapterDemo adapterDemo)
		{
			this.adapterDemo=adapterDemo;
		}
		public void mouseClicked(MouseEvent me)
			{
			adapterDemo.showStatus("Mouse Clicked");
			}
}