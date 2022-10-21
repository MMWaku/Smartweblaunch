import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction implements WebDriver{

	public static void main(String[] args) {
		
		
     //Invoking the Browser -Each browser is a class 
	//Chrome- ChromeDriver -> Methods (close (close browser), get(open browser) etc
	//Firefox-FirefoxDriver ->Methods (close (close browser), get(open browser) etc
	//Safari SafariDriver   ->Methods (close (close browser), get(open browser) etc
	//Webdriver close get (interface agreed by the classes above 
	//There are webdriver methods available but each driver above may have their own 
	
	//must invoke chrome browser first. (chromedriver.exe)
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Michele Waku\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//webdriver.chrome.driver -value of path 
	//WebDriver driver = new ChromeDriver();
	
	//Firefox Launch
	//geckodriver- to download firefox drivrt
	
	//webdriver.gecko.driver
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Michele Waku\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	
	//Microsoft Edge
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Michele Waku\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	
	driver.get("http://labelary.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close(); 
	//driver.quit();
		
		
	}

}
