import java.util.HashMap;
import java.util.Map;

/**
 * Mama przesłała Mikołajowi przepisy na ciasta. Blacha mamy Mikołaja jest prostokątna i ma wymiary 20cm x 30cm.
 * Mikołaj ma blachę okrągłą o średnicy 9.8 cm.
 * Pomóż Mikołajowi przeliczyć składniki przepisu na jego blaszkę.
 * Przygotuj funkcję, która będzie przyjmować 2 wymiary blaszki prostokątnej oraz średnicę okrąglej
 * i dla podanej listy składników dla prostokątnej przeliczy ich ilość dla okrągłej.
 * Dla uproszczenia nie przejmuj się jednostkami i załóż, że formy mają taką samą wysokość.
 */

public class Day15_RecalculateIngredients {
    public static void main(String[] args) {
        Map<String, Integer> ingredientsForRectangleForm = Map.of(
                "Maka", 300,
                "Cukier", 100,
                "Jajka", 4,
                "Czekolada", 200,
                "Maslo", 200
        );

        Map <String, Double> ingredientsForCircleForm = new HashMap<>();
        for (Map.Entry<String, Integer> entry : ingredientsForRectangleForm.entrySet()) {
            double calculatedWeightToCircleForm = entry.getValue() *
                    conversionFactor(20, 30, 9.8);
            ingredientsForCircleForm.put(entry.getKey(), calculatedWeightToCircleForm);
        }

        int i = 1;
        System.out.println("Cake ingredients for circle form:");
        for (Map.Entry<String, Double> entry : ingredientsForCircleForm.entrySet()) {
            if (i==ingredientsForCircleForm.size()){
                System.out.println(i + ". " + entry.getKey() + " - " +  Math.round(entry.getValue()) + "g.");
                break;
            }
            if (entry.getKey().equals("Jajka")){
                System.out.println(i + ". " + entry.getKey() + " - " +  Math.round(entry.getValue()) + "pcs,");
                i++;
                continue;
            }
            System.out.println(i + ". " + entry.getKey() + " - " + Math.round(entry.getValue()) + "g,");
            i++;
        }
    }
    private static double conversionFactor (int rectangleX, int rectangleY, double diameter) {
        double rectangleField = rectangleX*rectangleY;
        double circleField = Math.PI * Math.pow(diameter/2,2);
        return circleField/rectangleField;
    }
}
