/*
Sample Input

3
{[()]}
{[(])}
{{[[(())]]}}

Sample Output

YES
NO
YES
*/



import java.util.*;


public class BalancedParantheses {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N =sc.nextInt();
        for(int i=0;i<N;i++){
            String in=sc.next();

            System.out.println(balancedBrace(in)?"YES":"NO");
            
        }
    
    
    }
    static boolean balancedBrace(String in){
        Stack<Character> s = new Stack<Character>();
            for(int j=0;j<in.length();j++){
                if(in.charAt(j) == '('){
                    s.push('(');
                }else if (in.charAt(j) == '{'){
                    s.push('{');
                }else if (in.charAt(j) == '['){
                    s.push('[');
                }else if (in.charAt(j) == ')') {
                    if (s.isEmpty())        return false;
                    if (s.pop() != '(') return false;
                }else if (in.charAt(j) == '}') {
                    if (s.isEmpty())        return false;
                    if (s.pop() != '{') return false;
                }else if (in.charAt(j) == ']') {
                    if (s.isEmpty())        return false;
                    if (s.pop() != '[') return false;
                }
            }
        return s.isEmpty();
    }
}
