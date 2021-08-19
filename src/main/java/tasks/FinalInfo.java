package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.FinalInfoPage;

public class FinalInfo implements Task {

    private String password;

    public FinalInfo(String password) {
        this.password = password;
    }

    public static FinalInfo fillForm(String password) {
        return Tasks.instrumented(FinalInfo.class, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FinalInfoPage.LOADER),
                Enter.theValue(password).into(FinalInfoPage.INPUT_PASSWORD),
                Click.on(FinalInfoPage.INPUT_TERMOFUSE),
                Click.on(FinalInfoPage.LOADER),
                Enter.theValue(password).into(FinalInfoPage.INPUT_CONFIRMPASS),
                Click.on(FinalInfoPage.INPUT_PRIVACITY),
                Click.on(FinalInfoPage.LOADER)
        );
    }
}
