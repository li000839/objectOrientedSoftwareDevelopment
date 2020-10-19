import java.util.ArrayList;

public class Rectangle<T extends Number> {
    public final Pair<T, T> topLeft;
    public final Pair<T, T> bottomRight;

    public Rectangle(T top, T left, T bottom, T right) {
        this.topLeft = new Pair<>(top, left);
        this.bottomRight = new Pair<>(bottom, right);
    }

    public static String combine(ArrayList<String> list){
        String string = "";
        for(String one : list){
            string += one;
        }
        return string;
    }

    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("123");
        list.add("321");
        System.out.println(combine(list));
    }
}
