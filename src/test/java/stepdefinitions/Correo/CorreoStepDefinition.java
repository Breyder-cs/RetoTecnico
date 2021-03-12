package stepdefinitions.Correo;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import models.DatosCorreo;
import questions.Correo.SeVisualizaElTitulo;
import tasks.Correo.AgregaCorreo;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CorreoStepDefinition {

    @Cuando("^agerga un correo con la siguiente informacion$")
    public void agergaUnCorreoConLaSiguienteInformacion(List<DatosCorreo> datos) {
        theActorInTheSpotlight().attemptsTo(AgregaCorreo.enElAplicativo(datos));
    }

    @Entonces("^se visualiza el nombre del correo (.*)$")
    public void seVisualizaElNombreDelCorreoCorreoPrueba(String texto) {
        theActorInTheSpotlight().should(seeThat(SeVisualizaElTitulo.delCorreo(texto)));
    }
}
