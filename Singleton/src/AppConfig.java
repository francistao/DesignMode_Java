
import java.io.*;
import java.util.*;

public class AppConfig {

	private String parameterA;

	private String parameterB;
	
	public String getParameterA() {
		return parameterA;
	}
	public String getParameterB() {
		return parameterB;
	}

	public AppConfig(){
		readConfig();
	}
	
	private void readConfig(){
		Properties p = new Properties(); 
		InputStream in = null;
		try {
			in = AppConfig.class.getResourceAsStream("AppConfig.properties");
			p.load(in);
			this.parameterA = p.getProperty("paramA");
			this.parameterB = p.getProperty("paramB");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
