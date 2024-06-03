import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter second Number: ");
        int b = sc.nextInt(); 
        System.out.println("Enter Third Number: ");
        int c = sc.nextInt();
// Approch 1
            /*if(a>b && a>c)
            {
                System.out.println("Largest Number is: "+a);
            }

        else if (b>a && b>c)
        {
            System.out.println("Largest Number is: "+b);
        }
        else
        {
            System.out.println("Largest Number is: "+c);
        } */

        // Approch 2 : ternary operator
        int largest1 = a>b?a:b;
        int largest2 = c>largest1?c:largest1;
        System.out.println(largest2+ "is a largest number");
    }
    
}
