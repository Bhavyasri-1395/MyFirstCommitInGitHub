import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://fantasycricket.dream11.com/IN/");
		driver.manage().window().maximize();
		
	}

	public void switchtoFrame(WebDriver driver) {
		int framecount = driver.findElements(By.tagName("iframe")).size();
		for(int i=0; i<=framecount; i++) {
			driver.switchTo().frame(i);
			driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		}
	}
}
