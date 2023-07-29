package TaskStepsdefintions;

import LocatorsOfTask.LocatorsofS2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class StepsdefS2 {
    LocatorsofS2 loc2 = new LocatorsofS2();
    ChromeDriver driver2;

    @Given("user open today's deals")
    public void open_today_deals(){
        driver2= new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        Dimension d = new Dimension(1024,768);
        driver2.manage().window().setSize(d);
        driver2.navigate().to("https://www.amazon.com/");
        loc2.today_deal_loc(driver2).click();
    }

    @And("user select headphones and grocery")
    public void select_headphone(){
        WebDriverWait wait = new WebDriverWait(driver2, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//*[contains(text(), 'Headphones')]"))));
        loc2.headphones_loc(driver2).click();
    }
    @And("choose 10% off from the discount part")
    public void  choose_discount_part(){
            WebDriverWait wait = new WebDriverWait(driver2,Duration.ofSeconds(13));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[20]/div/div/div/div[2]/div[2]/span[6]/h4")));
            loc2.disocunt_part(driver2).click();

    }
    @Then("select any item and add it to the cart")
    public void select_item_and_Add_it(){
    WebDriverWait wait = new WebDriverWait(driver2,Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[20]/div/div/div/div[2]/div[3]/div/div[1]/div/div/a/div/div/img")));
    loc2.selet_item_and_Add_itt(driver2).click();
    driver2.findElement(By.id("add-to-cart-button")).click();
    driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(driver2.findElement(By.xpath("/html/body/div[8]/div[3]/div/div/div[1]/div[3]/div[1]/div[2]/div[3]/span/span/input")).isDisplayed());

    }
}
