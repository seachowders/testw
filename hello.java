import java.awt.*;
import java.applet.Applet;

public class hello extends Applet
{
public void paint(Graphics g)
{
super.paint(g);
g.setColor(Color.blue);
g.drawString("hello world", 20, 20);
}
}