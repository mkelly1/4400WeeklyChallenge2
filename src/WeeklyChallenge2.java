import java.util.HashMap;
import java.util.Random;

public class WeeklyChallenge2 {
    public static void main(String[] args){
        Random rand = new Random();
        HashMap<String, String[]> fixins = new HashMap<>();
        String[] meatIngr = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies", "none", "all"};
        String[] riceIngr = {"brown", "white", "none", "all"};
        String[] salsaIngr = {"mild", "medium", "hot", "none", "all"};
        String[] beansIngr = {"pinto","black","none"};
        String[] veggiesIngr = {"lettuce", "frajita veggies", "none", "all"};
        String[] cheese = {""};
        String[] guac = {""};
        String[] queso = {""};
        String[] sour_cream = {""};

        fixins.put("1", meatIngr );
        fixins.put("2", riceIngr);
        fixins.put("3", beansIngr);
        fixins.put("4", salsaIngr);
        fixins.put("5", veggiesIngr);
        fixins.put("6", cheese);
        fixins.put("7",guac);
        fixins.put("8",queso);
        fixins.put("9",sour_cream);

        for (int i=0;i<25=i++){

            String burrito = "Burito "+i;
            int extras = rand.nextInt(4)+ 5;

            for(int j=0;j < extras; j++){
                //create an array of 'extras' random numbers
                int extra = rand.nextInt(9);

                burrito = burrito + ",";
            }


        }



    }
}
