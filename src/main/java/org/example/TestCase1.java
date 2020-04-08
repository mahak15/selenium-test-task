package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestCase1{
    WebDriver driver;
    @AfterClass
    public void afterClass()
    {
        System.out.println("after class Test2");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before class");
    }
    @Test(dataProvider = "productName")
    public void testCase3(String product)
    {
        String driverpath = "C:\\\\chromedriver\\\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.get(String.valueOf(By.id("btn_basic_example")));
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span"));
        action.moveToElement(we).build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[7]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div[2]/div/div[1]/a")).click();
        driver.get("https://www.flipkart.com/mobiles/~iphone-8-plus-64gb-and-256gb/pr?sid=tyy%2C4io&otracker=clp_banner_1_7." +
                "bannerX3.BANNER_apple-products-store_W8OZI07LNL&fm=neo%2Fmerchandising&iid=M_1859f6af-7f9c-4e29-8357-c2505829" +
                "dc15_7.W8OZI07LNL&ppt=clp&ppn=apple-products-store&ssid=cqeq9f8hj40000001586065433586");
        driver.findElement(By.partialLinkText("Apple iPhone 8 Plus (PRODUCT)RED (Red, 64 GB)")).click();
        try{
            String path="//*[text()='"+product+"']";
            WebElement textDemo = driver.findElement(By.xpath(path));
            if(textDemo.isDisplayed())
                System.out.println("Product found on the flipkart");}
        catch (Exception e)
        {System.out.println("Product not found");
        }
    }
    @DataProvider(name = "productName")
    public Object[] dataProvider()
    {
        return new Object[]{"Apple iPhone 8 Plus (PRODUCT)RED (Red, 64 GB)"};
    }

}
