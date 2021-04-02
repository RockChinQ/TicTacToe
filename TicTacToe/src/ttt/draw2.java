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

public class draw2 extends JPanel{
	int w;
	int h;
	BufferedImage bi;
	Graphics2D g;
	int mode=-1,x=0,y=0,xe=0,ye=0,la=0;
	StringBuffer str=new StringBuffer("");
	Image img=Toolkit.getDefaultToolkit().createImage(main.lan+"main.png");
	Image io=Toolkit.getDefaultToolkit().createImage(main.lan+"o.png");
	Image ix=Toolkit.getDefaultToolkit().createImage(main.lan+"x.png");
	Image wel=Toolkit.getDefaultToolkit().createImage(main.lan+"welcome.png"),stop=Toolkit.getDefaultToolkit().createImage(main.lan+"stop.png"),play=Toolkit.getDefaultToolkit().createImage(main.lan+"playing.png"),pau=Toolkit.getDefaultToolkit().createImage(main.lan+"pause.png");
	Image ow=Toolkit.getDefaultToolkit().createImage(main.lan+"owon.png"),xw=Toolkit.getDefaultToolkit().createImage(main.lan+"xwon.png"),ad=Toolkit.getDefaultToolkit().createImage(main.lan+"adraw.png");
	draw2(int w,int h){
		this.w=w;
		this.h=h;
		bi=new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
		g=bi.createGraphics();
		((Graphics2D) g).setStroke(new BasicStroke(2));
	}
	public void paint(Graphics g0){
		/*g.setColor(Color.black);
		g.fillRect(0, 0, 400, 290);
		g.setColor(new Color(6,206,182));
		g.fillRect(0, 0, 400, 2);*/
		g.drawImage(img, 0, 0, this);
		g.drawImage(main.ga.state==-1?wel:(main.ga.state==0?stop:(main.ga.state==1?play:pau)), 35,10, this);
		for(int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				//System.out.print(main.ga.gameboard[a][b]);
				if(main.ga.gameboard[a][b]!=0){
					g.drawImage(main.ga.gameboard[a][b]==1?io:ix, a*47+58, b*45+65, this);
				}
			}
			//System.out.print("\n");
		}
		if(main.ga.state==0){
			//main.w.g.setTitle("Tic Tac Toe");
			g.drawImage(main.ga.won==1?ow:(main.ga.won==0?ad:xw), 5, 15, this);
		}
		g.drawImage(main.ga.now==1?io:ix, 100, 220, this);
		g0.drawImage(bi, 0, 0, this);
	}
}
