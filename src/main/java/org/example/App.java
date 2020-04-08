package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class App
{

    public static void main( String[] args )
    {

        String driverPath = "C:\\\\chromedriver\\\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");
        driver.findElement(By.className("_29YdH8")).click();
        WebElement Electronics = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span"));
        Actions action = new Actions(driver).moveToElement(Electronics);
        action.moveToElement(Electronics).build().perform();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[7]/a")).click();
        driver.get("https://www.flipkart.com/apple-products-store?otracker=nmenu_sub_Electronics_0_Apple");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[2]/div/div[1]/a/div/img[2]")).click();
        driver.get("https://www.flipkart.com/mobiles/~iphone-8-plus-64gb-and-256gb/pr?sid=tyy%2C4io&otracker=clp_banner_1_7." +
                "bannerX3.BANNER_apple-products-store_W8OZI07LNL&fm=neo%2Fmerchandising&iid=M_1859f6af-7f9c-4e29-8357-c2505829" +
                "dc15_7.W8OZI07LNL&ppt=clp&ppn=apple-products-store&ssid=cqeq9f8hj40000001586065433586");
        driver.findElement(By.partialLinkText("Apple iPhone 8 Plus (PRODUCT)RED (Red, 64 GB)")).click();
        System.out.println("The Item Exists");


    }
}
