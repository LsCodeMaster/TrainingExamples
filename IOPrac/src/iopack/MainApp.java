package iopack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainApp {

	public static void main(String[] args) throws FileNotFoundException, IOException{
//		FileInputStream in = null;
//		FileOutputStream out = null;		
//		try {
//			in = new FileInputStream("sapin.txt");
//			out = new FileOutputStream("sapout.txt");
//			int c;
//			while ((c = in.read()) != -1){
//				out.write(c);
//			}
//		} finally {
//			if (in != null){
//				in.close();
//			}
//			if (out != null){
//				out.close();
//			}
//		}
		
		try (
			FileInputStream in = new FileInputStream("sapin.txt");
			FileOutputStream out = new FileOutputStream("sapout.txt")
		){
			int c;
			while((c=in.read())!= -1){
				out.write(c);				
			}
		}
		
	}

}
