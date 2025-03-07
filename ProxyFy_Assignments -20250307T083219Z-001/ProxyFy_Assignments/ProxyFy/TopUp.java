package ProxyFy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopUp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://proxify.gg/topup");
		driver.manage().window().maximize();
		
		
		// locator
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("100");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	

}
