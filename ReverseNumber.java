import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number: ");
            int num=sc.nextInt();   // nextin method is used to take input from the user

            //method1 - using algoritham
     /*  int rev=0;
            while(num!=0)
            {
                rev=rev*10 + num%10;
                num = num/10;

            }  */

            //Method2 : using string buffer class method

      /*  StringBuffer rev;
            StringBuffer sb=new StringBuffer(String.valueOf(num)); //using stringbuffer method ,convert int to string(string.valueof)
            rev=sb.reverse();  */

            //Method 3 : using StringBuilder class

            StringBuilder sbl = new StringBuilder();
            sbl.append(num);
            StringBuilder rev=sbl.reverse();

            System.out.println("Reverse Number is: " + rev);
        }
    }
}
