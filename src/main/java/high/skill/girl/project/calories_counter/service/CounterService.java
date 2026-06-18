package high.skill.girl.project.calories_counter.service;

import high.skill.girl.project.calories_counter.dto.CountingRequestDto;
import high.skill.girl.project.calories_counter.dto.CountingResponseDto;
import high.skill.girl.project.calories_counter.dto.ProductDto;
import high.skill.girl.project.calories_counter.dto.ProductDtoPage;
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

    public ProductDtoPage getAllProductsWithPagination(int limit, int offset) {
        Page<ProductEntity> page = repository.findAll(Pageable.from(offset, limit));
        return new ProductDtoPage(limit, offset, mapAndCollectEntityList(page.getContent()));
    }

    public List<ProductDto> getProductByName(String name) {
        var entities = getProductListEntityFromRepo(name);
        return mapAndCollectEntityList(entities);
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

    public CountingResponseDto count(List<CountingRequestDto> requestInfoList) {
        var response = new CountingResponseDto();
        for (var request : requestInfoList) {

            var entities = getProductListEntityFromRepo(request.productName());
            if (entities.isEmpty())
                throw new ProductNotFoundException(request.productName());

            ProductEntity entity = entities.getFirst();


            double weight = (double) request.productWeight() / 100;
            double calories = entity.calories().doubleValue() * weight;
            double proteins = entity.proteins().doubleValue() * weight;
            double fats = entity.fats().doubleValue() * weight;
            double carbo = entity.carbohydrates().doubleValue() * weight;

            response.addCalories(calories);
            response.addProteins(proteins);
            response.addFats(fats);
            response.addCarbohydrates(carbo);
        }

        return response;
    }

    private List<ProductEntity> getProductListEntityFromRepo(String name) {
        return repository.findByNameContainsIgnoreCase(name);
    }

    private List<ProductDto> mapAndCollectEntityList(List<ProductEntity> entities) {
        return entities.stream().map(e -> mapper.toProductDto(e)).toList();
    }
}
