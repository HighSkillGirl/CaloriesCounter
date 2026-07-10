package high.skill.girl.project.calories_counter.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record ProductDto(String name,
                         int calories,
                         float proteins,
                         float fats,
                         float carbohydrates) { }
