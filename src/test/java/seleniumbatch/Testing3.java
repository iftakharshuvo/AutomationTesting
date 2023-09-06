package seleniumbatch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver Initialization
           WebDriverManager.firefoxdriver().setup();

           WebDriver driver = new FirefoxDriver();
		
          String ExpectedURL= "https://www.saucedemo.com/"; 
		driver.get("https://saucedemo.com/");
		driver.manage().window().maximize();
        Thread.sleep(3000);
       
		
		//username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//Login Button Click
		driver.findElement(By.id("login-button")).click();
		
		//Relative Path
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		
		//CSS Selector
		driver.findElement(By.cssSelector("#shopping_cart_container > a > span")).click();
		
		//Checkout 
		
		driver.findElement(By.id("checkout")).click();
		
		//Information for Checkout
		//First Name
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys("Md.Iftakarul Islam");
		//Last Name
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[1]/div[2]/input")).sendKeys("Suvo");
		//Zip Code
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[1]/div[3]/input")).sendKeys("3500");
		//Continue Button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/form/div[2]/input")).click();
		//Finish 
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
		//Back to Home
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button")).click();


		

		


		
	
	}

}
