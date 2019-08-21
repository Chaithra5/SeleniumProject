import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DEmoListBox {
	static{
		 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	 }
	 public static void main(String[] args) throws InterruptedException  {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///home/tyss/Documents/list.html");
		WebElement listbox = driver.findElement(By.id("slv"));
		Select sel=new Select(listbox);
//		sel.selectByIndex(0);
//		sel.selectByValue("p");
//		sel.selectByVisibleText("parota");
           List<WebElement> all = sel.getAllSelectedOptions();	
           System.out.println(all.size());
           
        //  WebElement first = sel.getFirstSelectedOption();
          //System.out.println(first.getText());
          
      /*    if(sel.isMultiple())
          {
        	  System.out.println("listbox is multiple");
        	  sel.deselectAll();
          }*/
           
                      
      /*   WebElement wrap = sel.getWrappedElement();
         System.out.println("***************");
         System.out.println(wrap.getText());*/
           
           List<WebElement> list = sel.getOptions();
         //  System.out.println("list"+list.size());
           if(list.isEmpty())
           {
        	   System.out.println("listbox is empty");
           }else
           {
        	   System.out.println("not empty");
           }
           int count = list.size();
           
         //sorted element
    TreeSet tr=new TreeSet();
    
  for(WebElement tr1:list)
    {
    	String text2 = tr1.getText();
    	tr.add(text2);
    }
       System.out.println(tr);
       
       ///select and deselect in reverse order
       for(int i=count-1;i>=0;i--)
       {
    	  sel.selectByIndex(i);
       }
       Thread.sleep(1000);
       for(int i=count-1;i>=0;i--)
       {
    	  sel.deselectByIndex(i);
       }
      
       ///unique element
       for(int i=0;i<count;i++)
       {
    	   boolean f=false;
    	   for(int j=i+1;j<count;j++)
    	   {
    		   if(list.get(i).getText().equals(list.get(j).getText()));
    		   f=true;
    		   break;
    	   }
    	   if(f)
    	   {
    		   System.out.println("duplicate value :");
    	   }
       }
}
}