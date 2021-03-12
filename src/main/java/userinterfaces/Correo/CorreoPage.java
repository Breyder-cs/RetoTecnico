package userinterfaces.Correo;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CorreoPage {

    public static Target TXT_PUBLICACIONES= Target.the("Texto opción publicaciones")
            .locatedBy("//a[text()='Posts']/parent::li");

    public static Target BTN_AGREGAR= Target.the("Botón para agregar correo")
            .locatedBy("(//button[@class='btn btn-success'])[2]");

    public static Target TXT_TITULO_CORREO= Target.the("Caja de texto para agregar titulo del correo")
            .located(By.name("title"));

    public static Target TXT_ENLACE= Target.the("Caja de texto para agregar enlace")
            .located(By.name("slug"));

    public static Target LIST_CATEGORIA= Target.the("Lista desplegable para seleccionar categoria")
            .located(By.name("category"));

    public static Target OPT_CATEGORIA= Target.the("Opción categoria")
            .locatedBy("//option[text()=' Art ']");

    public static Target LIST_CORREO_RELACIONADO= Target.the("Lista desplegable para seleccionar el correo relacionado")
            .locatedBy("//ul[@class='select2-choices']");

    public static Target OPT_CORREO_RELACIONADO= Target.the("Opción correo relacionado")
            .locatedBy("//option[@value='23']");

    public static Target IFRAME= Target.the("Elemento iframe")
            .locatedBy("//iframe[@class='cke_wysiwyg_frame cke_reset']");

    public static Target TXT_PARRAFO= Target.the("Parrafo para ingresar texto en el parrafo")
            .locatedBy("//body[@contenteditable='true']/p");

    public static Target TXT_PALABRA_CLAVE= Target.the("Caja de texto para ingresar palabra clave")
            .located(By.name("keywords"));

    public static Target TXT_DESCRIPCION= Target.the("Caja de texto para ingresar descripción")
            .located(By.name("metadesc"));

    public static Target BTN_ENVIAR= Target.the("Botón enviar")
            .locatedBy("//button[@type='submit']");

    public static Target TXT_CORREO= Target.the("texto para confirmar creación de correo")
            .locatedBy("//tr[@class='xcrud-row xcrud-row-0']//td[text()='Correo prueba']");

    public static Target TXT_ALERTA= Target.the("Alerta")
            .located(By.name("livechat-eye-catcher-img"));

    public static Target TXT_CERRAR_ALERTA= Target.the("X para cerrar alerta")
            .locatedBy("//div[text()='×']");

}
