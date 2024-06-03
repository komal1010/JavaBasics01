public class Swappingnumber {
    public static void main(String[] args) {
        int a=10, b=20;
    System.out.println("before swapping values are..."+a+" "+b);
    // logic1 - third variable
    /*int t = a;
    a=b;
    b=t;*/

    //logic2 - use addition and substracion(without using third variable)
    /*a=a+b;
    b=a-b;
    a=a-b;*/

    //logic3 - use multiplication and division operation (without using 3rd variable)
    //here a & b should not be zero 

   /* a=a*b;
    b=a/b;
    a=a/b; */

    //logic4 - use bitwise XOR(^),(biwise operator convet number decimal to binary- directly can check on calculator)

  /*  a=a^b;
    b=a^b;
    a=a^b;  */

    //logic5 - in singal statement

    b=a+b- (a=b); //execution from right to left.

       System.out.println("After swapping values are..."+a+" "+b);
    }
}
