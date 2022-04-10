package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSignUpPage extends PageObject {
    public static final Target BUTTON_SIGNUP = Target.the("Join Today button")
            .located(By.xpath("//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_FIRSTNAME = Target.the("firstname input")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("lastname input")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("email input")
            .located(By.id("email"));
    public static final Target SELECT_BIRTHMONTH = Target.the("birth month select ")
            .located(By.id("birthMonth"));
    public static final Target SELECT_BIRTHDAY = Target.the("birth day select ")
            .located(By.id("birthDay"));
    public static final Target SELECT_BIRTHYEAR = Target.the("birth year select")
            .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("languages input")
            .located(By.xpath ("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target BUTTON_NEXTLOCATION = Target.the("next location button")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target INPUT_CITY = Target.the("Type your city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Zip or Postal Code input")
            .located(By.id("zip"));
    public static final Target SELECT_COUNTRY = Target.the("Country input")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final  Target INPUT_COUNTRY = Target.the("Country input")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_NEXTDEVICES = Target.the("next devices button")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target SELECT_COMPUTER = Target.the("OS computer input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target SELECT_VERSION = Target.the("version computer input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SELECT_OSLANGUAGE = Target.the("language computer input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target SELECT_BRANDMOBILE = Target.the("brand mobile device input")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target SELECT_MODELMOBILE = Target.the("model mobile device input")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SELECT_OSMOBILE = Target.the("OS mobile device input")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_COMPUTER = Target.the("OS computer input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target INPUT_VERSION = Target.the("version computer input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target INPUT_OSLANGUAGE = Target.the("language computer input")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target INPUT_BRANDMOBILE = Target.the("rand mobile device input")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target INPUT_MODELMOBILE = Target.the("model mobile device input")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target INPUT_OSMOBILE = Target.the("OS mobile device input")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_LASTSTEP = Target.the("next button")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_PASSWORD = Target.the("password input")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("Confirm password input")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_TERMS = Target.the("accept terms checkbox")
            .located(By.name("termOfUse"));
    public static final Target CHECBOX_PRIVACY = Target.the("accept privacy policy checkbox")
            .located(By.name("privacySetting"));
    public static final Target BUTTON_COMPLETE = Target.the("complete setup button")
            .located(By.id("laddaBtn"));
    public static final Target NAME_BUTTON = Target.the("button's name")
            .located(By.xpath("//*[@id=\"laddaBtn\"]/span"));

}
