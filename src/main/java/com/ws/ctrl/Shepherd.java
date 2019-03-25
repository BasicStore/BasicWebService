package com.ws.ctrl;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ws.dm.Sheep;


@RestController
public class Shepherd {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // localhost:8081/greeting?name=blar
    @RequestMapping("/greeting")
    public Sheep greeting(@RequestParam(value="name", defaultValue="Blart") String name) {
    	System.out.println("About to breed sheep................");
    	Sheep sheep = new Sheep(counter.incrementAndGet(),
                            String.format(template, name));
        sheep.eatGrass();
        return sheep;
    }
	
	
}
