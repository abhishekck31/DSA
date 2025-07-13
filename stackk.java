import java.util.*;
public class stackk {
    public static void main(String[] args){
       Stack<Integer> st = new Stack<>();
       st.add(5);
       st.add(8);
       st.add(7);
       st.add(0,1);
       System.out.println(st);
       System.out.println(st.pop());
    }
}
