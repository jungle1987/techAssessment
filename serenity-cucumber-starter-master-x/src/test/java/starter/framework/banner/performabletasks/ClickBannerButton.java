package starter.framework.banner.performabletasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import starter.framework.banner.vismatechui.BannerButton;

public class ClickBannerButton
{
    public static Performable withId(String id)
    {
        return Click.on(BannerButton.WITH_ID.of(id));
    }
}
