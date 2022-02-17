import java.util.Scanner;
public class hcf {
    public static void main(String[] args) {
        //basic solution

        Scanner s = new Scanner(System.in) ;        
        System.out.println("Enter 2 numbers");
         int a=s.nextInt();
         int b=s.nextInt();

         //basic solution
         int hcf=Math.min(a, b);
         while (hcf>0)
         {
             if (a%hcf==0 && b%hcf==0)
                break;
            hcf--;
         }
         System.out.println("HCF: "+hcf);

      
    }

}
