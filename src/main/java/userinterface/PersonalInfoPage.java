package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInfoPage {

    public static final Target INPUT_FNAME = Target.the("Input where will write the first name")
        .located(By.id("firstName"));
    public static final Target INPUT_LNAME = Target.the("Input where will write the last name")
        .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Input where will wrrite the email")
        .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Select where choose the month of birth")
        .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("Select where choose the day of the birth")
        .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("Select where choose the year of the birth")
        .located(By.id("birthYear"));
    public static final Target BUTTON_LOCATION = Target.the("Button to go to localization")
        .located(By.xpath("//a[@class='btn btn-blue']"));

}
