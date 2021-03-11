package questions.IniciarSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.IniciarSesion.IniciarSesionPage.TXT_DASHBOARD;

public class SeVisualizaElTexto implements Question<Boolean> {

    private String texto;
    public SeVisualizaElTexto(String texto) { this.texto = texto; }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_DASHBOARD.resolveFor(actor).isPresent()
                && (TXT_DASHBOARD.resolveFor(actor).getText()).equals(texto);
    }

    public static SeVisualizaElTexto deshboard(String texto) { return new SeVisualizaElTexto(texto);}
}
