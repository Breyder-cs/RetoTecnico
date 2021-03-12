package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import models.DatosUsuario;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.IniciarSesion.IniciarSesion;
import userinterfaces.IniciarSesion.IniciarSesionPage;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;
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

    @Cuando("^ingrese sus credenciales$")
    public void ingreseSusCredenciales(List<DatosUsuario> datos) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enElAplicativo(datos));
    }
}
