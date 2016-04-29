/*
Input 
You are given an integer NN depicting the height of the staircase.

Output 
Print a staircase of height NN that consists of # symbols and spaces. 
For example for N=6, 
here's a staircase of that height:

     #
    ##
   ###
  ####
 #####
######
 */
import java.util.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(j>=(N-1-i)?"#":" ");
            }
            System.out.println("");
        }
    }
}
