import java.util.*;
public class balancedparaen{

public static void main(    String[] arg ){
System.out.println(isValid("[({})]"));

}
public static boolean isValid(String a)
{
    Stack<Character> stack = new Stack<>();

for(int i=0;i<a.length();i++){
char c=a.charAt(i);
    if(c=='('|| c=='[' ||c=='{'){
        stack.push(c);
      continue;
    }
    if(stack.isEmpty()){ return false;}

    char t=stack.pop();
    
       if(a.charAt(i)==']' && t!='['  ) return false;
       if(a.charAt(i)=='}' && t!='{'  ) return false;
      if(a.charAt(i)==')' && t!='('  ) return false;
}

return stack.isEmpty();
}

}