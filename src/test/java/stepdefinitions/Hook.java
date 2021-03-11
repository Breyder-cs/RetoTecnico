package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import userinterfaces.IniciarSesion.IniciarSesionPage;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

import static utils.constants.ActorConstants.ACTOR_DEFAULT;

public class Hook {
    @Before
    public static void inicializar() {
        setTheStage(new OnlineCast());
        theActor(ACTOR_DEFAULT);
    }

    @Dado("^que el (.*) se encuentre en la pagina de PHPTRAVELS$")
    public void queElUsuarioSeEncuentreEnLaPaginaDePHPTRAVELS(String actor) {
    theActor(actor).attemptsTo(Open.browserOn(new IniciarSesionPage()));
    }
}
