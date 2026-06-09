package high.skill.girl.project.calories_counter.service;

import high.skill.girl.project.calories_counter.dto.PageOfProductsDto;
import high.skill.girl.project.calories_counter.dto.ProductDto;
import high.skill.girl.project.calories_counter.entity.ProductEntity;
import high.skill.girl.project.calories_counter.exception.ProductNotFoundException;
import high.skill.girl.project.calories_counter.mapper.ProductsMapper;
import high.skill.girl.project.calories_counter.repository.ProductsRepository;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
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
        return mapAndCollectEntityList(repository.findAll());
    }

    public PageOfProductsDto getAllProductsWithPagination(int limit, int offset) {
        Page<ProductEntity> page = repository.findAll(Pageable.from(offset, limit));
        return new PageOfProductsDto(limit, offset, mapAndCollectEntityList(page.getContent()));
    }

    private List<ProductDto> mapAndCollectEntityList(List<ProductEntity> entities) {
        return entities.stream().map(e -> mapper.toProductDto(e)).toList();
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
