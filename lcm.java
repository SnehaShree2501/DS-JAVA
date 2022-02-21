import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        //basic solution

        Scanner s = new Scanner(System.in) ;        
        System.out.println("Enter 2 numbers");
         int a=s.nextInt();
         int b=s.nextInt();
         System.out.println("LCM OF "+a+ " and "+b+" = "+findLCM(a, b));
    }

    public static int findLCM(int  a, int b)
    {
        int g=a>b?a:b; int s=a<b?a:b;int i;
        for (i=1;i<=s;i++)
        {
            if ((g*i)%s==0)
                break;
        }
        return (g*i);
    }
}
