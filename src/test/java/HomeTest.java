import fr.javafreelance.fluentlenium.core.annotation.Page;
import fr.javafreelance.fluentlenium.core.test.FluentTest;
import org.junit.Test;
import page.HomePage;

import static org.fest.assertions.fluentlenium.FluentLeniumAssertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: rigabertm
 * Date: 11/20/11
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class HomeTest extends FluentTest{

    @Page
    HomePage homePage;

    @Test
    public void check_home_page() {
        goTo(homePage);
        assertThat(homePage).isAt();
    }


}
