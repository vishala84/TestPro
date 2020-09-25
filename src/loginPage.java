import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> m = new LinkedList<String>();
		m.add(null);
		m.add("myName");
		System.out.println(m.get(1));
		

		  //Creating HashSet and adding elements  
		    HashSet<String> set=new HashSet();  
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five"); 
		           
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  
		           {  
		           System.out.println(i.next().hashCode());  
		           }  

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagarajpg\\eclipse-workspace\\TestPro\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://login.salesforce.com/");
//		
//		
//		driver.findElement(By.id("username")).sendKeys("vishala.nagaraj-5kch@force.com");
//		driver.findElement(By.id("password")).sendKeys("Test@1234");
//		driver.findElement(By.id("Login")).click();

	}

}
