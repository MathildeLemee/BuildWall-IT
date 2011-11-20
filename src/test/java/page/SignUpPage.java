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
public class SignUpPage extends FluentPage {

    @Override
    public String getUrl() {
        return "http://buildwall.com/#!/signup";
    }

    @Override
    public void isAt() {
        assertThat(title()).isEqualTo("Buildwall");
        assertThat(find("h1").getTexts()).containsOnly("Signup");
    }

   public void submitForm(){
       click("#create-button");
   }
}
