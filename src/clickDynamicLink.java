import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickDynamicLink {

	public static void main(String[] args) {
		// class ini contoh test click href/link dynamic
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//count link on footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("jumlah link = "+footerdriver.findElements(By.tagName("a")).size());

	}

}
