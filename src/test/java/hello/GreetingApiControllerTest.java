package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GreetingApiControllerTest {

    @Test
    public void tryApi() {

        GreetingApiController controller = new GreetingApiController();
        assertThat(controller.greeting("Aaron").getContent(), is("Hello, Aaron!"));


    }


}
