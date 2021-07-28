package User_Interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://serenity.is/demo/Account/Login/?ReturnUrl=%2Fdemo%2F")
public class UI_Login extends PageObject {

public static final Target INGRESAR_USER_LOGIN = Target.the("Caja de texto Username").located(By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Username']"));
public static final Target INGRESAR_PASS_LOGIN = Target.the("Caja de texto Password").located(By.xpath("//input[@id='StartSharp_Membership_LoginPanel0_Password']"));
public static final Target CLICK_BTN_SIGNIN = Target.the("Boton Sign In").located(By.xpath("//button[@id='StartSharp_Membership_LoginPanel0_LoginButton']"));

}
