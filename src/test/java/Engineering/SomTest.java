package Engineering;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SomTest {
  @Test
  public void Quaterpintest()
  {
	//  WebDriver driver =new ChromeDriver();

		System.setProperty("webdriver.chrome.driver","C:\\selenium folder\\New folder\\chromedriver-win32\\chromedriver.exe");
			
			ChromeOptions Options = new ChromeOptions();
			Options.addArguments("--remote-allow-origins=*");
		   WebDriver driver = new ChromeDriver(Options) ;
		   
	    driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN105G0&p=whatsapp");
	 // Assert.fail();
	  
	  driver.close();
  }
}
