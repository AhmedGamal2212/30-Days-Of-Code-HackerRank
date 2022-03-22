import java.io.*;
import java.util.*;

public class Solution {

    public static boolean isPrime(int n){
        if(n == 2 || n == 3)
            return true;
            
        if(n % 2 == 0 || n == 1)
            return false;
            
        for(int i = 3; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        while(t-- > 0){
            int n = in.nextInt();
            System.out.println(isPrime(n) ? "Prime" : "Not prime");
        }
        
        in.close();
    }
}