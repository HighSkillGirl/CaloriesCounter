package high.skill.girl.project.calories_counter.mapper;

import high.skill.girl.project.calories_counter.dto.ProductDto;
import high.skill.girl.project.calories_counter.entity.ProductEntity;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-06-03T14:10:03+0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 25.0.3 (Oracle Corporation)"
)
@Singleton
@Named
public class ProductsMapperImpl implements ProductsMapper {

    @Override
    public ProductDto toProductDto(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        String name = null;
        float proteins = 0.0f;
        float fats = 0.0f;
        float carbohydrates = 0.0f;
        float calories = 0.0f;

        name = entity.name();
        if ( entity.proteins() != null ) {
            proteins = entity.proteins().floatValue();
        }
        if ( entity.fats() != null ) {
            fats = entity.fats().floatValue();
        }
        if ( entity.carbohydrates() != null ) {
            carbohydrates = entity.carbohydrates().floatValue();
        }
        if ( entity.calories() != null ) {
            calories = entity.calories().floatValue();
        }

        ProductDto productDto = new ProductDto( name, proteins, fats, carbohydrates, calories );

        return productDto;
    }

    @Override
    public ProductEntity toProductEntity(ProductDto dto) {
        if ( dto == null ) {
            return null;
        }

        BigDecimal proteins = null;
        BigDecimal fats = null;
        BigDecimal carbohydrates = null;
        BigDecimal calories = null;
        String name = null;

        proteins = BigDecimal.valueOf( dto.proteins() );
        fats = BigDecimal.valueOf( dto.fats() );
        carbohydrates = BigDecimal.valueOf( dto.carbohydrates() );
        calories = BigDecimal.valueOf( dto.calories() );
        name = dto.name();

        Integer id = null;

        ProductEntity productEntity = new ProductEntity( id, proteins, fats, carbohydrates, calories, name );

        return productEntity;
    }
}
