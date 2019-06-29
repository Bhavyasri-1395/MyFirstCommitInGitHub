import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
        WebElement facebook = driver.findElement(By.id("email"));
        facebook.sendKeys("raghavi.police@gmail.com");
        WebElement facebookOne = driver.findElement(By.id("pass"));
        facebookOne.sendKeys("9603417957");
        WebElement login = driver.findElement(By.id("u_0_2"));
        login.submit();
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.close();        
		
}
}
