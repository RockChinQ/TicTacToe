package ttt;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class mouse implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(arg0.getSource()==main.w.twop||arg0.getSource()==main.w.onep){
			if(main.ga.state!=1&&main.ga.state!=2){
				//int i=javax.swing.JOptionPane.showConfirmDialog(null, main.lan.equals("c\\")?"双人游戏？（点击否将进行人机对战）":"Two Player?(click 否 to play with AI)", "Mode",JOptionPane.YES_NO_CANCEL_OPTION);
				//System.out.print(i);
				if(arg0.getSource()==main.w.onep){
					main.cho.jf.setVisible(true);
					main.w.g.setEnabled(false);
					main.ga.mode=1;
				}else
					main.ga.mode=0;
				//
				//
				main.w.g.setTitle("Tic Tac Toe");
				main.ga.state=1;
				main.ga.reset();
				main.w.d.repaint();
			}else if(main.ga.state==1){
				main.ga.state=2;
				main.w.d.repaint();
			}else if(main.ga.state==2){
				main.ga.state=1;
				main.w.d.repaint();
			}
			
		}
		if(arg0.getSource()==main.w.sp){
			if(main.ga.state!=1&&main.ga.state!=2){
				int i=javax.swing.JOptionPane.showConfirmDialog(null, main.lan.equals("c\\")?"双人游戏？（点击否将进行人机对战）":"Two Player?(click 否 to play with AI)", "Mode",JOptionPane.YES_NO_CANCEL_OPTION);
				//System.out.print(i);
				if(i==1)
					main.ga.mode=1;
				else if(i==0)
					main.ga.mode=0;
				else
					return;
				main.w.g.setTitle("Tic Tac Toe");
				main.ga.state=1;
				main.ga.reset();
				main.w.d.repaint();
			}else if(main.ga.state==1){
				main.ga.state=2;
				main.w.d.repaint();
			}else if(main.ga.state==2){
				main.ga.state=1;
				main.w.d.repaint();
			}
		}else if(arg0.getSource()==main.w.help){
			main.w.g.setEnabled(false);
			gui g=new gui(390,260,0,0,true,"HELP",false,false,true);
			JLabel jl0=new JLabel(new ImageIcon(main.lan+"hel.png"));
			jl0.setSize(390, 240);
			jl0.setLocation(0, 0);
			g.setLayout(null);
			g.addWindowListener(new WindowListener(){

				@Override
				public void windowActivated(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowClosed(WindowEvent arg0) {
				}

				@Override
				public void windowClosing(WindowEvent arg0) {
					main.w.g.setEnabled(true);
				}

				@Override
				public void windowDeactivated(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowDeiconified(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowIconified(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowOpened(WindowEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
			});
			g.add(jl0);
		}else if(arg0.getSource()==main.w.reco){
			main.w.g.setEnabled(false);
			main.recor=new record();
		}else if(arg0.getSource()==main.w.exit){
			System.exit(0);
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		((JButton)arg0.getSource()).setIcon(new ImageIcon(((JButton)arg0.getSource()).getIcon().toString().split("[.]")[0]+"c.png"));
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		((JButton)arg0.getSource()).setIcon(new ImageIcon(((JButton)arg0.getSource()).getIcon().toString().split("c[.]")[0]+".png"));
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
