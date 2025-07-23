package high.skill.girl.project.calories_counter.main;

import high.skill.girl.project.calories_counter.model.Dish;
import high.skill.girl.project.calories_counter.model.Product;

public class CaloriesCounterMainApplication {
    public static void main(String[] args) {

        Dish sirniki = new Dish();
        sirniki.setCookedWeight(270);
        sirniki.getProducts().add(new Product(101, 18, 1.8, 3.3, 200));
        sirniki.getProducts().add(new Product(328, 16.2, 28.8, 1.02, 23));
        sirniki.getProducts().add(new Product(300, 3.2, 0, 75.9, 30));
        sirniki.getProducts().add(new Product(363, 14.3, 1.65, 72.8, 45));

        // пропорции
        double portionCcal = 0;
        double portionProtein = 0;
        double portionLipid = 0;
        double portionCarbohydrates = 0;

        for (int i = 0; i < sirniki.getProducts().size(); i++) {
            var product = sirniki.getProducts().get(i);
            portionCcal += countNutritionalValueInAddedWeight(product.getCcal(), product.getAddedWeight());
            portionProtein += countNutritionalValueInAddedWeight(product.getProtein(), product.getAddedWeight());
            portionLipid += countNutritionalValueInAddedWeight(product.getLipid(), product.getAddedWeight());
            portionCarbohydrates += countNutritionalValueInAddedWeight(product.getCarbohydrates(), product.getAddedWeight());
        }

        sirniki.setCcal(countDishNutritionalValue(portionCcal, sirniki.getCookedWeight()));
        sirniki.setProtein(countDishNutritionalValue(portionProtein, sirniki.getCookedWeight()));
        sirniki.setLipid(countDishNutritionalValue(portionLipid, sirniki.getCookedWeight()));
        sirniki.setCarbohydrates(countDishNutritionalValue(portionCarbohydrates, sirniki.getCookedWeight()));

        System.out.println("100g: ");
        System.out.println(sirniki.getCcal());
        System.out.println(sirniki.getProtein());
        System.out.println(sirniki.getLipid());
        System.out.println(sirniki.getCarbohydrates());

        System.out.println("I ate:");
        System.out.println(countNutritionalValueInAddedWeight(sirniki.getCcal(), 150));
        System.out.println(countNutritionalValueInAddedWeight(sirniki.getProtein(), 150));
        System.out.println(countNutritionalValueInAddedWeight(sirniki.getLipid(), 150));
        System.out.println(countNutritionalValueInAddedWeight(sirniki.getCarbohydrates(), 150));
    }

    private static double countNutritionalValueInAddedWeight(double nutritionalValue, double addedWeight) {
        return nutritionalValue / 100 * addedWeight;
    }

    private static double countDishNutritionalValue(double nutritionalValue, double cookedWeight) {
        return nutritionalValue * 100 / cookedWeight;
    }
}
