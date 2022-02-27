import java.util.Scanner;

public class PrimeNumbersOptimised {
    public static void main(String[] args) {
        //basic solution

        Scanner s = new Scanner(System.in) ;        
        System.out.println("Enter a number");
         int a=s.nextInt();
        if(checkPrime(a)==true)
            System.out.println(a+" is a prime num");
        else
            System.out.println(a+" is not a prime num");
    }
    public static boolean checkPrime(long n)
    {
        boolean flag=true;
        if(n==1)
            flag=false;
        if (n==3 || n==2)
            flag=true;
        if (n%2==0 || n%3==0)
            flag=false;
        for (int i=5;i*i<n;i=i+6)
        {
            if(n%i==0  ||n%(i+2)==0)
                flag=false;
        }
        return flag;
    }
}
