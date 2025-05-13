package orangeHRM_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
  WebDriver driver = new ChromeDriver();
  Actions Key = new Actions(driver);
  WebDriverWait MyWait = new WebDriverWait(driver,Duration.ofSeconds(10));;
  @BeforeClass
  public void beforeClass() {
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  }
  
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[7]/a/span")).click();
  }
  @Test(priority = 1)
  public void Admin() throws InterruptedException {
	  //Search
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Sourabh");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")).sendKeys("Palak");
	  Thread.sleep(1000);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	  //Add
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  //Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("So");
	  Thread.sleep(2000);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Sourabh");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("Palak@1234");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("Palak@1234");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
	  Thread.sleep(10000);
	  
	  //scroll
	  Key.scrollByAmount(0, 500);
	  Key.build().perform();
  }
 @Test(priority = 2)
  public void PIM() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	  //Search
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("s");
	  Thread.sleep(2000);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("1234");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input")).sendKeys("Pa");
	  Thread.sleep(2000);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	  
	  //Add
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Sourabh");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")).sendKeys("Mehra");
	  //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).clear();
	  //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("12345");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys("Sourabh123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("Palak@1234");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys("Palak@1234");
	  //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/div/img")).sendKeys("C:\\Users\\DELL\\Downloads\\Adobe.jpg");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	  Thread.sleep(30000);
	  //edit
	  //Personal details
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("123456789");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).sendKeys("2030-10-20");
	  driver.findElement(By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div > div:nth-child(2) > div > div > div.oxd-select-text-input")).sendKeys("i");
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")).sendKeys("2000-10-19");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span")).click();
	  Key.scrollByAmount(0, 250);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("Automation");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button")).click();
	  Key.scrollByAmount(0, -400);
	  Key.build().perform();
	  // Edit Contact details
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("ABC");
	  //MyWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"))).sendKeys("ABC");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("DEF");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input")).sendKeys("Mohali");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input")).sendKeys("Punjab");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")).sendKeys("123456");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[1]")).sendKeys("i");
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("98765");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("9876543210");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input")).sendKeys("658737");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys("Sourabh@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
	  
	  //Edit Emergency details
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Palak");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("Friend");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("684626190");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("98277764829");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")).click();
	  
	  //Dependents
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/a")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Annie");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div/div/div[2]/div/div/input")).sendKeys("2024-08-27");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]")).click();
	  
	  //Job
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[6]/a")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2022-01-02");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[7]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button")).click();
	  
	  //Salary
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[7]/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("24665");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input")).sendKeys("45000");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button[2]")).click();
	  
	  //Tax Exemptions
//	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[8]/a")).click();
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
//	  Key.sendKeys(Keys.ARROW_DOWN);
//	  Key.sendKeys(Keys.ENTER);
//	  Key.build().perform();
//	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("1000");
//	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
//	  Key.sendKeys(Keys.ARROW_DOWN);
//	  Key.sendKeys(Keys.ARROW_DOWN);
//	  Key.sendKeys(Keys.ENTER);
//	  Key.build().perform();
//	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
//	  Key.sendKeys(Keys.ARROW_DOWN);
//	  Key.sendKeys(Keys.ENTER);
//	  Key.build().perform();
//	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input")).sendKeys("1000");
//	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[4]/div/div[2]/div/div/div[2]/i[1]")).click();
//	  Key.sendKeys(Keys.ARROW_DOWN);
//	  Key.sendKeys(Keys.ARROW_DOWN);
//	  Key.sendKeys(Keys.ENTER);
//	  Key.build().perform();
//	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[5]/div/div[2]/div/div/div[2]/i")).click();
//	  Key.sendKeys(Keys.ARROW_DOWN);
//	  Key.sendKeys(Keys.ARROW_DOWN);
//	  Key.sendKeys(Keys.ENTER);
//	  Key.build().perform();
//	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button")).click();
	  
	  
	  
  }
  @Test(priority = 4)
  public void Leave() throws InterruptedException {
	  //Search
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2025-07-19");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("2025-07-25");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Test");
	  Thread.sleep(2000);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/button[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")).click();
	  
  }
  @Test(priority = 3)
  public void Time() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("Test");
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/i")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("Coke");
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("2025-10-01");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/input")).sendKeys("2025-10-05");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[3]/button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/i")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("T");
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Coke");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[4]/button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/span/i")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[3]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Test");
	  
  }
  @Test(priority = 5)
  public void Recruitment() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("P");
	  Thread.sleep(2000);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/input")).sendKeys("2025-10-05");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[4]/div/div[2]/div/div/input")).sendKeys("2025-15-05");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/div/div/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[4]/button[2]")).click();
	  
	  //Add
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input")).sendKeys("Palak");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input")).sendKeys("Bhatia");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys("palak@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")).sendKeys("9876543210");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]")).click();  
  }
  @Test(priority = 7)
  public void Directory() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a/span")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("P");
	  Thread.sleep(2000);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	  Key.scrollByAmount(0, 500);
	  Key.build().perform();	  
  }
  @Test(priority = 6)
  public void Claim() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a/span")).click();
	  //search
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("P");
	  Thread.sleep(2000);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input")).sendKeys("12");
	  Thread.sleep(2000);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[2]/div/div[3]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/div[2]/form/div[3]/button[2]")).click();
	  
	  //ADD
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div[1]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input")).sendKeys("P");
	  Thread.sleep(2000);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ARROW_DOWN);
	  Key.sendKeys(Keys.ENTER);
	  Key.build().perform();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/textarea")).sendKeys("I need money for my medical.");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")).click();
  }
  
  
  @AfterClass
  public void afterClass() {
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
  }

}
