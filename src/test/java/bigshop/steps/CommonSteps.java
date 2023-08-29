package bigshop.steps;


import bigshop.pages.MainPage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
@AllArgsConstructor
public class CommonSteps {

    private MainPage mainPage;

    public void checkMainPageIsOpen() {
        log.info("Check login page is open");
        assertThat(mainPage.isLogoDisplayed()).as("The main page is not displayed").isTrue();
    }

    public void searchProduct(String product){
        log.info("User enters the name of product");
        mainPage.searchProduct(product);
    }

    public void checkSearchResultsCanBeSorted() {
        log.info("User can sort search results");
        assertThat(mainPage.isSortFunctionDisplayed()).as("The filter function is not displayed").isTrue();
    }
}
