public class Fibonacciseries {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 34 
        int n1=0, n2=1, sum=0;
        System.out.println(n1+ "  "+n2);
        for( int i=2;i<20;i++)
        {
            sum=n1+n2;
            System.out.println(" "+sum);
            n1=n2;
            n2=sum;
        }
    }
    
}
