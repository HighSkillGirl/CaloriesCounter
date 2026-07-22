package high.skill.girl.project.calories_counter.service;

import high.skill.girl.project.calories_counter.dto.CountingRequestDto;
import high.skill.girl.project.calories_counter.dto.CountingResponseDto;
import high.skill.girl.project.calories_counter.repository.SearchRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.math.BigDecimal;
import java.util.List;

@Singleton
public class CounterService {

    @Inject
    private SearchRepository searchRepository;

    public CountingResponseDto count(List<CountingRequestDto> requestInfoList) {
        var response = new CountingResponseDto();

        for (var request : requestInfoList) {
            var entity = searchRepository.searchByNameWords(request.productName());

            double weight = (double) request.productWeight() / 100;
            double calories = entity.calories().doubleValue() * weight;
            double proteins = entity.proteins().doubleValue() * weight;
            double fats = entity.fats().doubleValue() * weight;
            double carbo = entity.carbohydrates().doubleValue() * weight;

            response.addCalories(calories);
            response.addProteins(proteins);
            response.addFats(fats);
            response.addCarbohydrates(carbo);
        }

        return response;
    }

    public CountingResponseDto cookedFoodCount(BigDecimal weightAfterCooking, List<CountingRequestDto> requestInfoList) {
        var summaryData = count(requestInfoList);
        var response = new CountingResponseDto();

        double calories = summaryData.getCalories().doubleValue() * 100 / weightAfterCooking.doubleValue();
        double proteins = summaryData.getProteins().doubleValue() * 100 / weightAfterCooking.doubleValue();
        double fats = summaryData.getFats().doubleValue() * 100 / weightAfterCooking.doubleValue();
        double carbo = summaryData.getCarbohydrates().doubleValue() * 100 / weightAfterCooking.doubleValue();

        response.addCalories(calories);
        response.addProteins(proteins);
        response.addFats(fats);
        response.addCarbohydrates(carbo);

        return response;
    }
}
