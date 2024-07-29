package org.example.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class SearchAmazonPage {
    private WebDriver driver;
    private WebDriverWait wait;
//
//    private By searchBox = By.id("twotabsearchtextbox");
//    private By searchButton = By.xpath("//input[@value='Go']");

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBox;

    @FindBy(xpath = "//input[@value='Go']")
    private WebElement searchButton;

    
    public SearchAmazonPage(WebDriverManager driver) {
        this.driver = (WebDriver) driver;
        this.wait =new WebDriverWait((WebDriver)driver, Duration.ofSeconds(5));
        PageFactory.initElements((SearchContext) driver, this);
    }

    public void search(String query) {
//        wait.until(ExpectedConditions.visibilityOf(searchBox));
//        searchBox.clear();
        searchBox.sendKeys(query);
        searchButton.click();

//        driver.findElement(searchBox).sendKeys(query);
//        driver.findElement(searchButton).click();

    }

//    public List<WebElement> getTitles() {
//        return driver.findElements(resultsTitle);
//    }
//
//    public List<WebElement> getPrices() {
//        return driver.findElements(resultsPrice);
//    }


    public List<Product>getProducts() {
        List<Product> products = new ArrayList<>();
        List<WebElement> titles = driver.findElements(By.cssSelector(".s-title"));
        List<WebElement> prices = driver.findElements(By.cssSelector(".a-price-whole"));

        for(int i=0; i<Math.min(titles.size(), products.size()); i++) {
            String title = titles.get(i).getText();
            String priceText = prices.get(i).getText().replace(",", "");
            double price = Double.parseDouble(priceText);
            products.add(new Product(title, price));
        }

        return products;
    }
}

