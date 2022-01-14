import java.util.Scanner;

public class monkRotation {
    public static void main(String[] args){
        try (//Scanner
        Scanner s = new Scanner(System.in)) {
            System.out.println("Enter no of test cases to be entered");
            int noTest = s.nextInt(); 
                          // Reading input from STDIN
            System.out.println("Enter size of array");
             int len=s.nextInt();
             System.out.println("Enter k");
           int k=s.nextInt();
            int arr[]=new int[len];
            System.out.println("Enter array");
            for(int i=0;i<len;i++)
            {
                arr[i]=s.nextInt();
            }
            //Rotation logic
           
           // k=k<len?k:k%len;
           int temp;
           for (int j =1;j<=k;j++)
            {
                  temp= arr[len-1];
                 for(int i=len-1;i>0;i--)
                {
                   
                    //1 2 3 4 5==5 1 2 3 4
                    arr[i]=arr[i-1];
                }
                 arr[0]=temp;
        }
          
           
            for(int i=0;i<len;i++)
            {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
        } 
        catch (NumberFormatException ex){
            ex.printStackTrace();
    }
}
}
