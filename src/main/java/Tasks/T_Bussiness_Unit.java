package Tasks;

import User_Interface.UI_BusinessUnits;
import User_Interface.UI_MenuStartSharp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class T_Bussiness_Unit implements Task {

    public static T_Bussiness_Unit bussiness_unit() {
        return instrumented(T_Bussiness_Unit.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(UI_BusinessUnits.CLICK_BTN_NEW_BUSSINESS_UNIT)
                //Switch.toFrame(2),
                //WaitUntil.the(UI_BusinessUnits.INGRESAR_NEW_BUSSINESS_UNIT, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                //Enter.theValue("Provedores").into(UI_BusinessUnits.INGRESAR_NEW_BUSSINESS_UNIT)
        );
    }
}
