import java.awt.*;
import java.awt.event.*;

class Paint implements MouseMotionListener,MouseListener
{
Frame f;
MyPanel p;
Label l;
Paint()
{
f=new Frame("Untitled-MSPaint");
p=new MyPanel();
p.addMouseMotionListener(this);
p.addMouseListener(this);
l=new Label("0,0");
l.setFont(new Font("Arial",1,24));
f.add(p);
f.add(l,BorderLayout.SOUTH);
f.setSize(400,400);
f.setVisible(true);
}
public static void main(String ar[])
{
Paint p=new Paint();
}
public void mouseMoved(MouseEvent e)
{
String str=e.getX()+","+e.getY();
l.setText(str);
}
public void mouseDragged(MouseEvent e)
{
p.x2=e.getX();
p.y2=e.getY();
p.repaint();

}
public void mouseEntered(MouseEvent e)
{
}
public void mouseExited(MouseEvent e)
{
}
public void mousePressed(MouseEvent e)
{
System.out.println("You Clicked at"+e.getX()+" and "+e.getY());
p.x1=e.getX();
p.y1=e.getY();
}
public void mouseReleased(MouseEvent e)
{
}
public void mouseClicked(MouseEvent e)
{
}

}











