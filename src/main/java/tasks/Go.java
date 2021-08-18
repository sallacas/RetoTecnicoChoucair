package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UtestPage;

public class Go implements Task {

    private UtestPage utestPage;

    public static Go toUtestPage() {
        return Tasks.instrumented(Go.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Open.browserOn(utestPage),
            Click.on(utestPage.SIGNUP_BUTTON)
        );
    }
}
