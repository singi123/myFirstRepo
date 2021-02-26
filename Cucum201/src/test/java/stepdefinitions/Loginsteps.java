package stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Loginsteps {
	ChromeDriver driver ;
	@Given("I am on login page")
	public void i_am_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sandh\\Software\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		 String titlefirst = driver.getTitle();
		   System.out.println("titile is " + titlefirst);
	}

	@When("login by entering details")
	public void login_by_entering(DataTable usercredentials)  throws Throwable{   
	     List<Map<String, String>> usesrlist = usercredentials.asMaps(String.class, String.class);
	    	 
	   
	    	 
	    	 for (Map<String, String> a:usesrlist) {
	    		
	    		 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(a.get("username"));
		    	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(a.get("password"));
	    	 }
	    	 
	    	 //driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(usesrlist.get(0).get("username"));
	    	 //driver.findElement(By.xpath("//input[@name='password']")).sendKeys(usesrlist.get(0).get("password"));
	     } 
	    	 
	     
		//(table.cell(1,1));
	
//		(table.cell(1,2));
	
	

	@Then("I see bank page tile as {string}")
	public void i_see_bank_page_tile_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//document.querySelector("body > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=submit]:nth-child(1)")
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		 String title = driver.getTitle();
	   System.out.println("titile is " + title);
	}



}
