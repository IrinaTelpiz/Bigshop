package bigshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage {

    @FindBy(css = ".logo")
    private WebElement logo;

    @FindBy(css = ".input_search")
    private WebElement searchInput;

    @FindBy(css = ".ul_search+button[type='submit']")
    private WebElement searchBtn;

    @FindBy(css = ".shop_toolbar_category")
    private WebElement filter;

    public boolean isLogoDisplayed() {
        WebElement myLogo = new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(logo));
        return myLogo.isDisplayed();
    }

    public void searchProduct(String product) {
        getPageLoader().isElementPresent(searchInput);
        searchInput.click();
        searchInput.sendKeys(product);
        searchBtn.click();
    }


    public boolean isFilterFunctionDisplayed() {
        WebElement myFilter = new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(filter));
        return myFilter.isDisplayed();
    }
}
