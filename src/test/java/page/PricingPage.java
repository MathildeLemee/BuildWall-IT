package page;

import fr.javafreelance.fluentlenium.core.FluentPage;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: rigabertm
 * Date: 11/20/11
 * Time: 9:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class PricingPage extends FluentPage {

    @Override
    public String getUrl() {
        return "http://buildwall.com/#!/pricing";
    }

    @Override
    public void isAt() {
        assertThat(title()).isEqualTo("Buildwall");
        assertThat(find("h1").getTexts()).containsOnly("Plans & Pricing");
    }

    public void goToSignUp() {
         click(".buttons td a");
    }
}
