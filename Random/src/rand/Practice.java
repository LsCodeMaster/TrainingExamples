package rand;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Enumeration;
import java.util.Properties;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Properties props = System.getProperties();
//		Enumeration keys = props.keys();
//		while(keys.hasMoreElements()){
//			String param = (String) keys.nextElement();
//			System.out.println(param + " : " + props.get(param));
		
		try {
			FileReader input = new FileReader(args[0]);
			try{
				FileWriter output = new FileWriter (args[1]);
				try{
					char[] buffer = new char[128];
					int charsRead;
					
					//read the first buffer
					charsRead = input.read(buffer);
					while (charsRead != -1){
						output.write(buffer,0,charsRead);
						charsRead = input.read(buffer);
					}
				} finally{
					output.close();
				}
			}finally{
				input.close();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
