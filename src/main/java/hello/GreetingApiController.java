package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingApiController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/api/greeting")
    public GreetingDto greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new GreetingDto(counter.incrementAndGet(),
                String.format(template, name));
    }
}