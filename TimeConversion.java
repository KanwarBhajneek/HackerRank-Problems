/*
Input Format

A single string containing a time in 1212-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01≤hh≤12.

Output Format

Convert and print the given time in 2424-hour format, where 00≤hh≤23.

Sample Input

07:05:45PM
Sample Output

19:05:45
 */
import java.util.*;


public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String s[]=time.split(":");
        int h=Integer.parseInt(s[0]);
        String str=s[2].substring(2);
        if(str.equals("AM")){
           System.out.print(String.format("%02d",h==12?00:h));
        }else if(str.equals("PM")){
          System.out.print(h==12?"12":12+h);
        }
        System.out.print(":"+s[1]);
        System.out.print(":"+s[2].substring(0,2));
    }
}
