package high.skill.girl.project.calories_counter.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.util.List;

@Serdeable
public record PageOfProductsDto(int limit,
                                int offset,
                                List<ProductDto> products) { }
