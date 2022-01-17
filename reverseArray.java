import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class reverseArray {
    // Write your code here
    public static int[] reverseArray(int[] a) {
        // Write your code here
            
            int last=a.length-1,temp=0;
            for(int first=0;first<a.length/2;first++)  //1 2 3 4
            {
                if(last>=a.length/2)
                {
                    temp=a[last];
                    a[last]=a[first];
                    a[first]=temp;
                    last--;

                }
            }
            return a;
        }
        public static void main(String[] args){
           
            Scanner s = new Scanner(System.in) ;
               
                System.out.println("Enter size of array");
                 int len=s.nextInt();
                int arr[]=new int[len];
                System.out.println("Enter array");
                for(int i=0;i<len;i++)
                {
                    arr[i]=s.nextInt();
                }
                arr=reverseArray(arr);
                for(int i=0;i<len;i++)
                {
                    System.out.print(arr[i]+" ");
                }
    
}
        }
