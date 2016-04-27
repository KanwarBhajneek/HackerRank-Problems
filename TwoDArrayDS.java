/*
Sample Input

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output

19

Explanation

The hourglass possessing the largest sum is:

2 4 4
  2
1 2 4
*/


import java.util.*;


public class TwoDArrayDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                a[arr_i][arr_j] = in.nextInt();
            }
        }
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                int sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
