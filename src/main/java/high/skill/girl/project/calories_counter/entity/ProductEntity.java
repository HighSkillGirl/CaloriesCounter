package high.skill.girl.project.calories_counter.entity;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

import java.math.BigDecimal;

@MappedEntity("products")
public record ProductEntity(
        @Id
        @GeneratedValue
        Integer id,
        BigDecimal proteins,
        BigDecimal fats,
        BigDecimal carbohydrates,
        BigDecimal calories,
        String name
) {}