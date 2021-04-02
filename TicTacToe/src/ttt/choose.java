package ttt;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class choose {
	static gui jf=new gui(280,150,0,0,false,main.lan=="c\\"?"Ñ¡Ôñ":"Choose",false,false,true);
	static JButton jbt0=new JButton(new ImageIcon(main.lan+"ch0.png")),jbt1=new JButton(new ImageIcon(main.lan+"ch1.png")),jbt2=new JButton(new ImageIcon(main.lan+"ch2.png"));
	choose(){
		JLabel jl0=new JLabel(new ImageIcon(main.lan+"whof.png"));
		jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		jf.setLayout(null);
		jl0.setSize(300, 150);
		main.w.g.setVisible(false);
		jl0.setLocation(0, -20);
		jbt0.setSize(75, 30);jbt1.setSize(75, 30);jbt2.setSize(75, 30);
		jbt0.setLocation(10, 60);jbt1.setLocation(90, 60);jbt2.setLocation(170, 60);
		jf.add(jbt0);jf.add(jbt1);jf.add(jbt2);
		jbt0.addActionListener(new action());jbt1.addActionListener(new action());jbt2.addActionListener(new action());
		jf.add(jl0);
	}

}
