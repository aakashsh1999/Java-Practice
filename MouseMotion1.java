//Program to  get the Mouse Motion Handling
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
class MouseMotion1 extends Applet implements MouseMotionListener
{
	String msg="";
	int x=0, y=0;
	public void init()
	{
	 addMouseMotionListener(this);
	 }
public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		msg="+";
		showStatus("Dragging the Mouse" +x+ " " +y);

	}
	public void mouseMoved(MouseEvent me)
		{
		showStatus("Moving the Mouse " +me.getX()+ me.getY());
		}
public void paint(Graphics g)
	{
		g.drawString(msg, x,y);
	}
}
