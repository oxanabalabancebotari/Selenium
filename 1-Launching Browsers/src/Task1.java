import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balab\\Selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.dice.com/");
		driver.get("https://www.indeed.com/");
		
		driver.navigate().back();
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.navigate().forward();
		String titl= driver.getTitle();
		System.out.println(titl);
		String url= driver.getCurrentUrl();
		System.out.println(url);
		driver.close();

	}

}
