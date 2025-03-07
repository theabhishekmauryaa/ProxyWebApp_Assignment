package ProxyFy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlansPage {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://proxify.gg/dashboard");
		driver.manage().window().maximize();
		
		
		//planpage
		driver.findElement(By.xpath("//a[normalize-space()='Plans']")).click();
		driver.findElement(By.xpath("//body/div[1]")).click();
	}

}
