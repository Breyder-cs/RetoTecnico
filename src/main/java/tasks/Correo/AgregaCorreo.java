package tasks.Correo;

import interactions.Espera;
import models.DatosCorreo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.Keys;

import java.util.List;

import static models.entity.DatosCorreoEntity.getDatosCorreo;
import static models.entity.DatosCorreoEntity.setDatosCorreo;
import static userinterfaces.Categoria.CategoriaPage.TXT_BLOG;
import static userinterfaces.Correo.CorreoPage.*;

public class AgregaCorreo implements Task {

    public  AgregaCorreo(DatosCorreo datosCorreo) {setDatosCorreo (datosCorreo);}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_BLOG),
                Click.on(TXT_PUBLICACIONES),
                Espera.cantidadDeMiliSegundos(3000));

        actor.attemptsTo(Click.on(BTN_AGREGAR));

        actor.attemptsTo(
                Hit.the(Keys.TAB).keyIn(TXT_TITULO_CORREO),
                Hit.the(Keys.TAB).keyIn(TXT_ENLACE),
                Espera.cantidadDeMiliSegundos(3000));

        actor.attemptsTo(Switch.toFrame(2));
        actor.attemptsTo(Enter.keyValues(getDatosCorreo().getParrafo()).into(TXT_PARRAFO));
        actor.attemptsTo(Switch.toDefaultContext());
        actor.attemptsTo(
                Enter.theValue(getDatosCorreo().getTitulo()).into(TXT_TITULO_CORREO),
                Click.on(LIST_CATEGORIA),
                Click.on(OPT_CATEGORIA),
                Click.on(LIST_CORREO_RELACIONADO),
                Click.on(OPT_CORREO_RELACIONADO),
                Enter.theValue(getDatosCorreo().getPalabraClave()).into(TXT_PALABRA_CLAVE),
                Enter.theValue(getDatosCorreo().getDescripcion()).into(TXT_DESCRIPCION));
        //actor.attemptsTo(WaitUntil.the(BTN_ENVIAR, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds());
        actor.attemptsTo(Click.on(BTN_ENVIAR));

    }

    public static AgregaCorreo enElAplicativo(List<DatosCorreo> datos){
        return Tasks.instrumented(AgregaCorreo.class, datos.get(0));
    }
}
