package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterSteps {
WebDriver driver;
   @Given("^user in the register page$")
    public void user_in_the_register_page(){
       System.setProperty("webdriver.chrome.driver","C:\\Users\\nafas\\Desktop\\sohag\\eBayBDD\\eBayCucumber\\browser-driver\\chromedriver.exe");
       driver= new ChromeDriver();
       driver.navigate().to("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
   }
    @Then("^put first name$")
    public void put_first_name() throws Throwable {
       driver.findElement(By.id("firstname")).sendKeys("Muhammad");
    }
    @Then("^put last name$")
    public void put_last_name() throws Throwable {
       driver.findElement(By.id("lastname")).sendKeys("Sohag");
    }

    @Then("^provide email address$")
    public void provide_email_address() throws Throwable {
       driver.findElement(By.id("email")).sendKeys("ebay@gamil.com");
    }
    @Then("^give password$")
    public void give_password() throws Throwable {
       driver.findElement(By.id("PASSWORD")).sendKeys("JKDFJLJ$");
    }

    @Then("^click create account button$")
    public void click_create_account_button() throws Throwable {
       Thread.sleep(20000);
       driver.quit(); //as we didnt valid email so we will not click on rather quit.
    }

}
