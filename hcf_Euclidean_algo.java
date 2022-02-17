import java.util.Scanner;

public class hcf_Euclidean_algo {
    public static int hfcReturn(int a, int b)
    {
          // Euclidean algo

          while(a!=b)
          {
              if(a>b)
                  a=a-b;
              else
                  b=b-a;
          }
      return a;
        }
  
      //Optimised Euclidean algo using regression
      public static int Euclidean_optimised_hfcReturn(int a, int b){
        
      if (b==0)
          return a;
      else
          return hfcReturn(b,a%b);
      }
         
    

    public static void main(String[] args) {
        //basic solution

        Scanner s = new Scanner(System.in) ;        
        System.out.println("Enter 2 numbers");
         int a=s.nextInt();
         int b=s.nextInt();

        System.out.println("HCF: "+hfcReturn(a, b)+ "basic Eucledian principle");
        System.out.println("HCF: "+Euclidean_optimised_hfcReturn(a, b)+ "Regression Optimised Eucledian principle");

}
}
