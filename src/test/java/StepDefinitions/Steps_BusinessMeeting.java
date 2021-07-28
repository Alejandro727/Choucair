package StepDefinitions;

import Questions.Q_StartSharp;
import Tasks.OpenUp;
import Tasks.T_Bussiness_Unit;
import Tasks.T_Login;
import Tasks.T_MenuStartSharp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;

public class Steps_BusinessMeeting {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^El usuario ingresa a la pagina y realiza el login a la pagina (.+) (.+)$")
    public void elUsuarioIngresaALaPaginaYRealizaElLoginALaPaginaAdminSerenity(String User , String Pass) {
        //Abre el navegador y carga la pagina
        OnStage.theActorCalled("User").wasAbleTo(OpenUp.thePage());

        //Se realiza el proceso de Login
        OnStage.theActorInTheSpotlight().attemptsTo(T_Login.login(User,Pass));
    }


    @When("^Se valida el ingreso correcto a la plataforma$")
    public void seValidaElIngresoCorrectoALaPlataforma() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("Mostrar titulo Dashboard", Q_StartSharp.validarTituloDashboard(), CoreMatchers.equalTo("StartSharp"))
        );
    }

    @Then("^realizar la creacion de nueva unidad de negocio$")
    public void realizarLaCreacionDeNuevaUnidadDeNegocio() {
        OnStage.theActorInTheSpotlight().attemptsTo(T_MenuStartSharp.startshar());
        OnStage.theActorInTheSpotlight().attemptsTo(T_Bussiness_Unit.bussiness_unit());
    }

    @Then("^realizar la creacion de nueva reunion$")
    public void realizarLaCreacionDeNuevaReunion() {

    }
}
