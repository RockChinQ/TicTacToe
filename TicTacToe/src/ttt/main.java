package ttt;

import java.io.File;
import java.io.IOException;

public class main {
	static mystack ms=new mystack("no");
	static String lan=new file0().read("lan.txt");
	static boolean mode=new file0().read("account.txt").equals("TicTacToe-developer");
	static window w=new window();
	static game ga=new game();
	static choose cho;
	static mystack ms0=new mystack("222");
	static record recor;
	public static void main(String[] args){
		/*if(!new File("first.txt").exists()){
			try {
				Runtime.getRuntime().exec("first.bat");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			javax.swing.JOptionPane.showMessageDialog(null, "正在准备文件，请重启程序！");
			System.exit(0);
		}*/
		cho=new choose();
		w.g.setVisible(false);
		File f=new File("lan.txt");
		if(!f.exists()){
			new file0().write("lan.txt", "e\\", false);
		}
		if(mode)
			javax.swing.JOptionPane.showMessageDialog(null, (lan.equals("c\\")?"当前是开发者模式！":"Developer Mode!"));
		new welcome();
		w.g.setVisible(true);
	}
}
