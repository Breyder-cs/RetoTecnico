package userinterfaces.IniciarSesion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionPage extends PageObject {

    public static Target TXT_gfg = Target.the("Campo de texto para digitar correo")
            .located(By.id("i0116"));

    public static Target TXT_ehh= Target.the("Elemento para mentener la sesión iniciada")
            .locatedBy("//div[text()='¿Quiere mantener la sesi\u00F3n iniciada?']");

    public static Target TXT_CORREO = Target.the("Campo de texto para digitar correo")
            .located(By.name("email"));

    public static Target TXT_CONTRASENIA = Target.the("Campo de texto para digitar contraseña")
            .located(By.name("password"));

    public static Target BTN_INICIAR_SESION= Target.the("Botón para iniciar sesión")
            .locatedBy("//span[text()='Login']");

    public static Target TXT_DASHBOARD= Target.the("Texto para validar el inicio se sesión")
            .locatedBy("//p[text()='DASHBOARD']");
}
