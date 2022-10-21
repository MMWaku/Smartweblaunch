import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class SmartwebPrac {
	
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.chrome.driver",
	              "C:\\Users\\Michele Waku\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	  }

  @BeforeMethod
  public void beforeMethod() {
	   driver.get("http://cmsxiapp.cmsglobalsoft.com:2220/smartweb/#");
	  
  }
  

@Test
public void LocatoridCarrierAccounts  () throws InterruptedException 
{

	   driver.findElement(By.id("menu_item_1")).click();
		driver.findElement(By.id("menu_item_15")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("txtLPUserLogin")).sendKeys("adminva");
		driver.findElement(By.id("txtLPPassword")).sendKeys("password");
	   
		driver.findElement(By.className("WLButton")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("menu_item_4")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_item_44")).click();
		driver.findElement(By.id("menu_item_440")).click();
		driver.findElement(By.id("CASFtxtSearch")).click();
		driver.findElement(By.id("CASFtxtSearch")).sendKeys("UPS");
		//driver.findElement(By.xpath("//button*[@id=\'CASFOkClick()']")).click();
}



//@Test

//public void ProcessShipment () 
{
//	driver.findElement(By.id("menu_item_2")).click();
	//driver.findElement(By.id("menu_item_21")).click();
}



}
