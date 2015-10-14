package rand;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DataIODemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("Test.dat");
		DataOutputStream out = new DataOutputStream(fout);
		
		out.writeDouble(98.6);
		out.write(1000);;
		out.writeBoolean(true);
		
		out.close();
		
		FileInputStream fin = new FileInputStream("Test.dat");
		DataInputStream in = new DataInputStream(fin);
		
		double d = in.readDouble();
		int i = in.read();
		boolean b = in.readBoolean();
		
		System.out.println("Here are the values: " + d + " " + i + " " + b);
		
		in.close();
	}

}
