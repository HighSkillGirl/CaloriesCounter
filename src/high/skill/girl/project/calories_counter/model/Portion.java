package high.skill.girl.project.calories_counter.model;

public class Portion {

    private double ccal;
    private double protein;
    private double lipid;
    private double carbohydrates;
    private double weight;

    public Portion(double weight) {
        this.ccal = 0;
        this.protein = 0;
        this.lipid = 0;
        this.carbohydrates = 0;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
