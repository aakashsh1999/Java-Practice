//Program to illustrate the MyMousetest innnser class
import java.awt.*;
import java.applet.*;
class MyMouseAdapterInner extends Applet
{
	public void init()
		{
			addMouseListener(new MyMouseAdapter());

		}
		class MyMouseAdapter extends MouseAdapter
		{
		public void mouseClicked(MouseEvent me)
			{
				showStatus("Mouse Clicked")
;			}
		}
	}
