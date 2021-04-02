package ttt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class file0 {
	void write(String s0,String s1,boolean b){
		try {
			FileWriter fw=new FileWriter(s0,b);
			fw.write(s1);
			fw.close();
		} catch (Exception e) {
		}
	}
	String read(String s){
		File f=new File(s);
		try {
			FileInputStream fis=new FileInputStream(f);
			byte[] data=new byte[(int)f.length()];
			fis.read(data);
			fis.close();
			return new String(new String(data));
		} catch (Exception e) {
		}
		return "";
	}
}
