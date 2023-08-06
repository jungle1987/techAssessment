package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theSearchHomePage() {
        return Task.where("{0} opens the DuckDuckGo home page",
                Open.browserOn().the(DuckDuckGoHomePage.class));
    }
    public static Performable theVismaHomePage()
    {
        return Task.where(
            "{0} opens the Visma home page",
            Open.browserOn().the(VismaHomePage.class));
    }

    public static Performable theUrl(String url)
    {

        return Task.where(
            "{0} opens the desired url",
            Open.url(url));
    }
}
