package ArrayPrograms;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SENDKEYSWITHOUT {

	@Test
	public void m1() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//textarea[@name='q']"));

		Thread.sleep(5000);
		String s1 = "Pavan kalyan";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Pavan kalyan'", ele);

	}

	@Test
	public void m2() throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.xpath("//textarea[@name='q']"));
		ele.click();
		Thread.sleep(5000);
		String s1 = "pavan kalyan";
		Robot r = new Robot();
		for (int i = 0; i < s1.length(); i++) {
			
			int x = KeyEvent.getExtendedKeyCodeForChar(s1.charAt(i));

			r.keyPress(x);
			
		}
	}
}
