package high.skill.girl.project.calories_counter.controller;

import high.skill.girl.project.calories_counter.dto.ProductDto;
import high.skill.girl.project.calories_counter.dto.ProductDtoPage;
import high.skill.girl.project.calories_counter.service.CrudService;
import high.skill.girl.project.calories_counter.service.SearchService;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller
public class CrudApiController {

    @Inject
    private CrudService service;
    @Inject
    private SearchService searchService;

    @Post("/add")
    public void addNewProduct(@Body ProductDto dto) {
        service.addNewProduct(dto);
    }

    @Post("/addList")
    public void addNewProductList(@Body List<ProductDto> dtoList) {
        service.addNewProductList(dtoList);
    }

    @Get("/get")
    public ProductDto getProductByName(@QueryValue String name) {
        return searchService.getProductByName(name);
    }

    @Get("/getList")
    public List<ProductDto> getListOfProductsByName(@QueryValue String name) {
        return service.getListOfProductsByName(name);
    }

    @Get("/getAll")
    public List<ProductDto> getAllProducts() {
        return service.getAllProducts();
    }

    @Get("/getAllWithPagination")
    public ProductDtoPage getAllProductsWithPagination(@QueryValue(defaultValue = "10") int limit,
                                                       @QueryValue(defaultValue = "0") int offset) {
        return service.getAllProductsWithPagination(limit, offset);
    }

    @Post("/update")
    public ProductDto updateProductByName(@QueryValue String name, @Body ProductDto forUpdate) {
        return service.updateProductByName(name, forUpdate);
    }


}
