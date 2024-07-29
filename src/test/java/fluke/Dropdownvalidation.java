package fluke;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdownvalidation {

	@Test
	public void m1() {
		String expected="Ron Weasly";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/customer");
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='userSelect']"));
		
		Select s=new Select(ele);
		s.selectByVisibleText("Ron Weasly");
		
		String actual = s.getFirstSelectedOption().getText();
		if (expected.equals(actual)) {
			System.out.println("the selected value is  "+expected+" ======passed");
			
		} else {
			System.out.println("failed");
		}
		
	}
}
