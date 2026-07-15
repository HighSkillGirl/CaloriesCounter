package high.skill.girl.project.calories_counter.service;

import high.skill.girl.project.calories_counter.dto.CountingRequestDto;
import high.skill.girl.project.calories_counter.dto.CountingResponseDto;
import high.skill.girl.project.calories_counter.repository.SearchRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

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
}
