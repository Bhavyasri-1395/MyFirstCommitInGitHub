import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.instagram.com/");
		//driver.findElement(By.xpath("//a[contains(@href,'/accounts/login/')]")).click();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("9553774099");
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("vhjghg");
		//driver.findElement(By.xpath("//button[contains(@class,'_5f5mN       jIbKX KUBKM      yZn4P   ')]")).click();
		driver.findElement(By.xpath("//div[@class='gr27e ']/div/form/span/button")).click();
		System.out.println(driver.findElement(By.cssSelector("#slfErrorAlert")).getText());
		driver.close();
	}

}
