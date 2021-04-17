package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button for login").located(By.xpath("//*[@id=\"nav-menu\"]/ul[2]/li/a"));
    public static final Target TXT_INGRESAR = Target.the("CAMPO PARA USUARIO").located(By.id("username"));
    public static final Target TXT_PASSWORD = Target.the("CAMPO PARA PASSWORD").located(By.id("password"));
    public static final Target BUTTON_ACCEDER = Target.the("BOTON PARA ACCEDER").located(By.xpath("//*[@id=\"Ingresar\"]/div/div/div[2]/div[2]/form/div[3]/button"));
}
