package stepdefinitions.IniciarSesion;

import cucumber.api.java.es.Entonces;
import questions.IniciarSesion.SeVisualizaElTexto;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IniciarSesionStepDefinition {

    @Entonces("^visualiza el texto de (.*)$")
    public void visualizaElTextoDeDASHBOARD(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaElTexto.deshboard(texto)));
    }

}
