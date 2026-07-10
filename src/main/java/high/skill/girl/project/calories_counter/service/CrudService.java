package high.skill.girl.project.calories_counter.service;

import high.skill.girl.project.calories_counter.dto.ProductDto;
import high.skill.girl.project.calories_counter.dto.ProductDtoPage;
import high.skill.girl.project.calories_counter.entity.ProductEntity;
import high.skill.girl.project.calories_counter.mapper.ProductsMapper;
import high.skill.girl.project.calories_counter.repository.ProductsRepository;
import io.micronaut.data.model.Page;
import io.micronaut.data.model.Pageable;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class CrudService {

    @Inject
    private ProductsRepository repository;
    @Inject
    private ProductsMapper mapper;

    public void addNewProduct(ProductDto dto) {
        var entity = mapper.toProductEntity(dto);
        repository.save(entity);
    }

    public void addNewProductList(List<ProductDto> dtoList) {
        for (ProductDto dto : dtoList) {
            addNewProduct(dto);
        }
    }

    public List<ProductDto> getAllProducts() {
        return mapAndCollectEntityList(repository.findAll());
    }

    public ProductDtoPage getAllProductsWithPagination(int limit, int offset) {
        Page<ProductEntity> page = repository.findAll(Pageable.from(offset, limit));
        return new ProductDtoPage(limit, offset, mapAndCollectEntityList(page.getContent()));
    }

    public List<ProductDto> getProductByName(String name) {
        var entities = getProductListEntityFromRepo(name);
        return mapAndCollectEntityList(entities);
    }

    public ProductDto updateProductByName(String name, ProductDto forUpdate) {
        var entity = getProductListEntityFromRepo(name).getFirst();
        repository.delete(entity);
        repository.save(mapper.toProductEntity(forUpdate));
        return mapper.toProductDto(repository.findByNameContainsIgnoreCase(forUpdate.name()).getFirst());
    }

    public List<ProductEntity> getProductListEntityFromRepo(String name) {
        return repository.findByNameContainsIgnoreCase(name);
    }

    public List<ProductDto> mapAndCollectEntityList(List<ProductEntity> entities) {
        return entities.stream().map(e -> mapper.toProductDto(e)).toList();
    }
}
