import java.util.HashMap;
import java.util.Map;

public class PetFoodRecommendationSystem {

    private static Map<String, Map<String, String>> petFoodRecommendations = new HashMap<>();

    static {
        // Initialize sample recommendations
        Map<String, String> dogRecommendations = new HashMap<>();
        dogRecommendations.put("Labrador", "Premium Dog Food A");
        dogRecommendations.put("German Shepherd", "Premium Dog Food B");
        dogRecommendations.put("Golden Retriever", "Premium Dog Food C");

        Map<String, String> catRecommendations = new HashMap<>();
        catRecommendations.put("Persian", "Premium Cat Food X");
        catRecommendations.put("Siamese", "Premium Cat Food Y");
        catRecommendations.put("Maine Coon", "Premium Cat Food Z");

        petFoodRecommendations.put("dog", dogRecommendations);
        petFoodRecommendations.put("cat", catRecommendations);
    }

    public static String getRecommendation(String petType, String petBreed) {
        Map<String, String> breedRecommendations = petFoodRecommendations.get(petType.toLowerCase());

        if (breedRecommendations != null && breedRecommendations.containsKey(petBreed)) {
            return breedRecommendations.get(petBreed);
        } else {
            return "No recommendation found for the given pet type and breed.";
        }
    }

    public static void main(String[] args) {
        // Example of using the recommendation system
        String petType = "dog";
        String petBreed = "Labrador";

        String recommendation = getRecommendation(petType, petBreed);
        System.out.println("Recommended food for " + petBreed + " " + petType + ": " + recommendation);
    }
}
