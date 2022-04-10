package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUp;
import tasks.SignUp;

public class CreateNewUserUTest {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^User is on home page$")
    public void userIsOnHomePage() {
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());
    }

    @When("^User fills the register form$")
    public void userFillsTheRegisterForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.onThePage());

    }

    @Then("^the user finds the complete setup button$")
    public void theUserFindsTheCompleteSetupButton() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe("Complete Setup")));
    }
}
