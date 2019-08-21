import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DEmoPropertyFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro=new Properties();
		pro.load(new FileInputStream(System.getProperty("user.dir")+"/credential.properties"));
		System.out.println(pro.size());
		for(int i=1;i<=pro.size();i++) {
		System.out.println(pro.getProperty("url"+i));
	}
}
}