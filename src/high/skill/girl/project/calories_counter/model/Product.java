package high.skill.girl.project.calories_counter.model;

public class Product {

    private double ccal;
    private double protein;
    private double lipid;
    private double carbohydrates;
    private double weight;
    private Portion portionInfo;

    public Product() {

    }

    public Product(double ccal, double protein, double lipid, double carbohydrates, double weight, Portion portionInfo) {
        this.ccal = ccal;
        this.protein = protein;
        this.lipid = lipid;
        this.carbohydrates = carbohydrates;
        this.weight
                 = weight;
        this.portionInfo = portionInfo;
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

    public Portion getPortionInfo() {
        return portionInfo;
    }

    public void setPortionInfo(Portion portionInfo) {
        this.portionInfo = portionInfo;
    }
}
