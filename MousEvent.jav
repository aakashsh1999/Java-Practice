//Program to illustrate the event handlling 
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MouseEvent1 extends Applet implements MouseListener
{
	String msg="";	//Blank Message 
	int x=0, y=0; //X and Y axis initialisation
	public void init()
		{
		addMouseListener(this);//Initializing the method
		}
//Handling the MouseEvent
public void mouseClicked(MouseEvent me)
{
	 x=0;
	 y=10;
	 msg="Mouse Clicked";
	 repaint();
}
public void mouseEntered(MouseEvent me)
{
	 x=0;
	 y=10;
	 msg="Mouse Entered";
	 repaint();
}
public void mouseExited(MouseEvent me)
{
	 x=0;
	 y=10;
	 msg="Mouse Exited";
	 repaint();
}
public void mousePressed(MouseEvent me)
{
	 x=me.getX();
	 y=me.getY();
	 msg="Mouse Pressed";
	 repaint();
}
public void mouseReleased(MouseEvent me)
{
	 x=me.getX();
	 y=me.getY();
	 msg="Mouse Realesed;
	 repaint();
}
public void paint(Graphics g)
	{
		g.drawString(msg,x, y);
	}

}