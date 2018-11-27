import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balab\\Selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();//class to open Chrome
		driver.get("https://www.amazon.com/");
		driver.close();
		driver.quit();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\balab\\Selenium\\geckodriver.exe");
		FirefoxDriver driver2= new FirefoxDriver();//class to open Firefox
		driver2.get("https://www.amazon.com/");
		driver.close();
		driver.quit();

	}

}
