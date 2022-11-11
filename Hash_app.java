import java.util.HashMap;

public class Hash_app 
{
    public static void main(String[] args) {
        HashMap<String,Integer> h1 = new HashMap<String,Integer>();
        h1.put("Arun",10);
        h1.put("Ashok", 20);
        h1.put("Hari", 30);
        System.out.println(h1.size());
        System.out.println(h1);
        if(h1.containsKey("Arun"))
            System.out.println(h1.get("Arun"));

    }
}