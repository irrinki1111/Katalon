package Action_class;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base_class {
    WebDriver driver;
	@BeforeClass
	public void startbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\html\\sample1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public void quitbrowser() {
		
		driver.close();
	}
}
