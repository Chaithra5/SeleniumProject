package Practice_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DemoPropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
      Properties pro= new Properties();
      pro.load(new FileInputStream("./credential.properties"));
      System.out.println(pro.size());
      System.out.println(pro.getProperty("url"));
	}

}
