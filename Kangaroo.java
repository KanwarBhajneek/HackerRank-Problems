import java.util.*;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
            if(v2!=v1){
                System.out.println((x1-x2)%(v2-v1)==0 && (x1-x2)/(v2-v1)>0 ?"YES":"NO");
            }else{
                System.out.println((x1==x2)?"YES":"NO");
            }
        
    }
}