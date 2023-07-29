package LocatorsOfTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsofS2 {

    public WebElement today_deal_loc(WebDriver drv2){
   return drv2.findElement(By.xpath("/html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[1]"));

    }
    public  WebElement headphones_loc(WebDriver drv2){
        return  drv2.findElement(By.xpath("//*[contains(text(), 'Headphones')]"));
    }
    public WebElement disocunt_part(WebDriver drv2){
        return drv2.findElement(By.xpath("//*[contains(text(), '10% off or more')]"));

    }
    public WebElement selet_item_and_Add_itt(WebDriver drv2){
        return drv2.findElement(By.xpath("/html/body/div[1]/div[20]/div/div/div/div[2]/div[3]/div/div[1]/div/div/a/div/div/img"));
    }
}
