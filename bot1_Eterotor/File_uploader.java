package bot1_Eterotor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.runtime.model.ExceptionDetails;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class File_uploader {

	
	WebDriver driver;

	@BeforeMethod
	public void log_in_to_site() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		// cpmoi
		driver.get("https://www.erome.com/user/login");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));

		WebElement login = driver.findElement(By.cssSelector("button[type=\"submit\"]"));

		email.sendKeys("fernandogoula@gmail.com");
		password.sendKeys("hardik786");

		login.click();
		Thread.sleep(2000);
		// commiy
	}
	@DataProvider(name = "test-data")
  	public Iterator<Object[]> dataProvFunc(){
		ArrayList<Object[]> data =	Data.getdata();
		return data.iterator();
  	}
	
	
	@Test(dataProvider = "test-data")
	public void Albumupload_1(String data) throws InterruptedException, IOException { // CLICKS ON UPLOAD AND CLOSE POPUP
		String[] cmd = {data };
		driver.findElement(By.xpath("/html/body/div[1]/div/nav/div/div/div[6]/ul/li[6]/a")).click();
	//	driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div")).click();
		// CLICKS ON DRAG FILE
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"drag_text\"]")).click();
		Thread.sleep(30000);
		 Runtime.getRuntime().exec( "C:\\Users\\Administrator\\Downloads\\newsample.exe "+data);
		// commjoojo
		Thread.sleep(1000*60*9);
		// commrtty
		
	}

	
	
	
	@AfterMethod
	public void Clossing_theBrowser() throws InterruptedException, IOException {

		driver.close();

	}

}
