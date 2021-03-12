package questions.Categoria;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.Categoria.CategoriaPage;

import static userinterfaces.Categoria.CategoriaPage.TXT_NOMBRE_CATEGORIA;

public class PuedeVisualizar implements Question<Boolean> {

    private String texto;
    public PuedeVisualizar(String texto) { this.texto = texto; }

    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_NOMBRE_CATEGORIA.resolveFor(actor).isPresent()
                && TXT_NOMBRE_CATEGORIA.resolveFor(actor).getText().equals(texto);
    }

    public static PuedeVisualizar elTextoArt(String texto){ return new PuedeVisualizar(texto);}
}
