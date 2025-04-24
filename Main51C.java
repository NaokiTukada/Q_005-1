import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[]playerCount = new int[n];
        Arrays.fill(playerCount, 0);
        boolean[]outbox = new boolean[n];
        List<String>result = new ArrayList<>();

        for(int i =0; i < q; i++){
            int event = sc.nextInt();
            int playerNum  =sc.nextInt();

            if(event == 1){
                playerCount[playerNum-1]++;
            }else if(event == 2){
                playerCount[playerNum-1] += 2;
            }else if(event == 3 && !(outbox[playerNum - 1])){
                result.add("No");               
            }else if(event == 3 && outbox[playerNum - 1]){
                result.add("Yes");
            }

            if(playerCount[playerNum - 1] > 1){
                outbox[playerNum - 1] = true;
            }
        }

        for(String out:result){
            System.out.println(out);
        }
        
        sc.close();
    }
}      
