package Hospital;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Secondopinion {
	WebDriver driver;
	
	@Given("Open the browser, enter the sparsh hospital URL")
	public void open_the_browser_enter_the_sparsh_hospital_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sparshhospital.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@Given("Select  yeshwantpur hospital from hospital dropdown")
	public void select_yeshwantpur_hospital_from_hospital_dropdown() {
		driver.findElement(By.xpath("(//a[@class=\"nav-link dropdown-toggle\"])[3]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.sparshhospital.com/hospitals/sparsh-hospital-yeswanthpur/\"]")).click();
		
		
	}

	@When("user  clicks the second opinion link")
	public void user_clicks_the_second_opinion_link() {
		JavascriptExecutor scrollExecutor= (JavascriptExecutor)driver;
		scrollExecutor.executeScript("window.scrollBy(0,560)");
		driver.findElement(By.linkText("Second Opinion")).click();
	   
	}

	@When("user enters a firstname,lastname, phoneNo , email")
	public void user_enters_a_firstname_lastname_phone_no_email() {
		driver.findElement(By.id("secondopinion_first_name")).sendKeys("Vaishnavi");
		driver.findElement(By.id("secondopinion_last_name")).sendKeys("Gonkar");
		driver.findElement(By.id("secondopinion_phone")).sendKeys("6266232328");
		driver.findElement(By.id("secondopinion_email")).sendKeys("vaishulakhore@gmail.com");
		
	    
	}

	@When("upload a report Enters a messgae ,click on send button")
	public void upload_a_report_enters_a_messgae_click_on_send_button() {
		driver.findElement(By.id("secondopinion_message")).sendKeys("Helli this is vaishnavi");
		driver.findElement(By.id("secondopinion_submit")).click();
	   
	}

	@Then("Thankyou message displayed")
	public void thankyou_message_displayed() {
	    
	}

	@Then("Bank info available")
	public void bank_info_available() {
	    
	}



	

}
