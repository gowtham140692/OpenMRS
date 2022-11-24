package com.OpenMrs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class1  {
	
public static WebDriver driver;
	
	public static WebDriver browser_Launch() {
      WebDriverManager.chromedriver().setup();
      driver= new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();
      return driver;
	}
	
	public static void close() {
    
		driver.close();
	}
	
	public static void quit() {
       driver.quit();
	}
	
	public static void navi_To(String url) {
      driver.navigate().to(url);
	}
	
	public static void navi_Back() {
    driver.navigate().back();
	}
	
	public static void navi_Forward() {
     driver.navigate().forward();
	}
	
	public static void navi_Refresh() {
     driver.navigate().refresh();
	}
	public static void page_Launch(String url) {
    driver.get(url);
	}
	public static void alert(WebElement element) {
    element.click();
    driver.switchTo().alert().accept();
	}
	
	public static void mouse_Click(WebElement element) {
     Actions ac = new Actions(driver);
     ac.click(element).build().perform();
	}
	
	public static void context_Click(WebElement element) {
		Actions ac = new Actions(driver);
	    ac.contextClick(element).build().perform();
	}
	
	public static void double_Click(WebElement element) {
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
	}
	
	public static void move_To_Element(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	
	public static void single_Frame(WebElement keys) {
     
     driver.switchTo().frame(keys);
     
	}
	
	public static void multi_Frame(WebElement element,WebElement element1) {
     
     driver.switchTo().frame(element);
     driver.switchTo().frame(element1);
     
	}
	
   public static void selectbyvalue_Dropdown(WebElement value,String value1) {
      
      Select s = new Select(value);
      s.selectByValue(value1);
     
   }	
   
  public static void selectbyvisibletext_Dropdown(WebElement element,String text) {

	  Select s = new Select(element);
	  s.selectByVisibleText(text);
}
   
   public static void checkbox(WebElement element) {
       element.click();
   }
   
   public static void is_Enabled(WebElement element) {
     
     boolean enabled = element.isEnabled();
     System.out.println(enabled);
   }
   
   public static void is_Displayed(WebElement element) {
	    
	     boolean display = element.isDisplayed();
	     System.out.println(display);
	   }
   
   public static void is_Selected(WebElement element) {
	     
	     boolean select = element.isSelected();
	     System.out.println(select);
	   }
   
   public static void get_Options(WebElement element) {
     
     Select s = new Select(element);
     List<WebElement> options2 = s.getOptions();
     for (WebElement webElement : options2) {
    	 System.out.println(webElement.getText());
	 }
     }
   
   public static String page_Title() {
     
        return driver.getTitle();
    }
   
   public static void page_Url(String value) {
 
     System.out.println(driver.getCurrentUrl());
    }
   
   public static String get_Text(WebElement element) {
      
        return element.getText();
	 }
   
   public static void get_Attribute(WebElement element,String value) {
    
          System.out.println(element.getAttribute(value));
     }
  
   public static void screenshot(String name) throws IOException {
	   TakesScreenshot ts =(TakesScreenshot)driver;
     File source = ts.getScreenshotAs(OutputType.FILE);
     File destination = new File("C:\\Users\\Mohamed Rifakathali\\eclipse-workspace3\\OpenMrs\\Screenshot\\" +name +".png" );
     FileUtils.copyFile(source, destination);
    }
   
    public static void javaClick(WebElement element) {
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("arguments[0].click()",element);
	}
    public static void javaSendkeys(String path,WebElement element) {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value',"+path+")",element);
 	}
    
    public static void sendKeys(WebElement keys,String value) {
      
       keys.sendKeys(value);
	}
    public static void sendKeyswithTab(WebElement keys1,String value) {
        
        keys1.sendKeys(value+Keys.TAB);
 	}
public static void sendKeyswithEnter(WebElement keys1,String value) {
        
        keys1.sendKeys(value+Keys.ENTER);
 	}
    public static void to_Click(WebElement keys ) {
        
        keys.click();
	}
    
    public static void get_First_Selected(WebElement element) {
   
    Select s = new Select(element);
    System.out.println(s.getFirstSelectedOption());
	}
    
    public static void get_All_Selected( WebElement element ) {
        
        Select s = new Select(element);
        List<WebElement> all = s.getAllSelectedOptions();
        for (WebElement web : all) {
			System.out.println(web.getText());
		}
    	}
    
    public static void is_Multiple( WebElement element) {
       
        Select s = new Select(element);
        System.out.println(s.isMultiple());
	}
    
    public static void radiobutton(WebElement element) {
       element.click();
	}
    
    public static void get_Window_Handle() {
       Set<String> handles = driver.getWindowHandles();
       for (String id : handles) {
		driver.switchTo().window(id);
	}
	}

}
