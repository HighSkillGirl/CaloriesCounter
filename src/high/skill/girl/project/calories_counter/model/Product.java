package high.skill.girl.project.calories_counter.model;

public class Product extends NutritionalValue {

    private double addedWeight; // how many added

    public Product(double ccal, double protein, double lipid, double carbohydrates, double addedWeight) {
        super(ccal, protein, lipid, carbohydrates);
        this.addedWeight = addedWeight;
    }

    public double getAddedWeight() {
        return addedWeight;
    }

    public void setAddedWeight(double addedWeight) {
        this.addedWeight = addedWeight;
    }
}
