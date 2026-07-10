package high.skill.girl.project.calories_counter.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record CountingRequestDto(String productName,
                                    int productWeight) {
}
