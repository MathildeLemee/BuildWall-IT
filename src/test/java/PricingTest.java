import fr.javafreelance.fluentlenium.core.annotation.Page;
import fr.javafreelance.fluentlenium.core.test.FluentTest;
import org.junit.Test;
import page.PricingPage;
import page.SignUpPage;

import static org.fest.assertions.fluentlenium.FluentLeniumAssertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: rigabertm
 * Date: 11/20/11
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class PricingTest extends FluentTest {

    @Page
    PricingPage pricingPage;
    @Page
    SignUpPage signUpPage;

    @Test
    public void check_pricing_page() {
        goTo(pricingPage);
        assertThat(pricingPage).isAt();
    }

    @Test
    public void go_signup() {
        goTo(pricingPage);
        pricingPage.goToSignUp();
        assertThat(signUpPage).isAt();
    }


}
