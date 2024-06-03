public class PrimeNumber {
    public static void main(String[] args) {
        int num =19;
        int count =0;    //Natural number >1 , which has only 2 factors 1 and itself
    if(num>1)
    {
        for(int i=1;i<=num;i++)
        {
            if(num%1==0)
            count++;
        }
        if (count==2)
        {
            System.out.println("Prime Number");
        }
        else 
        {
            System.out.println("Not a Prime Number");
        }
    }
    else
    {
        System.out.println("not a prime number");
    }
}
}
