package high.skill.girl.project.calories_counter.controller;

import high.skill.girl.project.calories_counter.dto.ProductDto;
import high.skill.girl.project.calories_counter.service.CounterService;
import io.micronaut.context.annotation.Parameter;
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

    @Get("/get")
    public ProductDto getProductByName(@Parameter String name) {
        return service.getProductByName(name);
    }

    @Get("/getAll")
    public List<ProductDto> getAllProducts() {
        return service.getAllProducts();
    }

    @Post("/add")
    public void addNewProduct(@Body ProductDto dto) {
        service.addNewProduct(dto);
    }

    @Post("/addList")
    public void addNewProductList(@Body List<ProductDto> dtoList) {
        service.addNewProductList(dtoList);
    }
}
