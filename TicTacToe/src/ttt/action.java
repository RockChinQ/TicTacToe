package ttt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class action implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		main.w.g.setEnabled(true);
		main.cho.jf.setVisible(false);
		int who=0;
		if(arg0.getSource()==main.cho.jbt0){
			who=1;
			main.ga.first=2;
		}else if(arg0.getSource()==main.cho.jbt1){
			who=0;
			main.ga.first=1;
		}else{
			who=(int)(Math.random()*100)%2;
		}
		if(who==1){
			main.ga.now=2;
			main.ga.doai();
			main.ga.now=main.ga.now==1?2:1;
		}else{
			main.w.g.setTitle("Tic Tac Toe-ÕÊº“œ»Player first");
		}
	}

}
