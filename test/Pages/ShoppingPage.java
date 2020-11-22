/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author omar shalaby
 */ 
public class ShoppingPage {

    WebDriver driver;
    //constructor

    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
    }
    By AddtoCartBtnItem1 = By.xpath("//div[@class='inventory_item'][1]//button[@class='btn_primary btn_inventory']");
    By AddtoCartBtnItem2 = By.xpath("//div[@class='inventory_item'][2]//button[@class='btn_primary btn_inventory']");
    By AddtoCartBtnItem3 = By.xpath("//div[@class='inventory_item'][3]//button[@class='btn_primary btn_inventory']");
    By AddtoCartBtnItem4 = By.xpath("//div[@class='inventory_item'][4]//button[@class='btn_primary btn_inventory']");
    //By AddtoCartBtnItem5 = By.xpath("//div[@class='inventory_item'][5]//button[@class='btn_primary btn_inventory']");
    //By AddtoCartBtnItem6 = By.xpath("//div[@class='inventory_item'][6]//button[@class='btn_primary btn_inventory']");
    By CartItem = By.xpath("//div[@id='shopping_cart_container']//a");

    //functions
    public void AddItemtoCart() {
        driver.findElement(AddtoCartBtnItem1).click();
        driver.findElement(AddtoCartBtnItem2).click();
        driver.findElement(AddtoCartBtnItem3).click();
        driver.findElement(AddtoCartBtnItem4).click();
        //driver.findElement(AddtoCartBtnItem2).click();
        //driver.findElement(AddtoCartBtnItem3).click();
        //driver.findElement(AddtoCartBtnItem4).click();

    }

    public void OpenCart() {
        driver.findElement(CartItem).click();
    }
}
