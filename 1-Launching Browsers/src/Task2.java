import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balab\\Selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.rediff.com/");
		String title= driver.getTitle();
		if(title.contains("Computer")) {
			System.out.println("verified");
		}else {
			System.out.println("Not verified");
		}
		driver.close();

	}

}
