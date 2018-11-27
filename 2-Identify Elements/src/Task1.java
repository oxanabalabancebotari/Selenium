import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balab\\Selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		String title= driver.getTitle();
		if(title.contains("Find a Flight")) {
			System.out.println("Title is valid");
		}else {
			System.out.println("Title is not valid");
		}
		driver.close();
		driver.quit();

	}

}
