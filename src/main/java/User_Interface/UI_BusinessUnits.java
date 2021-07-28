package User_Interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UI_BusinessUnits {
    public static final Target ASSERT_TEXTO_BUSSINESS_UNITS = Target.the("Validar titulo BUSSINESS UNITS").located(By.xpath("//div[contains(text(),'Business Units')]"));
    public static final Target CLICK_BTN_NEW_BUSSINESS_UNIT = Target.the("Boton new bussiness unit").located(By.xpath("//span[normalize-space()='New Business Unit']"));
    public static final Target INGRESAR_NEW_BUSSINESS_UNIT = Target.the("Boton new bussiness unit").located(By.xpath("//input[@id='StartSharp_Organization_BusinessUnitDialog17_Name']"));
}
