package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import models.DatosUsuario;
import questions.IniciarSesion.SeVisualizaElTexto;
import tasks.IniciarSesion.IniciarSesion;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinition {

    @Cuando("^ingrese sus credenciales$")
    public void ingreseSusCredenciales(List<DatosUsuario> datos) {
        theActorInTheSpotlight().attemptsTo(IniciarSesion.enElAplicativo(datos));
    }

    @Entonces("^visualiza el texto de (.*)$")
    public void visualizaElTextoDeDASHBOARD(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaElTexto.deshboard(texto)));
    }
}
