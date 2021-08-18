package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage {

    public static final Target INPUT_CITY = Target.the("Input where will write the city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Input where will write the ZIP CODE")
            .located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("Input where will write the Country")
            .located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static final Target BUTTON_DEVICES = Target.the("Button to go to Devices")
            .located(By.xpath("//div//a[@class='btn btn-blue pull-right']"));
    public static final Target LOADER = Target.the("Target")
            .located(By.xpath("//span[@class='sub-title']"));

}
