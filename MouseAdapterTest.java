//Program to illustater the Adapter class

import java.applet.*;
import java.awt.event.*;
public class MouseAdapterTest extends Applet 
{
	public void init()
		{
			addMouseListener(new MyMouseAdapter(this));
		}

}
class MyMouseAdapter extends MouseAdapterTest //Extends the MouseAdapter Class
{ 
	MouseAdapterTest mat;
	public MyMouseAdapter(MouseAdapter me)
		{
			this.mat=me;
		}
	public void mouseClicked(MouseEvent me)
		{
			mat.showStatus("Mouse is clicked");
		}
}