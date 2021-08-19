package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import model.retoTecnicoData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;

import java.util.List;

public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Juan wants to create a user on utest\\.com$")
    public void juanWantsToCreateAUserOnUtestCom() {

        OnStage.theActorCalled("Juan").wasAbleTo(Go.toUtestPage());
    }

    @When("^He fills out the form to register on utest\\.com\\.$")
    public void heFillsOutTheFormToRegisterOnUtestCom(List<retoTecnicoData> data) throws Exception {

        OnStage.theActorInTheSpotlight().attemptsTo(
            PersonalInfo.fillForm(data.get(0).getStrFirstName(), data.get(0).getStrLastName(),data.get(0).getStrEmail()),
            Address.fillForm(data.get(0).getStrCity(), data.get(0).getStrZip(),data.get(0).getStrCountry()),
            Devices.fillForm(data.get(0).getStrBrand(), data.get(0).getStrModel(),data.get(0).getStrOs()),
            FinalInfo.fillForm(data.get(0).getStrPassword())
        );
    }

    @Then("^The find the button to complete registration available$")
    public void theFindTheButtonToCompleteRegistrationAvailable(List<retoTecnicoData> data) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data.get(0).getStrWelcomeMessage())));
    }



}
