package Basiccodes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class launchchrome {

	public static void main(String[] args) {
		
		WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        //driver.get("http://www.google.com");
        driver.get("http://www.facebook.com");
        //string url = "http:/www.flipkart";
        
        //relative xpath---//tagname[@attribute='value']
        //absolute xpath --- /html/head/body/div/div[2]/textarea 
        //CSS selector --- tagname[atrribute='value']
        driver.navigate();
        driver.manage().window().maximize();
       // driver.findElement(By.xpath("textarea[@aria-label='search']")).sendKeys("flipkart");
       // driver.findElement(By.cssSelector("textarea[aria-label] ='search'")).sendKeys("sindoor");
        driver.findElement(By.xpath("button[@name ='login']")).click();
        
        

	}

}
	
