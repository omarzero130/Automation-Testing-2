/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCases;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import TestBase1.TestBase;
import java.io.IOException;
import Pages.ShoppingPage;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author omar shalaby
 */
public class AddItem extends TestBase {

    public WebDriver ChromeBroswerObject;

    public AddItem() throws IOException {
        super();
        // TODO Auto-generated constructor stub
    }

    @Test
    public void addtocart() {
        //ChromeBroswerObject.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        ShoppingPage shp = new ShoppingPage(ChromebrowserObject);
        //WebElement btn = ChromeBroswerObject.findElement(By.xpath("//div[@class='inventory_item'][1]//button[@class='btn_primary btn_inventory']"));
        //btn.click();
        shp.AddItemtoCart();

    }

    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
