package stepdefinitions.Categoria;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import models.DatosCategoria;
import questions.Categoria.PuedeVisualizar;
import tasks.Categoria.AgregaCategoria;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CategoriaStepDefinition {

    @Cuando("^agrega la categoria con la siguiente informacion$")
    public void agregaLaCategoriaConLaSiguienteInformacion(List<DatosCategoria> datos) {
        theActorInTheSpotlight().attemptsTo(AgregaCategoria.enElAplicativo(datos));
    }

    @Entonces("^puede visualizar el nombre de la categoria (.*)$")
    public void puedeVisualizarElNombreDeLaCategoriaArt(String texto) {
        theActorInTheSpotlight().should(seeThat(PuedeVisualizar.elTextoArt(texto)));
    }
}
