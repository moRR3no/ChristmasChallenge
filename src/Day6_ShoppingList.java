import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Day6_ShoppingList {
    /**
     * Mikolaj postanowil przygotować w tym roku potrawy swiateczne samodzielnie.
     * Dostał od mamy listę przepisów, dzieki którym stworzy pyszne, tradycyjne potrawy!
     * Ale najpierw musi pójść na zakupy. Pomoż Mikołajowi i wygeneruj listę zakupów z listy przepisów.
     * Dla ułatwienia załóż, że wszystkie produkty są w tych samych jednostkach, wiec po prostu podlicz ilości.
     * P.S. Nie polecam używać tych przepisów, zostały one maksymalnie uproszone do celu zadania. :D
     */
    public static void main(String[] args) {
        Map<String, Integer> endShoppingListWithAmounts = new HashMap<>();

        int tempValue;
        for (Recipe recipe : prepareRecipes()) {
            for (Map.Entry<String, Integer> entry : getIngredientsFromRecipe(recipe).entrySet()) {
                if (!endShoppingListWithAmounts.containsKey(entry.getKey())) {
                    endShoppingListWithAmounts.put(entry.getKey(), entry.getValue());
                } else {
                    tempValue = entry.getValue() + endShoppingListWithAmounts.get(entry.getKey());
                    endShoppingListWithAmounts.replace(entry.getKey(), tempValue);
                }
            }
        }
        int count = 1;
        for (Map.Entry<String, Integer> entry : endShoppingListWithAmounts.entrySet()) {
            System.out.println(count + ". " + entry.getKey() + ": " + entry.getValue() + " pieces/grams");
            count++;
        }

    }

    private static List<Recipe> prepareRecipes() {
        return List.of(
                new Recipe(
                        "Murzynek",
                        Map.of(
                                "Maka", 300,
                                "Cukier", 100,
                                "Jajka", 3,
                                "Czekolada", 200,
                                "Maslo", 200
                        ),
                        "Piekarnik nagrzać do temp. 160 stopni [...]"),
                new Recipe(
                        "Piernik",
                        Map.of(
                                "Maka", 500,
                                "Cukier", 180,
                                "Miod", 250,
                                "Jajka", 1,
                                "Mleko", 80,
                                "Maslo", 150
                        ),
                        "Piekarnik nagrzać do temp. 180 stopni [...]"),
                new Recipe(
                        "Sernik",
                        Map.of(
                                "Maka", 100,
                                "Cukier", 200,
                                "Jajka", 6,
                                "Ser", 1000,
                                "Maslo", 200
                        ),
                        "Piekarnik nagrzać do temp. 160 stopni [...]"),
                new Recipe(
                        "Uszka",
                        Map.of(
                                "Maka", 300,
                                "Woda", 100,
                                "Jajka", 1,
                                "Sol", 1,
                                "Maslo", 200,
                                "Grzyby", 150,
                                "Cebula", 1
                        ),
                        "Zarobić ciasto z mąki, wody, soli i jajka [...]"),
                new Recipe(
                        "Barszcz",
                        Map.of(
                                "Buraki", 1000,
                                "Bulion", 1500,
                                "Zakwas", 200,
                                "Sol", 1
                        ),
                        "Buraki rozdrobnić i zagotować z bulionem [...]"),
                new Recipe(
                        "Pierogi",
                        Map.of(
                                "Maka", 300,
                                "Woda", 100,
                                "Jajka", 1,
                                "Kapusta", 500,
                                "Grzyby", 50,
                                "Cebula", 1
                        ),
                        "Zarobić ciasto z mąki, wody, soli i jajka [...]"),
                new Recipe(
                        "Karp",
                        Map.of(
                                "Karp", 1000,
                                "Maka", 50,
                                "Mleko", 500,
                                "Sol", 1,
                                "Olej", 500
                        ),
                        "Rybę umyć i pokroić w dzwonki [...]")
        );
    }


    private static Map<String, Integer> getIngredientsFromRecipe(Recipe recipe) {
        return recipe.getIngredients();
    }


}

class Recipe {
    String dishName;
    Map<String, Integer> ingredients;
    String recipe;

    public Recipe(String dishName, Map<String, Integer> ingredients, String recipe) {
        this.dishName = dishName;
        this.ingredients = ingredients;
        this.recipe = recipe;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }
}
