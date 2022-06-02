package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {

	public Properties properties;
	String filePath="./config.properties";
	public ConfigRead()  {
		File src=new File("C:\\Users\\mindsdet345\\Desktop\\HybridFramework\\config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			properties=new Properties();
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public String getUrl() {
		String urlpath=properties.getProperty("url");
		return urlpath;
	}
	public String getDriverPath() {
		String path=properties.getProperty("driver");
		return path;
	}
	public String getExcelPath() {
		String fpath=properties.getProperty("filepath");
		return fpath;
	}



}
