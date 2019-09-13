import java.util.*;

public class WeeklyChallenge2 {
    public static void main(String[] args){
        Random rand = new Random();
        HashMap<String, String> fixins = new HashMap<>();            // stores all burrito ingredients
        fixins.put("meat", "chicken,steak,carnidas,chorizo,sofritas,veggies,none,all"); //0
        fixins.put("rice","brown,white,none,all");                                      //1
        fixins.put("salsa", "mild,medium,hot,none,all");                                //2
        fixins.put("beans","pinto,black,none");                                         //3
        fixins.put("veggies","lettuce,frajita-veggies,none,all");                       //4
        fixins.put("cheese","cheese");                                                  //5
        fixins.put("guac","guac");                                                      //6
        fixins.put("queso","queso");                                                    //7
        fixins.put("sour_cream","sour_cream");                                          //8
        String[] categories = {"meat","rice","salsa","beans","veggies","cheese","guac","queso","sour_cream"};
        int priceAdjustment = 0;

        for (int i=0;i<25;i++) {
            String burrito = "Burrito " + (i+1) + ":";              //String for burrito
            int numOfFixins = rand.nextInt(5) + 5;          // choose random num of ingredients
            double price = 3 + (.5 * numOfFixins);
            ArrayList<Integer> fixinsSet = new ArrayList<>();   //array to store random categories
            for (int j = 0; j < numOfFixins; j++)
                while (fixinsSet.size() < numOfFixins) {        //fill array with category nums until size = the random number of categories
                    int randNum = rand.nextInt(numOfFixins);    //chose random numbers to put in array
                    if (!fixinsSet.contains(randNum)) {
                        fixinsSet.add(randNum);
                    }
                }
            for (int k = 0; k < numOfFixins; k++){                    //construct burrito
                String category = categories[fixinsSet.get(k)];         // get category by matching fixinsSet number
                String[] ingredients = fixins.get(category).split(",");
                int randNum = rand.nextInt(ingredients.length);
                String ingredient = ingredients[randNum];

                if (ingredient.equals("all")){
                    burrito = burrito + ", " + ingredients[randNum] + " " +category;
                }
                else if (ingredient.equals("none")){
                    burrito = burrito + ", " + "no " + category;
                    priceAdjustment ++;
                }
                else if (category.equals("beans") && !(ingredient.equals("all"))){
                    burrito = burrito + ", " + ingredients[randNum] + " " +category;
                }
                else if (category.equals("rice") && !(ingredient.equals("all"))) {
                    burrito = burrito + ", " + ingredients[randNum] + " " + category;
                }
                else if (category.equals("salsa") && !(ingredient.equals("all"))) {
                    burrito = burrito + ", " + ingredients[randNum] + " " + category;
                }
                else{
                    burrito = burrito + ", " + ingredients[randNum];
                }
            }
            price = price - (0.5 * priceAdjustment);
            priceAdjustment = 0;
            System.out.printf(burrito + "\t $%.2f", price);
            System.out.println("\n");
        }
    }
}
