//Program to illustrat the Example of the applet
import java.awt.*;
import java.applet.*;
class HelloApplet extends Applet
{ 	int a;
	@Override
	int init()
	{
		return a;
	}
			public void paint(Graphics g)
					{
					  g.drawString("Hello World", 50, 50);
					showStatus("applet is not running");
					}

}