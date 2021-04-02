package ttt;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class action1 implements ActionListener, MouseListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		main.recor.jls[main.recor.cho].setBorder(BorderFactory.createLineBorder(Color.white,2));
		for(int a=0;a<main.recor.filelen;a++){
			if(main.recor.jls[a]==arg0.getSource()){
				main.recor.cho=a;
				main.recor.step=0;
				main.recor.dt.setStep(main.recor.step);
				main.recor.dt.repaint();
				main.recor.dt1.setStep(main.recor.step);
				main.recor.dt1.repaint();
			}
		}
		((JButton) arg0.getSource()).setBorder(BorderFactory.createLineBorder(Color.orange,2));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton()==3){
			int i=javax.swing.JOptionPane.showConfirmDialog(null, "删除?");
			//System.out.println(i);
			if(i==0){
				StringBuffer sb0=new StringBuffer();
				String[] file=new file0().read("record.txt").split(";");
				for(int a=0;a<Math.min(main.recor.filelen, 11);a++){
					if(e.getSource()==main.recor.jls[a]){
						for(int b=0;b<file.length;b++){
							String tess=file[b].split("[*]")[2]+"结束的  赢家"+(file[b].split("[*]")[1].equals("1")?"O":(file[b].split("[*]")[1].equals("0")?"平局":"X"))+" 模式："+(file[b].split("[*]")[4].equals("1")?"人机对战":"双人游戏");
							if(main.recor.jls[a].getText().equals(tess)){
								continue;
							}
							sb0.append(file[b]+";");
						}
					}
				}
				new file0().write("record.txt", sb0.toString(), false);
				main.w.g.setEnabled(true);
				main.recor.g.dispose();
				main.recor=new record();
				main.w.g.setEnabled(false);
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
