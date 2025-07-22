package high.skill.girl.project.calories_counter.main;

import high.skill.girl.project.calories_counter.model.Portion;
import high.skill.girl.project.calories_counter.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaloriesCounterMainApplication {
    public static void main(String[] args) {

        List<Product> meal = new ArrayList<>();
        meal.add(new Product(101, 18, 1.8, 3.3, new Portion(110)));
        meal.add(new Product(625, 26, 52, 13, new Portion(20)));

        meal.forEach(product -> {
            double portionWeight = product.getPortionInfo().getWeight();
            Portion portion = new Portion(portionWeight);
            portion.setCcal((int) countPortionNutrients(product.getCcal(), portionWeight));
            portion.setProtein(countPortionNutrients(product.getProtein(), portionWeight));
            portion.setLipid(countPortionNutrients(product.getLipid(), portionWeight));
            portion.setCarbohydrates(countPortionNutrients(product.getCarbohydrates(), , portionWeight));
            product.setPortionInfo(portion);

            System.out.println("Творог с арахисовой пастой на 100 грамм:");
            double platCcal = (spoonCcal + spoonCcal2) * 100 / 170; // вместо 170 вес итогового блюда или кастрюли

            double platProtein = (spoonProtein + spoonProtein2) * 100 / 170;
            double platFats = (spoonFats + spoonFats2) * 100 / 170;
            double platCarbohydrates = (spoonCarbohydrates + spoonCarbohydrates2) * 100 / 170;
            System.out.println(platCcal);
            System.out.println(platProtein);
            System.out.println(platFats);
            System.out.println(platCarbohydrates);
        });

        meal.forEach(product -> {
            Product result = new Product();
            result.setCcal();
        });

//        // per 100g
//        double ccal = 625;
//
//        double protein = 26;
//        double fats = 52;
//        double carbohydrates = 13;
//
//        // my food weight
//        int spoonWeight = 20;
//
//        double spoonCcal = ccal / 100 * spoonWeight;
//
//        double spoonProtein = protein / 100 * spoonWeight;
//        double spoonFats = fats / 100 * spoonWeight;
//        double spoonCarbohydrates = carbohydrates / 100 * spoonWeight;
//
//        System.out.printf("Calories in %dg: ccal - %2$.1f, protein - %3$.1f, fats - %4$.1f, carbohydrates - %5$.1f\n",
//                spoonWeight, spoonCcal, spoonProtein, spoonFats, spoonCarbohydrates);
//
//        // ------
//        double ccal2 = 101;
//        double protein2 = 18;
//        double fats2 = 1.8;
//        double carbohydrates2 = 3.3;
//
//        // my food weight 2
//        int spoonWeight2 = 150;
//
//        double spoonCcal2 = ccal2 / 100 * spoonWeight2;
//
//        double spoonProtein2 = protein2 / 100 * spoonWeight2;
//        double spoonFats2 = fats2 / 100 * spoonWeight2;
//        double spoonCarbohydrates2 = carbohydrates2 / 100 * spoonWeight2;
//
//        System.out.printf("Calories in %dg: ccal - %2$.1f, protein - %3$.1f, fats - %4$.1f, carbohydrates - %5$.1f\n",
//                spoonWeight2, spoonCcal2, spoonProtein2, spoonFats2, spoonCarbohydrates2);


        System.out.println("Итого в 170 граммах");
        System.out.println(spoonCcal + spoonCcal2);
        System.out.println(spoonProtein + spoonProtein2);
        System.out.println(spoonFats + spoonFats2);
        System.out.println(spoonCarbohydrates + spoonCarbohydrates2);



        System.out.println("I ate 85g:");
        System.out.println(platCcal / 100 * 85);
        System.out.println(platProtein / 100 * 85);
        System.out.println(platFats / 100 * 85);
        System.out.println(platCarbohydrates / 100 * 85);

    }

    private static double countPortionNutrients(double productNutrient, double portionWeight) {
        return productNutrient / 100 * portionWeight;
    }

    private static double countDishNutrients(int generalMealWeight, double... nutrients) {
        return Arrays.stream(nutrients).sum() * 100 / generalMealWeight;
    }
}
