package seleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BrokenLinks {

	@Test
	public void m1() throws IOException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> e = driver.findElements(By.xpath("//a | link"));
		URL url=null;
		int brokenLinks=0;
		for (WebElement e1 : e) {
			try {
				url=new URL(e1.getAttribute("href"));
				HttpURLConnection u=(HttpURLConnection) url.openConnection();
				
				u.connect();
				int statusCode = u.getResponseCode();
				if (statusCode>=400&&statusCode<500) {
					System.out.println(e1.getText());
					brokenLinks++;
				}
			} catch (Exception e2) {
				System.out.println(e1.getText());
				brokenLinks++;
			}
			
		}
		System.out.println(brokenLinks);
		
	}
}
