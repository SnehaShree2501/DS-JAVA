import java.util.Scanner;

public class primeFactors {

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
        while(n%2==0){
            System.out.println(2);
            n=n/2;
        }
        while(n%3==0){
            System.out.println(3);
            n=n/3;
        }
        for( i=5;i*i<=n;i++)
        {
            while(n%i==0){
                System.out.println(i);
                n/=i; 
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n/=(i+2); 
            }
        }
        if(n>3)
            System.out.println(n);
    }
    
}
