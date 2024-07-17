import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mrana\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// set timeout let the element show up on the page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//get the page to test
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//maximize current window
		driver.manage().window().maximize();
		//get text field with id and enter value
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		//get text field with password and enter value
		driver.findElement(By.name("inputPassword")).sendKeys("****");
		//get element with className and action
		driver.findElement(By.className("submit")).click();
		//get element with cssSelector and get text
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		//get element by Xpath and attribute value
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		//get the element by cssSelecctor type and attribute value
		driver.findElement(By.cssSelector("input[placeholder='Email'] ")).sendKeys("test@gmail.com");
		//clear the field
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//get element by cssSelector nth child
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3) ")).sendKeys("boss@gmail.com");
		//get element by xpath parent tag name and child tag name
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("2568470230");
		// wait for get element stable state
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//get element by CSS parent child traverse 
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
		//get element by id
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		//get element regular expression cssSelector dynamic
		driver.findElement(By.cssSelector("input[type*='pas']")).sendKeys("rahulshettyacademy");
		Thread.sleep(10000);
		//customize xpath with regular expression
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}

}

