package starter.framework.pagelanguage.vismatechui;

import net.serenitybdd.screenplay.targets.Target;

public class WebPageLanguage
{
    public static final Target LANGUAGE_OF_TEXT_CONTENT = Target.the(" identifies the language of text content on the web {0}")
        .locatedBy("//*[@lang='{0}']");
}
