package User_Interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UI_MenuStartSharp {
    public static final Target ASSERT_TEXTO_STARTSHARP = Target.the("Titulo StartSharp").located(By.xpath("//b[contains(text(),'StartSharp')]"));
    public static final Target CLICK_ORGANIZATION = Target.the("Menu Organization").located(By.xpath("//span[contains(text(),'Organization')]"));
    public static final Target CLICK_BUSSINESS_UNITS = Target.the("Menu Organization").located(By.xpath("//span[contains(text(),'Business Units')]"));
}
