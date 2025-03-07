package ProxyFy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://proxify.gg/signup");
		driver.manage().window().maximize();
		
		//sign up
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mauryaabhi234");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("fhjljljdsk@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abhdojlkfh@1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
