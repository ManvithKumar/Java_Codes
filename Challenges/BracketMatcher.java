import java.util.*;

public class BracketMatcher {
    public static void main(String[] args) {
        String pat = "[()]";
        int flag = 0;
        Deque <Character> stack = new ArrayDeque<Character>();
        for(int i =0;i<pat.length();i++)
        {
            char c = pat.CharAt(i);
            if(c=='(' || c=='{' ||  c =='['){
                stack.push(c);
                continue;
            }
            if(stack.isEmpty())
            {
                flag = 0;
            }
        }
    }
}
