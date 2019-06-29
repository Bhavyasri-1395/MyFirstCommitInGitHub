//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class SeleniumTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		//set property of chrome driver and give driver path
//		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
//		//System.setProperty("webdriver.gecko.driver", "‪D:\\geckodriver-v0.21.0-win64\\geckodriver.exe");
//		
//		//create driver object for chrome browser
//		WebDriver driver = new ChromeDriver();
//		//WebDriver driver = new FirefoxDriver();
//		
//		//proceed steps
//		driver.get("https://www.google.com/");
//		
//		WebElement google = driver.findElement(By.id("lst-ib"));
//		google.sendKeys("how to learn selenium");
//		driver.findElement(By.id("Google Search")).sendKeys(Keys.ENTER);
//
//		//driver.findElement(By.id("btnK")).click();
//		System.out.println(driver.getTitle());	
//		
//		System.out.println(driver.getCurrentUrl());
//		//System.out.println(driver.getPageSource());
//		//System.out.println(driver.getWindowHandles());
//		
//		
//		
//	}
//}
