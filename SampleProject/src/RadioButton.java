import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
		
		int size = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for(int i=0; i<size; i++) {
			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println(text);
			if(text.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
			
		}
	}

}
