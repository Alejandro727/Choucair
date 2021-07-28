package Tasks;

import User_Interface.UI_Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class T_Login implements Task {
    private String User ;
    private String Password;

    public T_Login(String user, String password) {
        this.User = user;
        this.Password = password;
    }

    public static T_Login login(String user, String password){
        return instrumented(T_Login.class,user,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(User).into(UI_Login.INGRESAR_USER_LOGIN),
                Enter.theValue(Password).into(UI_Login.INGRESAR_PASS_LOGIN),
                Click.on(UI_Login.CLICK_BTN_SIGNIN)
        );
    }
}
