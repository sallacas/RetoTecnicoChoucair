package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UtestPage extends PageObject {
    public static final Target SIGNUP_BUTTON = Target.the("Button to go to register").
            located(By.xpath("//li//a[@class='unauthenticated-nav-bar__sign-up']"));
}
