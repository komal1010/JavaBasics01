import java.util.Random;
public class GenrateRandomNumbersAndString {
    public static void main(String[] args) {
        //Approach 1 - random

        Random rand=new Random();

      //  int rand_int=rand.nextInt(1000);
       // System.out.println(rand_int);

        //double rand_dbl=rand.nextDouble(); // random decimal number range between 0.0 and less than 1.0
        //System.out.println(rand_dbl);

        //Approach 2 - Match class(genrate only decimal number by default)

       System.out.println(Math.random()); 

       // Approch3 - Apache Commons - lang API
    }
}
