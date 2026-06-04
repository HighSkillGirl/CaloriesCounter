package high.skill.girl.project.calories_counter.service;

import high.skill.girl.project.calories_counter.dto.ProductDto;
import high.skill.girl.project.calories_counter.exception.ProductNotFoundException;
import high.skill.girl.project.calories_counter.mapper.ProductsMapper;
import high.skill.girl.project.calories_counter.repository.ProductsRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class CounterService {

    @Inject
    private ProductsRepository repository;
    @Inject
    private ProductsMapper mapper;

    public List<ProductDto> getAllProducts() {
        return repository.findAll().stream().map(e -> mapper.toProductDto(e)).toList();
    }

    public ProductDto getProductByName(String name) {
        var entity = repository.findByNameContains(name).orElseThrow(() -> new ProductNotFoundException(name));
        return mapper.toProductDto(entity);
    }

    public void addNewProduct(ProductDto dto) {
        var entity = mapper.toProductEntity(dto);
        repository.save(entity);
    }

    public void addNewProductList(List<ProductDto> dtoList) {
        for (ProductDto dto : dtoList) {
            addNewProduct(dto);
        }
    }

}
