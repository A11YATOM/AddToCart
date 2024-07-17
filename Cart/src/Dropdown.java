import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrana\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//parent child relationship dynamic xpath 
		//div[@id="glsctl00_mainContent_ddl_originStation1_CTNR"] //a[@value='BLR']
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//parent child relationship dynamic xpath 
		////div[@id="glsctl00_mainContent_ddl_destinationStation1_CTNR"] //a[@value='MAA']
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

	}

}

