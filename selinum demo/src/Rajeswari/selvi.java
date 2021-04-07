package Rajeswari;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selvi {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.id("txtUsername"));
		if(username.isEnabled())
		{
			username.clear();
		username.sendKeys("Admin");
			}
	if(username.isDisplayed())
	{
	WebElement pwd=driver.findElement(By.id("txtpassword"));
	pwd.clear();
	pwd.sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(3000);
	List<WebElement> link = driver.findElements(By.tagName("a"));
	System.out.println(link.size());
	for(int i=0;i<link.size();i++)
	{
		System.out.println(link.get(i).getText());
	}
	}
	else
		System.out.println("not displayed");
	}}
	
