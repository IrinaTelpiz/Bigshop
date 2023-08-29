package bigshop.step_definitions;

import bigshop.steps.CommonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommonDefinitions {


    private CommonSteps commonSteps;


    @Given("the user is on main page")
    public void theUserIsOnMainPage() {
        commonSteps.checkMainPageIsOpen();
    }


    @When("the user enters name of {word} in the searchbar")
    public void theUserEntersNameOfProductInTheSearchbar(String product) {
        commonSteps.searchProduct(product);
    }

    @Then("related to search products are displayed on page")
    public void relatedToSearchProductsAreDisplayedOnPage() {
        commonSteps.checkSearchResultsCanBeFiltered();
    }
}
