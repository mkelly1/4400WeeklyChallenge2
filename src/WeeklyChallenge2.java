import java.util.*;

public class WeeklyChallenge2 {
    public static void main(String[] args){
        Random rand = new Random();
        HashMap<String, String> fixins = new HashMap<>();
        fixins.put("meat", "chicken,steak,carnidas,chorizo,sofritas,veggies,none,all");
        fixins.put("rice","brown,white,none,all");
        fixins.put("salsa", "mild,medium,hot,none,all");
        fixins.put("beans","pinto,black,none");
        fixins.put("veggies","lettuce,frajita veggies,none,all");
        fixins.put("cheese", "cheese");
        fixins.put("guac","guac");
        fixins.put("queso","queso");
        fixins.put("sour_cream","sour_cream");
        String[] categories = {"meat","rice", "veggies", "cheese", "guac","queso","sour_cream"};

        for (int i=0;i<25;i++) {
            String burrito = "Burrito " + (i+1) + ":";              //String for burrito
            int numOfFixins = rand.nextInt(4) + 6;          // choose random num of ingredients
            System.out.println("Num of fixins "+numOfFixins);
            ArrayList<Integer> fixinsSet = new ArrayList<>();   //array to store random categories
            for (int j = 0; j < numOfFixins; j++)
                while (fixinsSet.size() < numOfFixins) {        //fill array with category nums until size = the random number of categories
                    int randNum = rand.nextInt(numOfFixins);    //chose random numbers to put in array
                    if (!fixinsSet.contains(randNum)) {
                        fixinsSet.add(randNum);
                    }
                }
            System.out.println("Fixins set "+fixinsSet);
            for (int k = 0; k < numOfFixins; k++){
                System.out.println("K = "+k);
                String category = categories[fixinsSet.get(k)];         // get category by matching fixinsSet number
                System.out.println("Category "+category);
                String[] ingredients = fixins.get(category).split(",");
                int randNum = rand.nextInt(ingredients.length);
                String ingredient = ingredients[randNum];
                if(ingredient.equals("none")){
                    k++;
                    continue;
                }
                else if (ingredient.equals("all")){
                    burrito = burrito + "," + ingredients[randNum] + " " +category;
                }
                else{
                    burrito = burrito + "," + ingredients[randNum];
                }
            }
            System.out.println(burrito);
        }
    }
}
