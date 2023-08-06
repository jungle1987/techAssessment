package starter.framework.listitems.vismatechui;

import net.serenitybdd.screenplay.targets.Target;

public class ListItem
{
    public static final Target WITH_TEXT = Target.the("list item with text {0}")
        .locatedBy("//*[@role='list']//*[text()='{0}']");

    public static final Target FIRST_WITH_TEXT = Target.the("list item with text {0}")
        .locatedBy("//*[@class='w-dyn-list'][1]//*[@role='list']//*[text()='{0}']");

}
