package high.skill.girl.project.calories_counter.model;

import java.util.ArrayList;
import java.util.List;

public class Dish extends NutritionalValue {

    private List<Product> products = new ArrayList<>();
    private double cookedWeight;

    public Dish() {
        super(0,0,0,0);
    }

    public Dish(double ccal, double protein, double lipid, double carbohydrates, List<Product> products, double cookedWeight) {
        super(ccal, protein, lipid, carbohydrates);
        this.products = products;
        this.cookedWeight = cookedWeight;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getCookedWeight() {
        return cookedWeight;
    }

    public void setCookedWeight(double cookedWeight) {
        this.cookedWeight = cookedWeight;
    }
}
