import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int idx = 0;
        List<String> list = new ArrayList<>();
        
        while(n-- > 0){
            String p = new String(".*@gmail.com");
            String name = in.next(), email = in.next();
            
            Pattern pattern = Pattern.compile(p);
            Matcher matcher = pattern.matcher(email);
            
            if(matcher.find())
                list.add(name);
            
        }
        
        String[] finalList = new String[list.size()];
        
        for(String name : list){
            finalList[idx++] = name;
        }        
        
        Arrays.sort(finalList);
        for(String name : finalList)
            System.out.println(name);
        
        in.close();
    }
}
