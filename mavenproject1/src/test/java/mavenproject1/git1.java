package mavenproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class git1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\software programs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String expectedtitle = "demo Web shop. login";
		String actualtitle = driver.getTitle();
		if(expectedtitle.equals(actualtitle))
		{
		driver.findElement(By.id("Email")).sendKeys("Vinod1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Vinod@1");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//logout
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.close();
		}
	}

}
