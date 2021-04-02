package ttt;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class window {
	JFrame g=new JFrame();
	draw2 d=new draw2(400,290);
	Image img=Toolkit.getDefaultToolkit().createImage(main.lan+"g2.png");
	ImageIcon i0=new ImageIcon(main.lan+"sp.png"),i1=new ImageIcon(main.lan+"help.png"),i2=new ImageIcon(main.lan+"record.png"),i3=new ImageIcon(main.lan+"move.png"),i4=new ImageIcon(main.lan+"exit.png"),i5=new ImageIcon(main.lan+"2p.png"),i6=new ImageIcon(main.lan+"1p.png");
	JButton sp=new JButton(i0),help=new JButton(i1),reco=new JButton(i2),move=new JButton(i3),exit=new JButton(i4),twop=new JButton(i5),onep=new JButton(i6);
	JButton lang=new JButton(new ImageIcon(main.lan+"cl.png"));//
	JPanel jp=new JPanel();
	JLabel bg=new JLabel(new ImageIcon(main.lan+"bg.png"));
	ImageIcon ii0=new ImageIcon(main.lan+"ai.png"),ii1=new ImageIcon(main.lan+"aic.png");
	JButton re=new JButton(new ImageIcon(main.lan+"re.png"));
	gui welcome=new gui(462,246,0,0,false,"点赞吧...",false,false,true);
	window(){
		g.setSize(407, 318);
		g.setLocation(250, 250);
		g.setIconImage(img);
		g.setTitle("TicTacToe(AID人工智障)");
		g.setLayout(null);
		d.setSize(250, 290);
		d.setLocation(0, 0);
		g.add(d);
		g.setResizable(false);
		g.addMouseListener(new key());
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jp.setSize(150, 290);
		jp.setLocation(250, 0);
		//jp.setBackground(Color.black);
		jp.setLayout(null);
		g.add(jp);
		
		sp.setSize(100, 37);
		sp.setLocation(0, 15);
		sp.addMouseListener(new mouse());
		//jp.add(sp);

		twop.setSize(100, 37);
		twop.setLocation(0, 15);
		twop.addMouseListener(new mouse());
		jp.add(twop);

		onep.setSize(100, 37);
		onep.setLocation(0, 65);
		onep.addMouseListener(new mouse());
		jp.add(onep);
		
		help.setSize(100, 37);
		help.setLocation(0, 115);
		help.addMouseListener(new mouse());
		jp.add(help);
		
		reco.setSize(100, 37);
		reco.setLocation(0, 165);
		reco.addMouseListener(new mouse());
		jp.add(reco);
		
		exit.setSize(100, 37);
		exit.setLocation(0, 215);
		exit.addMouseListener(new mouse());
		jp.add(exit);
		
		if(main.mode){
			//System.out.println(000);
			re.setSize(30, 25);
			re.setLocation(0, 260);
			re.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					main.ga.now=main.ga.now==1?2:1;
					String[] st0=main.ms.pop().toString().split(" ");
					main.ga.gameboard[Integer.parseInt(st0[0])][Integer.parseInt(st0[1])]=0;
					main.w.d.repaint();
					String[] sb=new file0().read("met.txt").split(";");
					int len=sb.length;
					StringBuffer sb0=new StringBuffer();
					for(int a=0;a<len-1;a++){
						sb0.append(sb[a]);
					}
					new file0().write("met.txt", sb0.toString()+";", false);
				}
			});
			jp.add(re);
		}
		
		lang.setSize(100, 25);
		lang.setLocation(45, 260);
		lang.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent arg0) {
				new file0().write("lan.txt", main.lan.equals("e\\")?"c\\":"e\\", false);
				javax.swing.JOptionPane.showMessageDialog(null, "已设置:"+( main.lan.equals("e\\")?"简体中文":"English")+"\nSetted:"+(main.lan.equals("e\\")?"简体中文":"English")+"\n请重启程序!Please restart!");
				//javax.swing.JOptionPane.showMessageDialog(null, "123", "mess", JOptionPane.QUESTION_MESSAGE);
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		jp.add(lang);
		bg.setSize(150, 290);
		bg.setLocation(0, 0);
		jp.add(bg);
		
		g.setVisible(false);
		g.setFocusable(true);
	}
}
