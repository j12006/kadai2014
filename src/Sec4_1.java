import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class Sec4_1 extends Applet{
	public void paint(Graphics g) {
		g.drawLine(60, 10, 60, 350);//串の指定
		g.setColor(Color.red);//色を赤に指定
		g. fillOval(10, 10, 100, 100);//赤団子の指定
		g.setColor(Color.green);//色を緑に指定
		g.fillOval(10, 110, 100, 100);//緑団子の指定
		g.setColor(Color. blue);//色を青に指定
		g.fillOval(10, 210, 100, 100);//青団子の指定
	}

}
