import java.util.Scanner;

public class AllDivisors {
    public static void main(String[] args) {
        

        Scanner s = new Scanner(System.in) ;        
        System.out.println("Enter a number");
         int n=s.nextInt();
         System.out.println("All divisors of "+n+" are: ");
         printAllDivisors(n);  
         s.close();   
    }
    public static void printAllDivisors(int n)
    {
       int i;
       //this below for loop print factors from 1 to sqrt(n)
       for (i=1;i*i<n;i++)
       {
           if(n%i==0)
            System.out.println(i);
       } 
       // this loop prints factors from sqrt(n) to n. (both inclusive)
       for( ;i>=1;i--)
        System.out.println(n/i);
    }
}
