package high.skill.girl.project.calories_counter.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class ServiceApiController {

    @Get("/test")
    public String test() {
        System.out.println("good!");
        return "Good";
    }
}
