package seleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OpenNewWindow {

	@Test
	public void m1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.xpath("//select[@id='select3']"));
		Select s=new Select(e);
		s.selectByIndex(3);
		
		
		
		
	}
}
