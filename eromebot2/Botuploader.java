package eromebot2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Botuploader {

	static WebDriver driver;

	@BeforeMethod
	public static void Log_in_to_erome() throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		try {

			driver.get("https://www.erome.com/user/login");
			driver.manage().window().maximize();
			WebElement email = driver.findElement(By.name("email"));
			WebElement password = driver.findElement(By.name("password"));

			WebElement login = driver.findElement(By.cssSelector("button[type=\"submit\"]"));

			email.sendKeys("fernandogoula@gmail.com");
			password.sendKeys("hardik786");

			login.click();
			Thread.sleep(2000);

			driver.findElements(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/a"));

			WebElement Profilepage = driver.findElement(By.cssSelector("#nav-right"));
			Profilepage.click();

		} catch (Exception exp) {

			WebElement popup = driver.findElement(By.xpath("//*[text()=\"Close Ad\"]"));
			popup.click();
			Thread.sleep(1000);
		}
	}

	@SuppressWarnings("deprecation")
	@Test(invocationCount = 99000)
	public static void Scanning_every_Album() throws InterruptedException, AWTException {
		for (int i = 1; i <= 2; i++) {

			// try {

			Thread.sleep(2000);
			// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/a")).click();
			Clicking_album();
			// Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[3]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[4]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[5]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[6]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[7]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[8]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[9]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[10]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[11]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[12]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[13]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[14]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[15]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[16]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[17]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[18]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[19]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[20]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[21]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[22]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[23]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[24]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[25]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[26]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[27]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[28]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[29]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[30]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[31]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[32]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[33]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[34]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[35]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[36]/a")).click();
			Clicking_album();
			// System.out.print(i);

			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.findElement(By.linkText("2")).click();
			Thread.sleep(2000);

			// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[1]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[2]/a")).click();
			Clicking_album();
			// Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[3]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[4]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[5]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[6]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[7]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[8]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[9]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[10]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[11]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[12]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[13]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[14]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[15]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[16]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[17]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[18]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[19]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[20]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[21]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[22]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[23]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[24]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[25]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[26]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[27]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[28]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[29]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[30]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[31]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[32]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[33]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[34]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[35]/a")).click();
			Clicking_album();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div[36]/a")).click();
			Clicking_album();
			// System.out.print(i);
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);

			// } catch (Exception exp) {

			// WebElement popup = driver.findElement(By.xpath("//*[text()=\"Close Ad\"]"));
			// popup.click();
			// Thread.sleep(1000);

			// } // catch (Exception exp) {

			// }
		}
	}

	@AfterMethod
	public static void Closing_browser() {

		driver.close();

	}

	public static void Clicking_album() throws InterruptedException, AWTException {

		String Verify_Textviews = driver.findElement(By.xpath("//*[@class=\"mr-5\"]")).getText();

		String numberOnly = Verify_Textviews.replaceAll("[^0-9]", "");
// //not to be comment out//  System.out.print(numberOnly);
		int Totalviews = Integer.parseInt(numberOnly);

		WebElement settingsbutton = driver.findElement(By.xpath("//*[@class=\"btn btn-grey album-options dropdown-toggle\"]"));
		settingsbutton.click();

		WebElement Scrollbuttonedit = driver.findElement(By.xpath("//*[text()=\"EDIT\"]"));
		Scrollbuttonedit.click();

		boolean Display = driver.findElements(By.xpath("//*[contains(text(),'MEGA')]")).isEmpty();

		int minimumvies = 570;
		if ((Totalviews >= minimumvies) && (Display == true)) {
			// WebElement settingsbutton=
			// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]"));
			// settingsbutton.click();

			// WebElement Scrollbuttonedit=
			// driver.findElement(By.xpath("//*[text()=\"EDIT\"]"));
			// Scrollbuttonedit.click();

			WebElement Setlinkinbox = driver.findElement(By.cssSelector("#legend-area"));
			Setlinkinbox.clear();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("#legend-area")).sendKeys(throw_back_random_link()
					+ " \n   \n ( TELEGRAM ) FOR MORE ONLYFANS FREE JOIN===>>> https://t.me/ZURI_Onlyfans");

			Thread.sleep(1000);

			WebElement Clickonfreespace_tosave = driver.findElement(By.xpath("//*[@class=\"col-sm-8 user-info text-right\"]"));
			Clickonfreespace_tosave.click();
		}

		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().back();
		

	}

	public static String throw_back_random_link() {

		String[] links = { "MEGA LINK(full video) https://rentry.co/xokva", "MEGA LINK(full video) https://rentry.co/hsbs94",
				"MEGA LINK(full video) https://rentry.co/pddd5", "MEGA LINK(full video) https://rentry.co/25pmh",
				"MEGA LINK(full video) https://jpst.it/2BbMf", "MEGA LINK(full video) https://jpst.it/2BfUK",
				"MEGA LINK(full video) https://jpst.it/2BfVQ", "MEGA LINK(full video) https://jpst.it/2BbLd" };

		String random = (links[new Random().nextInt(links.length)]);

		return random;

	}

}
