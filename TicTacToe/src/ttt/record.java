package ttt;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class record {
	gui g=new gui(600,427,0,0,false,"Record",false,false,true);
	JLabel bg=new JLabel(new ImageIcon(main.lan+"gamere.png"));
	int filelen=new file0().read("record.txt").split(";").length;
	JButton[] jls=new JButton[filelen];
	JLabel none=new JLabel(new ImageIcon(main.lan+"none.png"));
	int cho=0;
	int step=0;
	mystack lasts=new mystack("0"),nexts=new mystack("1");
	draw_ttt dt=new draw_ttt(),dt1=new draw_ttt();
	JButton last=new JButton(new ImageIcon(main.lan+"last.png")),next=new JButton(new ImageIcon(main.lan+"next.png"));
	int flen=0;
	record(){
		g.addWindowListener(new WindowListener(){
			public void windowActivated(WindowEvent arg0) {
			}
			public void windowClosed(WindowEvent arg0) {
			}
			public void windowClosing(WindowEvent arg0) {
				main.w.g.setEnabled(true);
			}
			public void windowDeactivated(WindowEvent arg0) {
			}
			public void windowDeiconified(WindowEvent arg0) {
			}
			public void windowIconified(WindowEvent arg0) {
			}
			public void windowOpened(WindowEvent arg0) {
			}
		});
		try{
			g.setLayout(null);
			mystack flss=new mystack("2212");
			for(int a=0;filelen!=0&&a<filelen;a++){
				flss.push(new file0().read("record.txt").split(";")[a]);
			}
			for(int a=0;filelen!=0&&a<Math.min(filelen, 11);a++){
				String tes=flss.pop().toString();
				jls[a]=new JButton(tes.split("[*]")[2]+"结束的  赢家"+(tes.split("[*]")[1].equals("1")?"O":(tes.split("[*]")[1].equals("0")?"平局":"X"))+" 模式："+(tes.split("[*]")[4].equals("1")?"人机对战":"双人游戏"));
				jls[a].setSize(400,30);
				//jls[a].setBackground(new Color((int)a*13,(int)a*13,(int)a*13));
				jls[a].setBackground(new Color(6,206,182));
				jls[a].setLocation(1, a*31+46);
				jls[a].setBorder(BorderFactory.createLineBorder(Color.white,2));//a%2==0?Color.green:new Color(255,201,14)
				jls[a].addActionListener(new action1());
				jls[a].addMouseListener(new action1());
				g.add(jls[a]);
			}
			jls[0].setBorder(BorderFactory.createLineBorder(Color.orange,2));
			last.setSize(70, 25);
			last.setLocation(510, 45);
			last.addActionListener(new last_next());
			g.add(last);
			next.setSize(70, 25);
			next.setLocation(510, 222);
			next.addActionListener(new last_next());
			g.add(next);
			dt.setSize(151, 145);
			dt1.setSize(151, 145);
			dt.setLocation(430, 76);
			dt1.setLocation(430, 252);
			g.add(dt);
			g.add(dt1);
		}catch(ArrayIndexOutOfBoundsException e){
			none.setSize(620,430);
			none.setLocation(0,0);
			g.add(none);
			//e.printStackTrace();
		}
		
		bg.setSize(620,400);
		bg.setLocation(-10, 0);
		g.add(bg);
		g.setVisible(true);
	}
	void refresh(){
		flen=new file0().read("record.txt").split(";")[main.recor.cho].split("[*]")[3].split(":").length;
	}
}
