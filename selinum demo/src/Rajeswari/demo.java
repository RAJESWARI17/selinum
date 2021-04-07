package Rajeswari;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class demo {
	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\chromedriver_win32");
				WebDriver driver = new ChromeDriver();
				driver.navigate().to("http://demo.guru99.com/test/newtours/");
				WebElement username=driver.findElement(By.id("txtUsername"));
				if(username.isEnabled())
				{
					username.clear();
				username.sendKeys("sunil");
					}
			if(username.isDisplayed())
			{
			WebElement pwd=driver.findElement(By.id("txtpassword"));
			pwd.clear();
			pwd.sendKeys("sunil");
			driver.findElement(By.id("btnLogin")).click();
			}
			else
			{
				System.out.println("not displayed");
	}

}}
