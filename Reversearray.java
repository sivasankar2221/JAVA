import java.io.*;
import java.util.*;

public class Reversearray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] input = new int[count];
        
        for(int i = 0; i < count; i++){
            input[i] = sc.nextInt();
        }
        for(int i = count-1; i >= 0; i--){
            System.out.print(input[i] + " "); 
        }
        
    }
}
