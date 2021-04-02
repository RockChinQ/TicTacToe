package ttt;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JFrame;
public class gui extends JFrame{
	class nnn{}
	public static GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
	public static Rectangle rec=ge.getDefaultScreenDevice().getDefaultConfiguration().getBounds();
	public static int xl=(int)rec.getWidth();
	public static int yl=(int)rec.getHeight();
	int i=0;
	static Image img;
	Thread t=new Thread();
	gui(int x,int y,int lx,int ly,boolean b,String til,boolean exb,boolean sizec,boolean center){
		this.setTitle(til);
		this.setLocation(lx, ly);
		this.setSize(x, y);
		this.setVisible(b);
		img=Toolkit.getDefaultToolkit().createImage("file\\Í¼±ê.jpg");
		this.setIconImage(img);
		this.requestFocus();
		this.setResizable(sizec?true:false);
		if(exb){
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		if(center){
			this.setLocation(xl/2-x/2,yl/2-y/2);
		}
	}
	public void setTitle2(String s){
		this.setTitle(s);
		/*
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}
}
