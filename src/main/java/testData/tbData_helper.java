package testData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class tbData_helper 
{
	static FileInputStream fis;
	static Properties prop = new Properties();
	
	public static String dataInput_textBox() throws IOException
	{
		fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/tb_dataConfig.properties");
		prop.load(fis);
		String tb_data = prop.getProperty("tb_data");
		return tb_data;
	}
}
