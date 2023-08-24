package DEMO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Ajio {
	
	@Test
	public void jiotest() throws Exception
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium folder\\New folder\\chromedriver-win32\\chromedriver.exe");
		
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
	   WebDriver driver = new ChromeDriver(Options) ;
  
	driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN105G0&p=www.jio.com");
   // Assert.fail();
 	Thread.sleep(3000);
    
    driver.close();
	
	}}
