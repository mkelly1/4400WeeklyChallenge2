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

        fixins.put("meat", meatIngr );
        fixins.put("rice", riceIngr);
        fixins.put("beans", beansIngr);
        fixins.put("salsa", salsaIngr);
        fixins.put("veggies", veggiesIngr);
        fixins.put("cheese", cheese);
        fixins.put("quac",guac);
        fixins.put("queso",queso);
        fixins.put("sour cream",sour_cream);

        for (i=0;i<25=i++){
            int extras = rand.nextInt(4)+ 5;
            for(j=0;j < extras; j++){

            }


        }



    }
}
