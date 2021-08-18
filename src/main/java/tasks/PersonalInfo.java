package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.PersonalInfoPage;

public class PersonalInfo implements Task {

    private String firstName;
    private String lastName;
    private String email;

    public PersonalInfo(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static PersonalInfo fillForm(String firstName, String lastName, String email) {
        return Tasks.instrumented(PersonalInfo.class, firstName, lastName, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(firstName).into(PersonalInfoPage.INPUT_FNAME),
                Enter.theValue(lastName).into(PersonalInfoPage.INPUT_LNAME),
                Enter.theValue(email).into(PersonalInfoPage.INPUT_EMAIL),
                SelectFromOptions.byValue("number:10").from(PersonalInfoPage.SELECT_MONTH),
                SelectFromOptions.byValue("number:21").from(PersonalInfoPage.SELECT_DAY),
                SelectFromOptions.byValue("number:1996").from(PersonalInfoPage.SELECT_YEAR),
                Click.on(PersonalInfoPage.BUTTON_LOCATION)
        );

    }
}
