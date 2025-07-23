package high.skill.girl.project.calories_counter.model;

public class NutritionalValue { // 100g value

    private double ccal;
    private double protein;
    private double lipid;
    private double carbohydrates;

    public NutritionalValue(double ccal, double protein, double lipid, double carbohydrates) {
        this.ccal = ccal;
        this.protein = protein;
        this.lipid = lipid;
        this.carbohydrates = carbohydrates;
    }

    public double getCcal() {
        return ccal;
    }

    public void setCcal(double ccal) {
        this.ccal = ccal;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getLipid() {
        return lipid;
    }

    public void setLipid(double lipid) {
        this.lipid = lipid;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
}
