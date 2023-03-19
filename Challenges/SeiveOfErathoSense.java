import java.util.Arrays;

public class SeiveOfErathoSense{
    public static void main(String[] args) {
        boolean isPrime[] = CheckPrime(20);
        for(int i=0;i<isPrime.length;i++)
        {
            if(isPrime[i]==true)
            {
                System.out.print(" "+i);
            }       
        }
    }
    static boolean [] CheckPrime(int n){
        
        boolean isPrime  [] = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i =2;i*i <=n;i++)
        {
            for(int j = 2*i;j<=n;j=j+i)
            {
                isPrime[j] = false;
            }
        }

        return isPrime;
    }
}