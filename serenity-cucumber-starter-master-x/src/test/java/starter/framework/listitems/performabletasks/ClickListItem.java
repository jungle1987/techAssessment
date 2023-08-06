package starter.framework.listitems.performabletasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import starter.framework.listitems.vismatechui.ListItem;

public class ClickListItem
{
    public static Performable withText(String text)
    {
        return Click.on(ListItem.WITH_TEXT.of(text));
    }
}
