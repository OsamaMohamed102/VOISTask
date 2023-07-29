package TaskStepsdefintions;

import LocatorsOfTask.LocatorsofS11;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StepsdefS1 {
    LocatorsofS11 loc = new LocatorsofS11();
    ChromeDriver driver1;

 @Given("user navigate to the website")
     public void navigate_to_website(){
     driver1= new ChromeDriver();
     WebDriverManager.chromedriver().setup();
     Dimension d = new Dimension(1024,768);
     driver1.manage().window().setSize(d);
     driver1.navigate().to("https://www.amazon.com/" );
     }
     @And("type car accessories in search bar")
    public  void writing_in_searchbar(){
     loc.search_bar(driver1).click();
    driver1.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    loc.wirtein_Searchbar(driver1).sendKeys("car accessories");
    loc.wirtein_Searchbar(driver1).sendKeys(Keys.ENTER);
     }

     @And("user select the first item")
    public void select_first_item(){
         WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/span/a/div/img")));
         loc.select_item(driver1).click();

     }
     @And("add item to the cart")
     public void  adding_item_to_cart(){
     WebDriverWait wait = new WebDriverWait(driver1,Duration.ofSeconds(10));
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add item to the cart")));
     loc.Add_item_to_cart(driver1).click();

     }
    @And("Going to cart")
    public void going_to_cart(){
        WebDriverWait wait = new WebDriverWait(driver1,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/span/span/a")));
        loc.go_to_cart(driver1).click();

    }
    @Then("Checking that item have been added successfully")
    public void checking_adding_item_successfully() {
        WebDriverWait wait = new WebDriverWait(driver1, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[3]/div[4]/div/div[1]/div[1]/div/form/div/div/span/span/span/input")));
        Assert.assertTrue(loc.checking_element_exist(driver1).isDisplayed());
 }

}
