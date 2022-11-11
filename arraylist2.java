import java.util.*;
public class arraylist2 {
    /*public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<String>();
        System.out.println("Before:"+s1.size());
        s1.add("Delhi");
        s1.add("KOLKATA");
        s1.add("CHENNAI");
        System.out.println("After:"+s1.size());
        Collections.reverse(s1);
        for(String s:s1)
        {
            System.out.println(s);
        }
    }*/
    public static void main(String[] args) {
        ArrayList<Integer> s1 = new ArrayList<Integer>();
        System.out.println("Before:"+s1.size());
        s1.add(20);
        s1.add(30);
        s1.add(40);
        System.out.println("After:"+s1.size());
        Collections.reverse(s1);
        for(Integer s:s1)
        {
            System.out.println(s);
        }
    }
}
