package questions.Correo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static userinterfaces.Correo.CorreoPage.TXT_CORREO;

public class SeVisualizaElTitulo implements Question<Boolean> {

    private String texto;
    public SeVisualizaElTitulo(String texto) { this.texto = texto; }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_CORREO.resolveFor(actor).isPresent()
                && TXT_CORREO.resolveFor(actor).getText().equals(texto);
    }

    public static SeVisualizaElTitulo delCorreo(String texto){ return new SeVisualizaElTitulo(texto);}
}
