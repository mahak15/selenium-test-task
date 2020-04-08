package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class TestCase2 {
    public static void main( String[] args ) {

        String driverpath = "C:\\\\chromedriver\\\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverpath);
// For getting Driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
// Enter Login credentials details
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7080310733");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("mahak1502");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
// Wait for page to render after login
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// Move to more and click Notifications
        WebElement More = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/div/div/div/div"));
        Actions action1= new Actions(driver).moveToElement(More);
        action1.moveToElement(More).build().perform();
        driver.findElement(By.className("_2k68Dy")).click();
// After clicking notifications, wait for page to render via the new URL
//        String currentURL1 = driver.getCurrentUrl();
//        driver.get(currentURL1);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// Click SMS
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/ul/a[3]/li")).click();
// After clicking notifications, wait for page to render via the new URL
//        String currentURL2 = driver.getCurrentUrl();
//        driver.get(currentURL2);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//Click Reminders Check box
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/section/div/div/ul/li[2]/section/div[1]/label/div")).click();
        System.out.println("The Item Exists"); }
}

