package TestBase1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * package TestBase;
 *
 * /**
 *
 * @author omar shalaby
 */
public class TestBase {

    public static WebDriver ChromebrowserObject;
    public static Properties pro;

    public TestBase() throws IOException {
        String propFilePath = System.getProperty("user.dir") + "\\test\\Config\\Configuration.properties";
        pro = new Properties();
        FileInputStream input = new FileInputStream(propFilePath);
        pro.load(input);
    }

    public void Openingbroswer() {
        //System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
         System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");

        ChromebrowserObject = new ChromeDriver();
        String URL = pro.getProperty("URL");
        ChromebrowserObject.navigate().to(URL);
        ChromebrowserObject.manage().window().maximize();
    }

    public void ClosingBrowser() {
        ChromebrowserObject.close();
    }

}
