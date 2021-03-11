package tasks.IniciarSesion;

import models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static models.entity.DatosUsuarioEntity.getDatosUsuario;
import static models.entity.DatosUsuarioEntity.setDatosUsuario;
import static userinterfaces.IniciarSesion.IniciarSesionPage.*;

public class IniciarSesion implements Task {
    public IniciarSesion(DatosUsuario datosUsuario) {setDatosUsuario(datosUsuario);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(getDatosUsuario().getCorreo()).into(TXT_CORREO),
                Enter.theValue(getDatosUsuario().getContrasenia()).into(TXT_CONTRASENIA),
                Click.on(BTN_INICIAR_SESION)
        );
    }

    public static IniciarSesion enElAplicativo(List<DatosUsuario> datos){
        return Tasks.instrumented(IniciarSesion.class, datos.get(0));
    }
}
