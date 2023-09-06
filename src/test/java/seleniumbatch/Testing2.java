package seleniumbatch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver Initialization
           WebDriverManager.firefoxdriver().setup();

           WebDriver driver = new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//First Step:Name
		//First Name
				driver.findElement(By.id("fname")).sendKeys("Md.Iftakarul Islam");
		//Last Name
				driver.findElement(By.id("lname")).sendKeys("Suvo");
		
		//Second Step:Radio Button
      WebElement radiobutton= driver.findElement(By.id("male"));
      radiobutton.click();
      assert radiobutton.isSelected();
      System.out.println(radiobutton.isSelected());
      radiobutton.isEnabled();
      System.out.println(radiobutton.isEnabled());
      
      //Third Step:Dropdown
      WebElement testDropdown=driver.findElement(By.id("option"));
      Select dropdown= new Select(testDropdown);
      
     dropdown.selectByIndex(2);
     
      
      //Fourth Step:Check List
     
     WebElement CheckBox = driver.findElement(By.name("option3"));
     CheckBox.click();
/*
      WebElement testChecklist=driver.findElement(By.id("moption"));
      Select checklist= new Select(testChecklist);
      dropdown.selectByIndex(3);

		*/
	
	}

}
