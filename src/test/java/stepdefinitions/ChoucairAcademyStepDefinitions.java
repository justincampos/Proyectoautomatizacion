package stepdefinitions;
import  cucumber.api.java.Before;
import  cucumber.api.java.en.Given;
import  cucumber.api.java.en.When;
import  cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.fluentlenium.core.search.Search;
import tasks.Login;
import tasks.OpenUp;
import tasks.SearchCurso;

import javax.naming.directory.SearchResult;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }

    @When("^he search for the course (.*) on the course academy plataforma$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheCourseAcademyPlataforma(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchCurso.the(course));

    }

    @Then("^he finds the called resourse recurso automatizacion bancolombia$")
    public void heFindsTheCalledResourseRecursoAutomatizacionBancolombia() {
        // Write code here that turns the phrase above into concrete actions

    }

}
