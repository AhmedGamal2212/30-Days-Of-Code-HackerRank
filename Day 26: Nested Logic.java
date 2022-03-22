import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] returnedDate = new int[3], 
        dueDate = new int[3];
        
        for(int i = 0; i < 3; i++)
            returnedDate[i] = in.nextInt();
        for(int i = 0; i < 3; i++)
            dueDate[i] = in.nextInt();
        
        int[] fine = {15, 500, 10000};
        
        for(int i = 0; i < 3; i++){
            int idx = 3 - i - 1;
            
            if(returnedDate[idx] < dueDate[idx]){
                break;
            }else if(returnedDate[idx] > dueDate[idx]){
                int toPay = 0;
                if(idx == 2){
                    toPay = fine[idx];
                }else{
                    toPay = (returnedDate[idx] - dueDate[idx]) * fine[idx];
                }
                
                System.out.println(toPay);
                in.close();
                return;
            }
        }
        System.out.println(0);
        
        in.close();
    }
}