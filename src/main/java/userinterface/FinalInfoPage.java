package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalInfoPage {

    public static final Target INPUT_PASSWORD = Target.the("Input where we enter the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASS = Target.the("Input where we confirm the password")
            .located(By.id("confirmPassword"));
    public static final Target INPUT_TERMOFUSE = Target.the("Input where we accept the terms and conditions")
            .located(By.id("termOfUse"));
    public static final Target INPUT_PRIVACITY = Target.the("Input where We accept the privacy and security policies ")
            .located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE = Target.the("Button for finish the setup process")
            .located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target WELCOME_MESSAGE = Target.the("Extract the welcome message")
            .located(By.xpath("//div[@class='image-box-header']//h1"));
    public static final Target LOADER = Target.the("Target")
            .located(By.xpath("//span[@class='sub-title']"));
}
