package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import userinterface.UTestSignUpPage;

public class SignUp implements Task {

    public static SignUp onThePage() {
        return Tasks.instrumented(SignUp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestSignUpPage.BUTTON_SIGNUP),
                Enter.theValue("Cristian").into(UTestSignUpPage.INPUT_FIRSTNAME),
                Enter.theValue("Torres").into(UTestSignUpPage.INPUT_LASTNAME),
                Enter.theValue("correoprueba2022@correoprueba.com").into(UTestSignUpPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("July").from(UTestSignUpPage.SELECT_BIRTHMONTH),
                SelectFromOptions.byVisibleText("25").from(UTestSignUpPage.SELECT_BIRTHDAY),
                SelectFromOptions.byVisibleText("1993").from(UTestSignUpPage.SELECT_BIRTHYEAR),
                Enter.theValue("Spanish").into(UTestSignUpPage.INPUT_LANGUAGES).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.BUTTON_NEXTLOCATION),
                Enter.theValue("Barbosa, Santander").into(UTestSignUpPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UTestSignUpPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UTestSignUpPage.INPUT_CITY),
                Enter.theValue("684511").into(UTestSignUpPage.INPUT_ZIP),
                Click.on(UTestSignUpPage.SELECT_COUNTRY),
                Enter.theValue("Colombia").into(UTestSignUpPage.INPUT_COUNTRY).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.BUTTON_NEXTDEVICES),
                Click.on(UTestSignUpPage.SELECT_COMPUTER),
                Enter.theValue("Windows").into(UTestSignUpPage.INPUT_COMPUTER).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.SELECT_VERSION),
                Enter.theValue("11").into(UTestSignUpPage.INPUT_VERSION).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.SELECT_OSLANGUAGE),
                Enter.theValue("Spanish").into(UTestSignUpPage.INPUT_OSLANGUAGE).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.SELECT_BRANDMOBILE),
                Enter.theValue("Huawei").into(UTestSignUpPage.INPUT_BRANDMOBILE).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.SELECT_MODELMOBILE),
                Enter.theValue("P20 lite").into(UTestSignUpPage.INPUT_MODELMOBILE).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.SELECT_OSMOBILE),
                Enter.theValue("Android 9.0").into(UTestSignUpPage.INPUT_OSMOBILE).thenHit(Keys.ENTER),
                Click.on(UTestSignUpPage.BUTTON_LASTSTEP),
                Enter.theValue("Cristian2022!").into(UTestSignUpPage.INPUT_PASSWORD),
                Enter.theValue("Cristian2022!").into(UTestSignUpPage.INPUT_CONFIRMPASSWORD),
                Click.on(UTestSignUpPage.CHECKBOX_TERMS),
                Click.on(UTestSignUpPage.CHECBOX_PRIVACY),
                Click.on(UTestSignUpPage.BUTTON_COMPLETE)
        );

    }
}
