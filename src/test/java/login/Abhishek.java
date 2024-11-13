package login;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Abhishek {
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login");
		 driver.findElement(By.id("usernameField")).sendKeys("abhishekroc890@gmail.com");
		   driver.findElement(By.id("passwordField")).sendKeys("Chintu@567");
		   driver.findElement(By.xpath("//button[@type='submit' and text()='Login']")).click();
		   driver.findElement(By.xpath("//div[@class='view-profile-wrapper']//a")).click();
		   driver.findElement(By.xpath("//input[@type='button' and @value='Update resume']")).click();
		   Thread.sleep(5000);
		   StringSelection selection=new StringSelection("C:\\Users\\LILT_87\\Downloads\\Resume\\ATS abhishek 3+\\3+ final naresh it Abhishek.pdf");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		   Thread.sleep(5000);
		   Robot r=new Robot();
		   r.keyPress(KeyEvent.VK_CONTROL);
		   r.keyPress(KeyEvent.VK_V);
		   r.keyRelease(KeyEvent.VK_CONTROL);
		   r.keyRelease(KeyEvent.VK_V);
		   
		   r.keyPress(KeyEvent.VK_ENTER);
		   r.keyRelease(KeyEvent.VK_ENTER);
		   
		   driver.close();
		   
		   
		   
	}
		
}
