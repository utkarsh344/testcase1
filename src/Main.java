import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
public final class Main {
    private WebDriver driver;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("web driver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver-win64\\chromedriver.exe"); // Set path to your chromedriver
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        Map<String, Object> vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        //  driver.quit();
    }
    @Test
    public void dashboard() throws InterruptedException {
        driver.get("https://response24-sa-uat-87856.web.app/provider/pgs/login");
         driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1050, 880));
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("gehlotchirag777@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("ciuynT");
        driver.findElement(By.cssSelector(".btn")).click();
        driver.findElement(By.cssSelector(".swal2-confirm")).click();
        //for dashboard
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[1]/a/p")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[3]/a/p")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[4]/a/p")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[5]/a/p")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"reports\"]/ul/li/a/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/div[1]/div[2]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"collapseExample\"]/ul/li[1]/a/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"collapseExample\"]/ul/li[2]/a/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-profile-cmp/div/div/div/div/div/div[3]/div/div/div/div/div[1]/ul/li[1]/a/i")).click();
        Thread.sleep(2000);
        //dashboard
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[1]/a/p")).click();
        Thread.sleep(2000);
        //elements inside dashboard
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[1]/a/i")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[2]/a")).click();
//        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[1]/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[1]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[3]/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[4]/a/i")).click();
        Thread.sleep(2000);
        /* 1 element in primary */
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[2]/app-provider-dashboard/div/div/div[2]/div[2]/div/div/div/ul/li[1]/a/i")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"responseServicesDataTablePrimary\"]/tbody/tr/td[9]/button/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[2]/a/p")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[2]/a/p")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id="mat-input-11"]")).sendKeys("958019");
//        driver.findElement(By.xpath("/html/body/app-my-app/app-provider-main-layout/div/div[1]/app-provider-sidebar-cmp/div[2]/ul/li[3]/a/p")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id='mat-input-11']")).sendKeys("958019");
//        Thread.sleep(2000);

    }
}