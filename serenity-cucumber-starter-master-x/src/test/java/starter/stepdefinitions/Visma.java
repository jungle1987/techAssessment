package starter.stepdefinitions;

import static org.hamcrest.Matchers.is;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.framework.banner.performabletasks.ClickBannerButton;
import starter.framework.banner.vismatechui.BannerButton;
import starter.framework.listitems.performabletasks.ClickListItem;
import starter.framework.listitems.questions.TheListItem;
import starter.framework.pagelanguage.questions.TheWebPageLanguage;
import starter.navigation.NavigateTo;

public class Visma
{
    public String ACCEPT_ALL_COOKIES = "onetrust-accept-btn-handler";
    public static final Target NAVIGATION_BAR = Target.the("button with id {0}")
        .locatedBy("//div[@class='navbar-right']//div[@class='nav-button is-nav']");

    public static final Target TEST_IN_DOM = Target.the("the Test text in DOM")
        .locatedBy("//*[contains(text(), 'Test')]");

    @Given("{actor} navigates to the homepage")
    public void navigateToVismaHomePage(Actor actor)
    {
        when(actor).attemptsTo(
            NavigateTo.theVismaHomePage()
        );
    }

    @When("{actor} accepts cookies")
    public void acceptCookies(Actor actor)
    {
        when(actor).attemptsTo(
            WaitUntil.the(BannerButton.WITH_ID.of(ACCEPT_ALL_COOKIES), isClickable()),
            ClickBannerButton.withId(ACCEPT_ALL_COOKIES)
        );
    }

    @Then("{actor} selects the Contact Us from the dropdown menu")
    public void selectContactUs(Actor actor)
    {
        when(actor).attemptsTo(
            Click.on(NAVIGATION_BAR).then(ClickListItem.withText("Contact us"))
        );
    }

    @When("{actor} validates the national websites country list is correct")
    public void validateNationalWebsites(Actor actor, List<String> countries)
    {
        for (String country : countries)
        {
            then(actor).should(
                seeThat(TheListItem.isVisible(country))
            );
        }
    }

    @Then("{actor} validates if Lithuania page link is working")
    public void validatePageLink(Actor actor)
    {
        when(actor).attemptsTo(
            NavigateTo.theUrl("https://www.visma.lt/kontaktai/"),
            WaitUntil.the(BannerButton.WITH_ID.of(ACCEPT_ALL_COOKIES), isVisible()),
            ClickBannerButton.withId(ACCEPT_ALL_COOKIES)
        );
        then(actor).should(
            seeThat(TheWebPageLanguage.isVisible("lt"))
        );
    }

    @When("{actor} validates DOM does not have an element Test")
    public void validateElementIsNotWithinDom(Actor actor)
    {
        then(actor).should(
            seeThat(Visibility.of(TEST_IN_DOM).asBoolean(), is(false))
        );
    }
}
