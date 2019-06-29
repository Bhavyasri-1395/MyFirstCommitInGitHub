import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("images");
		driver.findElement(By.xpath("//*[@id='mKlEF']/span/svg")).click();	
	}

}
