import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.com/");
		//Actions a = new Actions(driver);
		//WebElement sample = driver.findElement(By.className("//*[@id='nav-link-accountList']/span[2]/span"));
		//a.moveToElement(sample);
		//sample.click();
	    //WebDriverWait d = new WebDriverWait(driver, 20);
	    //d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-al-your-account']/a[1]/span")));
		//driver.findElement(By.xpath("//*[@id='nav-al-your-account']/a[1]/span")).click();
		
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/p/a")).click();
		
	}

}
