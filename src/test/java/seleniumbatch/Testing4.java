package seleniumbatch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing4 {
	WebDriver driver;

	@BeforeTest
	public void init() {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();


	}
	@Test(priority=1)
	public void TestURL() {
		String ExpectedURL= "https://www.saucedemo.com/";
		String ActualURL=driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURL,"URL doesn't match");
	}
	@Test(priority=2)

	public void TestTitle() {
		String ExpectedTitle= "Swag Labs";
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle,"Title doesn't match");
	}
	@Test(priority=3)
	
	public void LogIn() {
		        //username
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				//password
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				//Login Button Click
				driver.findElement(By.id("login-button")).click();
	}
	@Test(priority=4)
	
	public void AddRemoveCart() {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']")).click();

	}
	@Test(priority=5)
	
	public void ClicktoCart() {
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.cssSelector("#shopping_cart_container > a > span")).click();

	}
    @Test(priority=6)
    
    public void CheckOut() {
		driver.findElement(By.id("checkout")).click();

    }
    @Test(priority=7)
    
    public void CheckoutInfo() {
    	//Information for Checkout
    			//First Name
    			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys("Md.Iftakarul Islam");
    			//Last Name
    			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[1]/div[2]/input")).sendKeys("Suvo");
    			//Zip Code
    			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[1]/div[3]/input")).sendKeys("3500");
    			//Continue Button
    			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[2]/input")).click();
    }
    @Test(priority=8)
    
    public void HomePageClick() {
    	//Finish 
    			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
    			//Back to Home
    			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button")).click();
    }
    @AfterTest 
    public void EndTest() {
    	driver.quit();
    }

	
}
