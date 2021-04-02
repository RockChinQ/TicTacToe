package ttt;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.plaf.nimbus.State;

public class draw_ttt extends JPanel{
	int w;
	int h;
	BufferedImage bi;
	Graphics2D g;
	int mode=-1,x=0,y=0,xe=0,ye=0,la=0;
	StringBuffer str=new StringBuffer("");
	Image io=Toolkit.getDefaultToolkit().createImage(main.lan+"o.png");
	Image ix=Toolkit.getDefaultToolkit().createImage(main.lan+"x.png");
	Image ttt=Toolkit.getDefaultToolkit().createImage(main.lan+"ttt.png");
	int step=0;
	draw_ttt(){
		this.w=151;
		this.h=145;
		bi=new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
		g=bi.createGraphics();
		((Graphics2D) g).setStroke(new BasicStroke(2));
	}
	public void paint(Graphics g0){
		/*g.setColor(Color.black);
		g.fillRect(0, 0, 400, 290);
		g.setColor(new Color(6,206,182));
		g.fillRect(0, 0, 400, 2);*/
		
		g.drawImage(ttt, 0, 0, this);
		int now=Integer.parseInt(new file0().read("record.txt").split(";")[main.recor.filelen-main.recor.cho-1].split("[*]")[0]);
		String nowf=new file0().read("record.txt").split(";")[main.recor.filelen-main.recor.cho-1];
		String loas=nowf.split("[*]")[3];
		for(int a=0;a<step;a++){
			//System.out.println(Integer.parseInt(loas.split(":")[a].split(" ")[0])+" "+Integer.parseInt(loas.split(":")[a].split(" ")[1]));
			g.drawImage(now==1?io:ix,Integer.parseInt(loas.split(":")[a].split(" ")[0])*49+10,Integer.parseInt(loas.split(":")[a].split(" ")[1])*45+9, this);
			now=now==1?2:1;
		}
		g0.drawImage(bi, 0, 0, this);
	}
	void setStep(int s){
		this.step=s;
	}
}
