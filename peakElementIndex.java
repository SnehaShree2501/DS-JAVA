import java.util.Scanner;

public class peakElementIndex {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter length of array");
        int len=s.nextInt();
        System.out.println("Enter array");
         int arr[]=new int[len];
            for(int i=0;i<len;i++)
            {
                arr[i]=s.nextInt();
            }
        int peak=peakElement(arr,len);
        System.out.println("Peak element index="+peak);
    }
    public static int peakElement(int[] arr,int n)
    {
       //add code here.
       int greatest=0;
       for(int i =0;i<arr.length;i++)
       {
           for(int j=i;j<arr.length;j++)
           {
                greatest=arr[i]>arr[j]?i:j;
           }
       }
       return greatest;
    }
    
}
