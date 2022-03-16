import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        HashMap<String, String> map = new HashMap<String, String>();
        
        while(n-- > 0){
            String name = in.next(), num = in.next();
            map.put(name, num);
        }
        
        while(in.hasNext()){
            String name = in.next();
            if(map.containsKey(name))
                System.out.println(name + '=' + map.get(name));
            else
                System.out.println("Not found");
        }
    }
}
