package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import userinterface.AddressPage;

public class Address implements Task {

    private String city;
    private String zip;
    private String country;

    public Address(String city, String zip, String country) {
        this.city = city;
        this.zip = zip;
        this.country = country;
    }

    public static Address fillForm(String city, String zip, String country) {
        return Tasks.instrumented(Address.class, city, zip, country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        country = "//div[contains(text(), '"+country+"')]";
        actor.attemptsTo(
                Click.on(AddressPage.LOADER),
                Clear.field(AddressPage.INPUT_CITY),
                Enter.theValue(city).into(AddressPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).keyIn(AddressPage.INPUT_CITY),
                Clear.field(AddressPage.INPUT_ZIP),
                Enter.theValue(zip).into(AddressPage.INPUT_ZIP),
                Click.on(AddressPage.SELECT_COUNTRY),
                Scroll.to(By.xpath(country)),
                Click.on(By.xpath(country)),

                Click.on(AddressPage.BUTTON_DEVICES)
        );
    }
}
