import java.util.Scanner;

public class primeNumbers {
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

    public static boolean checkPrime(int n)
    {
        boolean flag=true;
        if(n==1)
            flag=false;
        for (int i=2;i<n/2;i++)
        {
            if(n%i==0)
                flag=false;
        }
        return flag;
    }
}
