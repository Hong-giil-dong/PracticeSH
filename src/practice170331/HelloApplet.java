package practice170331;
import java.awt.*;
public class HelloApplet extends java.applet.Applet
{
	public void paint(Graphics g) {
		setBackground(Color.lightGray);// ���ø��� ������ ���� ȸ������ ����
		g.drawString("Hello, Applet.",50,50);
	}
}