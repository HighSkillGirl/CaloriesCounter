package high.skill.girl.project.calories_counter.controller;

import high.skill.girl.project.calories_counter.dto.CountingRequestDto;
import high.skill.girl.project.calories_counter.dto.CountingResponseDto;
import high.skill.girl.project.calories_counter.service.CounterService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.QueryValue;
import jakarta.inject.Inject;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class CounterApiController {

    @Inject
    private CounterService service;

    @Post("/count")
    public CountingResponseDto count(@Body List<CountingRequestDto> requestInfoList) {
        return service.count(requestInfoList);
    }

    @Post("/count/cooked_food")
    public CountingResponseDto cookedFoodCount(@QueryValue BigDecimal weightAfterCooking, @Body List<CountingRequestDto> requestInfoList) {
        return service.cookedFoodCount(weightAfterCooking, requestInfoList);
    }
}
