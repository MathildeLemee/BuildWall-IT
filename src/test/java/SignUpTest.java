import fr.javafreelance.fluentlenium.core.annotation.Page;
import fr.javafreelance.fluentlenium.core.test.FluentTest;
import org.junit.Test;
import page.PricingPage;
import page.SignUpPage;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.fluentlenium.FluentLeniumAssertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: rigabertm
 * Date: 11/20/11
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class SignUpTest extends FluentTest {

    @Page
    PricingPage pricingPage;
    @Page
    SignUpPage signUpPage;

    @Test
    public void check_signup_page() {
        goTo(signUpPage);
        assertThat(signUpPage).isAt();
    }

    @Test
    public void fill_empty_forms() {
        goTo(signUpPage);
        signUpPage.submitForm();
        assertThat(find("label.error")).hasSize(8).onProperty("text").containsOnly("This field is required.");
    }

       @Test
    public void fill_filled_forms_without_check_box() {
        goTo(signUpPage);
        fill("input:not([type='checkbox'])").with("tototo");
        signUpPage.submitForm();
        assertThat(find("label.error")).hasSize(2).onProperty("text").contains("Please enter a valid email address.");
    }


}
