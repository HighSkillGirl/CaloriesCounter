package high.skill.girl.project.calories_counter.service;

import high.skill.girl.project.calories_counter.dto.ProductDto;
import high.skill.girl.project.calories_counter.mapper.ProductsMapper;
import high.skill.girl.project.calories_counter.repository.SearchRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class SearchService {

    @Inject
    private SearchRepository repository;
    @Inject
    private ProductsMapper mapper;

    public ProductDto getProductByName(String name) {
        var entity = repository.searchByNameWords(name);
        return mapper.toProductDto(entity);
    }
}
