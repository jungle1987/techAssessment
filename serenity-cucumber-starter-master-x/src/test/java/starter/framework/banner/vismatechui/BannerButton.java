package starter.framework.banner.vismatechui;

import net.serenitybdd.screenplay.targets.Target;

public class BannerButton
{
    public static final Target WITH_ID = Target.the("button with id {0}")
        .locatedBy("//*[@id='onetrust-banner-sdk']//div[@id='onetrust-button-group-parent']//*[@class='banner-actions-container']//*[@id='{0}']");
}
