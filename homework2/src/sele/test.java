package sele;

import java.io.IOException;
import java.nio.charset.Charset;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import com.csvreader.CsvReader;

public class test {

	public static void main(String[] args) throws IOException{
		CsvReader r = new CsvReader("D://input.CSV", ',' , Charset.forName("GBK"));
	       r.readHeaders(); 
	       while (r.readRecord()) {  
	    	   //读取CSV文件中的数据
	    	   r.readRecord();             
	    	   String number_csv = r.get("number");              
	    	   String address_csv = r.get("github");
	    	   String pwd_csv = number_csv.substring(number_csv.length()-6,number_csv.length());
	       
	    	   //在 chrome 中打开网页
	    	   System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe"); 
	    	   WebDriver driver = new ChromeDriver();
	    	   driver.get("https://psych.liebes.top/st");               
	    	   driver.manage().window().maximize();
	      
	    	   //输入数据
	    	   WebElement input_user = driver.findElement(By.id("username"));
	    	   WebElement input_pwd = driver.findElement(By.id("password"));
	    	   WebElement btn = driver.findElement(By.id("submitButton"));
	    	   input_user.clear();
	    	   input_pwd.clear();
	    	   input_user.sendKeys(number_csv);
	    	   input_pwd.sendKeys(pwd_csv);  	   
	    	   btn.click();
	    	   
	    	   String address = driver.findElement(By.xpath("//p[@class ='login-box-msg']")).getText();
	    	   //通过Xpath来定位用户信息的位置
	    	   
	    	   if(address_csv.equals(address))
	               System.out.println(number_csv+"通过");
	    	   else
	               System.out.println(number_csv+"未通过");
	    	   driver.close();
	        }
	        r.close();      
	}

}
