package starter.framework.pagelanguage.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import starter.framework.pagelanguage.vismatechui.WebPageLanguage;

public class TheWebPageLanguage
{
    public static Question<Boolean> isVisible(String language)
    {
        return Visibility.of(WebPageLanguage.LANGUAGE_OF_TEXT_CONTENT.of(language)).asBoolean();
    }
}
