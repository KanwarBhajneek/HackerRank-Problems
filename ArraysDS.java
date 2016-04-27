import java.io.*;
import java.util.*;

public class ArraysDS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int []array=new int[N];
        
        for(int i=0;i<N;i++){
            array[i]=sc.nextInt();
        }
        for(int i=N-1;i>=0;i--){
            System.out.print(array[i]+(i==0?"":" "));
        }
    }
}