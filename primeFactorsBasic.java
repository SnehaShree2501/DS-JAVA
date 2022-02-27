import java.util.Scanner;
public class primeFactorsBasic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;        
        System.out.println("Enter a number");
         int n=s.nextInt();
         System.out.println("Prime Factors of "+n+" are: ");
         printPrimeFactors(n);
        
        
    }
    public static void printPrimeFactors(int n)
    {
        int i;
        if (n<=1) 
            return;
        for( i=2;i*i<=n;i++)
        {
            while(n%i==0){
                System.out.println(i);
                n/=i; 
            }
        }
        if(n>1)
            System.out.println(n);
    }
    // here time complexity is more
}

    

