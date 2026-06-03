package high.skill.girl.project.calories_counter.mapper;

import high.skill.girl.project.calories_counter.dto.ProductDto;
import high.skill.girl.project.calories_counter.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jsr330")
public interface ProductsMapper {

    ProductDto toProductDto(ProductEntity entity);

    ProductEntity toProductEntity(ProductDto dto);
}
