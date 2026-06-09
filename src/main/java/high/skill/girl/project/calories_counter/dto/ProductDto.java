package high.skill.girl.project.calories_counter.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record ProductDto(String name,
                         float proteins,
                         float fats,
                         float carbohydrates,
                         float calories) { }
