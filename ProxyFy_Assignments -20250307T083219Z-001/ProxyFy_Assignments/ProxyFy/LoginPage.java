package ProxyFy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://proxify.gg/login");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhishekkumarverma0811@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abhishek@1234");
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	  
}
