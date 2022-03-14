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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int maxSum = -(int)1e9;
        for(int i = 0; i < arr.size() - 2; i++){
            for(int j = 0; j < arr.size() - 2; j++){
                int sum = arr.get(i + 1).get(j + 1);
                
                for(int k = 0; k < 3; k++){
                    sum += arr.get(i).get(j + k);
                    sum += arr.get(i + 2).get(j + k);
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        
        System.out.println(maxSum);
        
        bufferedReader.close();
    }
}
