import java.util.*;
public class Three {
    public static HashMap<Character, Integer> method(String str){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }
        return map;
    }

    public static void main(String[] args){
        HashMap<Character, Integer> map = method("asdasz");
    }
}
