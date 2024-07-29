package stringPrograms;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CommonCharacters {

	@Test
	public void m1() {
		String[] s = { "abca", "abcdg", "abctg", "acbxg" };

		String result = "";

		String s1 = s[0];

		for (int i = 0; i < s[0].length(); i++) {
			char c = s1.charAt(i);
			boolean b = true;
			for (int j = 1; j < s.length; j++) {
				if (!s[j].contains(c + "")) {
					b = false;
					break;
				}
			}
			if (!result.contains(c + "") && b) {
				result = result + c;
			}
		}
		System.out.println(result);
	}

	@Test
	public void m3() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://noon.ae/");

		List<WebElement> e = driver.findElements(By.xpath("//*"));
		System.out.println(e.size());
		new Actions(driver).keyDown(Keys.END).keyUp(Keys.END).perform();

		Thread.sleep(3000);
		new Actions(driver).keyDown(Keys.HOME).keyUp(Keys.HOME).perform();

		Thread.sleep(5000);
		e = driver.findElements(By.xpath("//*"));
		System.out.println(e.size());

		driver.quit();
	}

	@Test
	public void logs() {

	}
}
