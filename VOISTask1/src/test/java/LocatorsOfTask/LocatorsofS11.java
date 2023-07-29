package LocatorsOfTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsofS11 {

    public WebElement search_bar(WebDriver drv1){
        return drv1.findElement(By.id("nav-search"));
    }
    public WebElement wirtein_Searchbar(WebDriver drv1){

        return drv1.findElement(By.id("twotabsearchtextbox"));
    }
    public WebElement select_item(WebDriver drv1){

        return drv1.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/span/a/div/img"));
    }
    public WebElement Add_item_to_cart(WebDriver drv1){

        return drv1.findElement(By.id("add-to-cart-button"));
    }
    public WebElement go_to_cart(WebDriver drv1){

        return drv1.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/span/span/a"));
    }

    public WebElement checking_element_exist(WebDriver drv1){
        return drv1.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[1]/a/img"));
    }
}
