import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class WorldlinkLaunch {

	public static void main(String[] args) throws InterruptedException { 
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Michele Waku\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("http://localhost:2220/smartweb/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("menu_item_1")).click();
		driver.findElement(By.id("menu_item_15")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtLPUserLogin")).sendKeys("adminva");
		driver.findElement(By.id("txtLPPassword")).sendKeys("password");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.className("WLButton")).click(); 
		//System.out.println(driver.findElement(By.cssSelector("p.col-md-10 my-auto pr-0 mx-auto")).getText());
		//driver.close(); 
		//driver.quit();
		
	}
		
	
}
