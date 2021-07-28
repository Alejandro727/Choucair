package Tasks;

import User_Interface.UI_MenuStartSharp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class T_MenuStartSharp implements Task {


    public static T_MenuStartSharp startshar() {
        return instrumented(T_MenuStartSharp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(UI_MenuStartSharp.CLICK_ORGANIZATION, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(UI_MenuStartSharp.CLICK_ORGANIZATION),
                Click.on(UI_MenuStartSharp.CLICK_BUSSINESS_UNITS)
        );
    }
}
