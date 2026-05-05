package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFrompropertyfile {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./testdata/commendata.properties");
	
	Properties prop = new Properties();
	
	prop.load(fis);
	
	String url = prop.getProperty("url");
	String email = prop.getProperty("email");
	String pass = prop.getProperty("password");
	System.out.println(url);
	System.out.println(email);
	System.out.println(pass);
	
}
}
