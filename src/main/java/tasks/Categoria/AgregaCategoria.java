package tasks.Categoria;

import models.DatosCategoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.Categoria.CategoriaPage;

import java.util.List;

import static models.entity.DatosCategoriaEntity.getDatosCategoria;
import static models.entity.DatosCategoriaEntity.setDatosCategoria;
import static userinterfaces.Categoria.CategoriaPage.*;

public class AgregaCategoria implements Task {

    public AgregaCategoria(DatosCategoria datosCategoria) {setDatosCategoria(datosCategoria);}
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TXT_BLOG),
                Click.on(TXT_BLOG_CATEGORIA),
                Click.on(BTN_AGREGAR),
                Enter.theValue(getDatosCategoria().getNombre()).into(TXT_NOMBRE),
                Click.on(LIST_ESTADO),
                Click.on(OPT_HABILITADO),
                Enter.theValue(getDatosCategoria().getNombreEnVietnamita()).into(TXT_NOMBRE_VIETNAMITA),
                Enter.theValue(getDatosCategoria().getNombreEnRuso()).into(TXT_NOMBRE_RUSO),
                Enter.theValue(getDatosCategoria().getNombreEnArabe()).into(TXT_NOMBRE_ARABE),
                Enter.theValue(getDatosCategoria().getNombreEnFarsi()).into(TXT_NOMBRE_FARSI),
                Enter.theValue(getDatosCategoria().getNombreEnTurco()).into(TXT_NOMBRE_TURCO),
                Enter.theValue(getDatosCategoria().getNombreEnFrances()).into(TXT_NOMBRE_FRANCES),
                Enter.theValue(getDatosCategoria().getNombreEnEspañol()).into(TXT_NOMBRE_ESPAÑOL),
                Enter.theValue(getDatosCategoria().getNombreEnAleman()).into(TXT_NOMBRE_ALEMAN),
                Click.on(BTN_AGREGAR_CATEGORIA));
    }

    public static AgregaCategoria enElAplicativo(List<DatosCategoria> datos){
        return Tasks.instrumented(AgregaCategoria.class, datos.get(0));
    }
}
