package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairLoginPage;
import userinterface.SearchCoursePage;


public class SearchCurso implements Task{
    private String course;

    public SearchCurso(String course) {
        this.course = course;
    }

    public static SearchCurso the(String course){
        return Tasks.instrumented(SearchCurso.class, course); }
    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                            Click.on(SearchCoursePage.BTN_UCHOUCAIR),
                            Enter.theValue(course).into(SearchCoursePage.TXT_BUSCARCURSO),
                            Click.on(SearchCoursePage.BTN_GO),
                            Click.on(SearchCoursePage.CURSO)
                        );



    }
}
