package userinterfaces.Categoria;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaPage {

    public static Target TXT_BLOG= Target.the("Texto opción blog")
            .locatedBy("(//a[@data-toggle='collapse'])[11]");

    public static Target TXT_BLOG_CATEGORIA= Target.the("Texto opción blog categoria")
            .locatedBy("//a[text()='Blog Categories']/parent::li");

    public static Target BTN_AGREGAR= Target.the("Botón para agregar")
            .locatedBy("//div[@class='add_button_modal']//button");

    public static Target TXT_NOMBRE = Target.the("Campo de texto para digitar nombre")
            .located(By.name("name"));

    public static Target LIST_ESTADO= Target.the("Lista despegable estado")
            .located(By.name("status"));

    public static Target OPT_HABILITADO= Target.the("Opción de estado habilitado")
            .locatedBy("//select[@name='status']//option[@value='Yes']");

    public static Target OPT_DESHABILITADO= Target.the("Opción de estado deshabilitado")
            .locatedBy("//select[@name='status']//option[@value='No']");

    public static Target TXT_NOMBRE_VIETNAMITA= Target.the("Caja de texto para ingresar el nombre en vietnamita")
            .locatedBy("//input[@name='translated[vi][name]']");

    public static Target TXT_NOMBRE_RUSO= Target.the("Caja de texto para ingresar el nombre en ruso")
            .locatedBy("//input[@name='translated[ru][name]']");

    public static Target TXT_NOMBRE_ARABE= Target.the("Caja de texto para ingresar el nombre en arabe")
            .locatedBy("//input[@name='translated[ar][name]']");

    public static Target TXT_NOMBRE_FARSI= Target.the("Caja de texto para ingresar el nombre en farsi")
            .locatedBy("//input[@name='translated[fa][name]']");

    public static Target TXT_NOMBRE_TURCO= Target.the("Caja de texto para ingresar el nombre en turco")
            .locatedBy("//input[@name='translated[tr][name]']");

    public static Target TXT_NOMBRE_FRANCES= Target.the("Caja de texto para ingresar el nombre en frances")
            .locatedBy("//input[@name='translated[fr][name]']");

    public static Target TXT_NOMBRE_ESPAÑOL= Target.the("Caja de texto para ingresar el nombre en español")
            .locatedBy("//input[@name='translated[es][name]']");

    public static Target TXT_NOMBRE_ALEMAN= Target.the("Caja de texto para ingresar el nombre en aleman")
            .locatedBy("//input[@name='translated[de][name]']");

    public static Target BTN_AGREGAR_CATEGORIA= Target.the("Botón para agregar una categoria")
            .locatedBy("//button[text()='Add']");

    public static Target TXT_NOMBRE_CATEGORIA= Target.the("Texto para validar creación de la categoria")
            .locatedBy("//tr[@class='xcrud-row xcrud-row-0']//td[text()='Art']");
}
