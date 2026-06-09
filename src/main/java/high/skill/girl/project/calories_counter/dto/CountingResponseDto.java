package high.skill.girl.project.calories_counter.dto;

import io.micronaut.serde.annotation.Serdeable;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Serdeable
public class CountingResponseDto {

    private BigDecimal calories;
    private BigDecimal proteins;
    private BigDecimal fats;
    private BigDecimal carbohydrates;

    public CountingResponseDto() {
        this.calories = new BigDecimal(0);
        this.proteins = new BigDecimal(0);
        this.fats = new BigDecimal(0);
        this.carbohydrates = new BigDecimal(0);
    }

    public void addCalories(double calories) {
        this.calories = this.calories.add(new BigDecimal(calories).setScale(0, RoundingMode.HALF_UP));
    }

    public void addProteins(double proteins) {
        this.proteins = this.proteins.add(round(proteins));
    }

    public void addFats(double fats) {
        this.fats = this.fats.add(round(fats));
    }

    public void addCarbohydrates(double carbohydrates) {
        this.carbohydrates = this.carbohydrates.add(round(carbohydrates));
    }

    private BigDecimal round(double value) {
        return new BigDecimal(value).setScale(1, RoundingMode.HALF_UP);
    }

    public BigDecimal getCalories() {
        return calories;
    }

    public BigDecimal getProteins() {
        return proteins;
    }

    public BigDecimal getFats() {
        return fats;
    }

    public BigDecimal getCarbohydrates() {
        return carbohydrates;
    }
}
