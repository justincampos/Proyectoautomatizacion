package userinterface;
        import net.serenitybdd.core.annotations.findby.By;
        import net.serenitybdd.core.pages.PageObject;
        import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject{
    public static final Target BTN_UCHOUCAIR = Target.the("button universidad choucair").located(By.xpath("//*[@id=\"universidad\"]/a"));
    public static final Target TXT_BUSCARCURSO = Target.the("TEXTO PARA BUSCAR CURSO").located(By.id("coursesearchbox"));
    public static final Target BTN_GO = Target.the("button IR ").located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button")); // //button[@class='btn btn-secondary']
    public static final Target CURSO = Target.the("CURSO SELECCIONADO").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div/h4/a"));

}
