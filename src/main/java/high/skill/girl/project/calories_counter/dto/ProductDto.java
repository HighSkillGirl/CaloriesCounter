package high.skill.girl.project.calories_counter.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.math.BigDecimal;

@Serdeable
public record ProductDto(String name,
                         int calories,
                         BigDecimal proteins,
                         BigDecimal fats,
                         BigDecimal carbohydrates) { }
