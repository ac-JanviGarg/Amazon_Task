//package org.example;
//
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//
///**
// * Unit test for simple App.
// */
//public class AppTest
//    extends TestCase
//{
//
//    @BeforeAll
//    void beforeTest() {
//        WebDriver driver = new ChromeDriver("C:\\Users\\janvi\\Downloads\\chrome-win64\\chrome-win64");
//
//    }
//
//
//    WebDriverManager.chromedriver().browserVersion("126.0.6478.57").setup();
//    WebDriver driver  = new ChromeDriver();
//
//        driver.get("https://the-internet.herokuapp.com");
//        driver.findElement(By.linkText("Form Authentication")).click();
//
//
////        driver.findElement(By.id("username")).sendKeys("Tommy");
////        driver.findElement(By.className("radius")).click();
//
////        Thread.sleep(2000);
//        Thread.sleep(2000);
//        driver.quit();
//}
//
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}
//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class demo {
//    public static void main(String[] args) throws InterruptedException {
//
//        WebDriverManager.chromedriver().browserVersion("126.0.6478.57").setup();
//        WebDriver driver  = new ChromeDriver();
//
//        driver.get("https://the-internet.herokuapp.com");
//        driver.findElement(By.linkText("Form Authentication")).click();
//
//
////        driver.findElement(By.id("username")).sendKeys("Tommy");
////        driver.findElement(By.className("radius")).click();
//
////        Thread.sleep(2000);
//        Thread.sleep(2000);
//        driver.quit();
//    }
//
////    private static void click() {
////    }
//}
