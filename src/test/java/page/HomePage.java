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
public class HomePage extends FluentPage {

    @Override
    public String getUrl() {
        return "http://www.buildwall.com";
    }

    @Override
    public void isAt() {
        assertThat(title()).isEqualTo("Buildwall");
        assertThat(find("h1").getTexts()).containsOnly("BuildWall");
    }

    public String idSignUp() {
        return "buildwall-link-signup";
    }


}
