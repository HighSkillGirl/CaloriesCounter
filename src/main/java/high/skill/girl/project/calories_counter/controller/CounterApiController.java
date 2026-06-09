package high.skill.girl.project.calories_counter.controller;

import high.skill.girl.project.calories_counter.dto.PageOfProductsDto;
import high.skill.girl.project.calories_counter.dto.ProductDto;
import high.skill.girl.project.calories_counter.service.CounterService;
import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.annotation.*;
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

    @Get("/getAllWithPagination")
    public PageOfProductsDto getAllProductsWithPagination(@QueryValue(defaultValue = "10") int limit,
                                                          @QueryValue(defaultValue = "0") int offset) {
        return service.getAllProductsWithPagination(limit, offset);
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
