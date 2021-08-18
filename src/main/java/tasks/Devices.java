package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;
import userinterface.DevicesPage;

public class Devices implements Task {

    private String brand;
    private String model;
    private String os;

    public Devices(String brand, String model, String os) {
        this.brand = brand;
        this.model = model;
        this.os = os;
    }

    public static Devices fillForm(String brand, String model, String os) {
        return Tasks.instrumented(Devices.class, brand, model, os);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        brand = "//div[contains(text(), '"+brand+"')]";
        model = "//div[contains(text(), '"+model+"')]";
        os = "//div[contains(text(), '"+os+"')]";
        actor.attemptsTo(
                Click.on(DevicesPage.SUBTITLE),
                Click.on(DevicesPage.SELECT_BRAND),
                Scroll.to(By.xpath(brand)),
                Click.on(By.xpath(brand)),
                Click.on(DevicesPage.SELECT_MODEL),
                Scroll.to(By.xpath(model)),
                Click.on(By.xpath(model)),
                Click.on(DevicesPage.SELECT_OS),
                Scroll.to(By.xpath(os)),
                Click.on(By.xpath(os)),
                Click.on(DevicesPage.BUTTON_PASSWORD)
        );
    }
}
