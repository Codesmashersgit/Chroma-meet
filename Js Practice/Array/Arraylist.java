
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();

        list.add(3);
        list.add(30);
        list.add(0);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}