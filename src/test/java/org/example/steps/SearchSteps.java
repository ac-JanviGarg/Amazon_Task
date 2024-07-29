package org.example.steps;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import io.cucumber.java.PendingException;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.example.pages.SearchAmazonPage;
import org.example.pages.Product;

import static java.util.Collections.sort;


public class SearchSteps{

    SearchAmazonPage searchAmazonPage;
    WebDriver driver;

    //    driver
//    WebDriverManager.chromedriver().browserVersion("126.0.6478.57").setup();
//    driver = new ChromeDriver();


    @BeforeAll
    public void setUp() {
//        WebDriverManager.chromedriver(),setUp();

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        searchAmazonPage = new SearchAmazonPage( driver);
    }

    @AfterAll
    public void afterAll() {
       driver.quit();
    }


//    @When("When I search for {string} on Amazon")
//    public void given_i_search_on_amazon(String product) {
//        searchAmazonPage = new SearchAmazonPage(driver);
//        driver.get("https://www.amazon.in");
//        searchAmazonPage.search(product);
//    }

//    @When("When I search for {string} on Amazon")
//    public void given_i_search_on_amazon(String product) {
////        driver.get("https://www.amazon.in");
////        searchAmazonPage.search(product);
//    }

//    @Then("Then the results should be stored and displayed sorted by their price")
//    public void results_sorting_by_price() {
//        searchAmazonPage = new SearchAmazonPage(driver);
//        driver.get("https://www.amazon.in");
//        searchAmazonPage.search(product);
//
//
//        List<String> titles = searchAmazonPage.getTitles().stream().map(WebElement::getText).collect(Collectors.toList());
//        List<String> prices = searchAmazonPage.getPrices().stream().map(WebElement::getText).collect(Collectors.toList());
//
//        List<Double> numericPrices = prices.stream().map(price -> price.replace(" ", "").replace(",", ""0)).map(Double::parseDouble).sorted().collect(Collectors.toList());
//
//        for (Double price : numericPrices) {
//            System.out.println("Product: "+product+" Price: "+price);
//        }
//
//        Assert.assertTrue(numericPrices.equals(numericPrices.stream().sorted().collect(Collectors.toList())));
//
//        driver.quit();
//    }


//    @Then("Then the results should be stored and displayed sorted by their price")
//    public void results_sorting_by_price() {
//
//        List<Product> products = searchAmazonPage.getProducts();
//        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
//
//        System.out.println("The search results are: ");
//        for(Product product : products) {
//            System.out.println("Product : " + product.getTitle() + " Price : " + product.getPrice());
//        }
//
//        for(int i=1; i<products.size(); i++) {
//            Assert.assertTrue(products.get(i-1).getPrice() <= products.get(i).getPrice());
//        }
//
//        driver.quit();

//    }

    @When("I search for {string} on Amazon")
    public void iSearchForOnAmazon(String arg0) {

        driver.get("https://www.amazon.in");
        searchAmazonPage.search(arg0);
//        throw new io.cucumber.java.PendingException();

    }

    @Then("the results should be stored and displayed sorted by their price")
    public void theResultsShouldBeStoredAndDisplayedSortedByTheirPrice() {

        List<Product> products = searchAmazonPage.getProducts();
        products.sort(Comparator.comparingDouble(Product::getPrice));

        System.out.println("The search results are: ");
        for(Product product : products) {
            System.out.println("Product : " + product.getTitle() + " Price : " + product.getPrice());
        }

        for(int i=1; i<products.size(); i++) {
            Assert.assertTrue(products.get(i-1).getPrice() <= products.get(i).getPrice());
        }

//        driver.quit();

//        throw new io.cucumber.java.PendingException();
    }
}