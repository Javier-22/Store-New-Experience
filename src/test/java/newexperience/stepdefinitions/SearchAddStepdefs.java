package newexperience.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import newexperience.model.DateRegister;
import newexperience.model.ItemsData;
import newexperience.questions.SearchProductAnsw;
import newexperience.tasks.OpenUp;
import newexperience.tasks.TheUser;
import newexperience.tasks.SearchProduct;


import java.util.List;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class SearchAddStepdefs {
    private int cont=0;
    String suma;
    @Before
    public void sedStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^user navigate to new experience page$")
    public void userNavigateToNewExperiencePage() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.theUrl());
    }

    @When("^The user on the start button and validate the email and register$")
    public void theUserOnTheStartButtonAndValidateTheEmailAndRegister(List<DateRegister>dateRegister) {
        theActorInTheSpotlight().attemptsTo(TheUser.register(dateRegister));
    }

    @And("^user search and adds items$")
    public void userSearchAndAddsItems(List<ItemsData>itemsData) {
        theActorInTheSpotlight().attemptsTo(SearchProduct.SP(itemsData));
        cont=SearchProduct.contador(itemsData);
        suma=String.valueOf(cont);
    }

    @Then("^verify quantity of items$")
    public void verifyQuantityOfItems() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(SearchProductAnsw.value(), equalTo(suma)));
    }

}
