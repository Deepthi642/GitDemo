import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class smple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Deepthi");
		System.setProperty("webdriver.chrome.driver", "F:\\Deepthi\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
	}

}
