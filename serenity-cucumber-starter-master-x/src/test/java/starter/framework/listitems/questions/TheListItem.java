package starter.framework.listitems.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import starter.framework.listitems.vismatechui.ListItem;

public class TheListItem
{
    public static Question<Boolean>isVisible(String text)
    {
        return Visibility.of(ListItem.FIRST_WITH_TEXT.of(text)).asBoolean();
    }
}

