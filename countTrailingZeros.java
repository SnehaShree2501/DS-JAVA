public class countTrailingZeros{
    // public static long factorial(long number)
    // {
    //     long fact=1;
    //     for(long i=2;i<=number;i++){
    //         fact*=i;
    //     }
    //     return fact;
    // }
    // public static int countTrailingZeros(long number)
    // {
    //     int countTrail=0;
    //     long fact=factorial(number);
    //     while(fact%10==0)
    //     {
    //         countTrail++;
           
    //         fact/=10;
           
    //     }
    //     return countTrail;
    // }
    public static void main(String[] args) {
        System.out.println(countTrailingZeros(30));
        
    }

    public static int countTrailingZeros(long number){
        int count=0;
        for (int i=5;i<=number;i*=5)
            count+= number/i;
        return count;
    }
}