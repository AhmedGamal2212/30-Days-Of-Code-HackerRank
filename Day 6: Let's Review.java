import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0){
            String s = in.nextLine(), even = new String(), odd = new String();
            
            for(int i = 0; i < s.length(); i++){
                if(i % 2 == 1){
                    odd += s.charAt(i);
                }else{
                    even += s.charAt(i);
                }
            }
            System.out.println(even + ' ' + odd);
        }
    }
}