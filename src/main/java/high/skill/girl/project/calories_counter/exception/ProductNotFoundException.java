package high.skill.girl.project.calories_counter.exception;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;

public class ProductNotFoundException extends HttpStatusException {

    public ProductNotFoundException(String name) {
        super(HttpStatus.valueOf(404), String.format("Product '%s' not found in db", name));
    }
}
