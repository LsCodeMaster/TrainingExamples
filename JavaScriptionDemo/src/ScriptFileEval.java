import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class ScriptFileEval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String script = "abc.js";
		String extension = "js";

		InputStream is = ScriptFileEval.class.getResourceAsStream("/" + script);
		Reader reader = new InputStreamReader(is);
		
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByExtension(extension);
		
		try {
			engine.eval(reader);
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
