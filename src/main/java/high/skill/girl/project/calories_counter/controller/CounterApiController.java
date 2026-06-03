package high.skill.girl.project.calories_counter.controller;

import high.skill.girl.project.calories_counter.dto.ProductDto;
import high.skill.girl.project.calories_counter.service.CounterService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

import java.util.List;

@Controller
public class CounterApiController {

    @Inject
    private CounterService service;

    @Get("/getAll")
    public List<ProductDto> getAllProducts() {
        return service.getAllProducts();
    }

    @Post("/addNew")
    public void addNewProduct(@Body ProductDto dto) {
        service.addNewProduct(dto);
    }

    @Post("/addNewList")
    public void addNewProductList(@Body List<ProductDto> dtoList) {
        service.addNewProductList(dtoList);
    }
}
