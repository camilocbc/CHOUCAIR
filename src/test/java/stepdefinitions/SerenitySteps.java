package stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.ByAction;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import tasks.*;
import userinterfaces.SerenityPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.SerenityPage.A_REUNION;

public class SerenitySteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("CHOUCAIR");
    private SerenityPage serenityPage = new SerenityPage();

    @Given("^Ingreso al Serenity$")
    public void ingresoAlSerenity() {
    actor.can(BrowseTheWeb.with(navegador));
    navegador.manage().window().maximize();
    actor.wasAbleTo(Open.browserOn(serenityPage));
    }

    @When("^inicio sesion creo unidad de negocio \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void inicioSesionCreoUnidadDeNegocio(String usuario, String clave, String nReunion, String reunionP) {
        actor.wasAbleTo(IniciarSesion.login(usuario,clave));
        actor.wasAbleTo(CrearUnidadN.crearUnidadN(nReunion,reunionP));

    }
    @When("^Creo Reunion \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void creoReunion(String nombreReunion, String tipoReunion, String fechaInicio, String horaInicio, String fechaFin, String horaFin) {
        actor.wasAbleTo(
                CrearReunion.crearReunion(nombreReunion,tipoReunion,fechaInicio,horaInicio,fechaFin,horaFin));
    }

    @Then("^valido creacion de reunion$")
    public void validoCreacionDeReunion() {
        actor.should(seeThat(the(A_REUNION), isPresent()));

    }

}
