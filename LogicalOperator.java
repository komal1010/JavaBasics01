import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        // logical operator = used to connect two or more operrator
        //  && = (AND) bpth conditions must true
        // || = (OR) either condition must true
        // ! = (NOT) reverse the condition

       /*  int temp = 45;

        if(temp>30){
            System.out.println("It's hot outside");
        }
        else if(temp>=20 && temp<=30) {
            System.out.println("it's warm outside");
        }
        else{
                System.out.println("it's cold outside");
                */

                Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("YOu are still playing the game *pew pew*");
		}
		else {
			System.out.println("You quit the game");
		}
            }
        }

    

