package Questions;

import User_Interface.UI_MenuStartSharp;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class Q_StartSharp {
    public static Question<String> validarTituloDashboard(){
        return actor -> TextContent.of(UI_MenuStartSharp.ASSERT_TEXTO_STARTSHARP).viewedBy(actor).asString().trim();
    }
}
