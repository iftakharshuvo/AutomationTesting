package seleniumbatch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver Initialization
           WebDriverManager.firefoxdriver().setup();

           WebDriver driver = new FirefoxDriver();
		
          String ExpectedURL= "https://www.saucedemo.com/"; 
		driver.get("https://saucedemo.com/");
		driver.manage().window().maximize();
        Thread.sleep(3000);
        String ActualURL= driver.getCurrentUrl();
        System.out.println(ActualURL);
        

       if (ActualURL.equals(ExpectedURL)) {
            System.out.println("URL matched");

        }else {
            System.out.println("URL doesn't match");

        }
        
        Assert.assertEquals(ActualURL,ExpectedURL,"Condition Matched");
        
        
		

		
		
	
	}

}
