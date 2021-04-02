package ttt;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class welcome {
	JWindow jw=new JWindow();
	JLabel jl0=new JLabel(new ImageIcon(main.lan+"welc.png"));
	welcome(){
		
		jw.setLayout(null);
		jl0.setSize(360, 220);
		jw.add(jl0);
		jw.setSize(360, 220);
		jl0.setLocation(0, 0);
		jw.add(jl0);
		jw.setLocation(300, 300);
		jw.setVisible(true);
		try {
			new Thread().sleep(1750);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jw.dispose();
	}
}
