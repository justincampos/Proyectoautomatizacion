package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairLoginPage;

public class Login implements Task {
    public static Login  onThePage() {
        return Tasks.instrumented(Login.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("jjcampos").into(ChoucairLoginPage.TXT_INGRESAR),
                Enter.theValue("Diciembre_2020*").into(ChoucairLoginPage.TXT_PASSWORD),
                Click.on(ChoucairLoginPage.BUTTON_ACCEDER));


    }


}
