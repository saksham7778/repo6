import java.awt.*;

class MyPanel extends Panel
{
int x1,y1,x2,y2;
public void paint(Graphics g)
{
g.drawOval(x1,y1,x2-x1,y2-y1);
}
}