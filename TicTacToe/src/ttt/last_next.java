package ttt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class last_next implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==main.recor.last&&main.recor.step!=0){
			main.recor.dt1.setStep(main.recor.step);
			//System.out.println(main.recor.step+" dt1repaint");
			main.recor.dt1.repaint();
			main.recor.step--;
			main.recor.dt.setStep(main.recor.step);
			main.recor.dt.repaint();
		}else if(arg0.getSource()==main.recor.next&&main.recor.step<new file0().read("record.txt").split(";")[main.recor.filelen-main.recor.cho-1].split("[*]")[3].split(":").length){
			main.recor.dt.setStep(main.recor.step);
			main.recor.dt.repaint();
			main.recor.step++;
			main.recor.dt1.setStep(main.recor.step);
			main.recor.dt1.repaint();
		}
	}

}
