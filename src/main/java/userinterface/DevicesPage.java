package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage {

    public static final Target SUBTITLE = Target.the("").located(By.xpath("//span[@class='sub-title']"));
    public static final Target SELECT_BRAND = Target.the("Input where will write the Brand")
        .located(By.xpath("//*[text()='Select Brand']"));
    public static final Target SELECT_MODEL = Target.the("Input where will write the Model")
            .located(By.xpath("//*[text()='Select a Model']"));
    public static final Target SELECT_OS = Target.the("Input where will write the OS")
            .located(By.xpath("//div[@id='mobile-device']//*[text()='Select OS']"));
    public static final Target BUTTON_PASSWORD = Target.the("Button to enter the password")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
