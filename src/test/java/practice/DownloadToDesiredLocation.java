package practice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DownloadToDesiredLocation {

	@Test
	public void m1() {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "C:\\Users\\divya\\OneDrive\\Desktop\\download");

		ChromeOptions opt = new ChromeOptions();

		opt.setExperimentalOption("prefs", prefs);
		opt.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(opt);
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/download?sublist=0");
		driver.findElement(By.xpath("//textarea[@id='writeArea']")).sendKeys("pavan kalyan");
		WebElement e = driver.findElement(By.xpath("//button[contains(.,'Download')]"));

	}

	@Test
	public void m2() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");

		Thread.sleep(6000);

		WebElement e = driver.findElement(By.xpath("//h1[text()='Login']"));
		e.click();

		Actions act = new Actions(driver);

		act.sendKeys(Keys.TAB, "pavan kalyan", Keys.TAB, "anil").keyDown(Keys.SHIFT).keyDown(Keys.TAB).keyUp(Keys.SHIFT)
				.keyUp(Keys.TAB).sendKeys(Keys.BACK_SPACE).perform();

	}
}
