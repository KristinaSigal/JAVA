import java.util.HashMap;

public class S6 {

    public static void main(String[] args) {

        MyHashSet set = new MyHashSet();

        set.add(3);
        set.add(5);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(1);
        set.add(4);

        System.out.println(set);

        System.out.println(set.getValue(3));
        System.out.println(set.getValue(0));

    }
}

class MyHashSet{

    HashMap<Integer, Object> values = new HashMap<>();
    private static final Object X = new Object();

    void add(int data){
        values.put(data, X);
    }

    public String toString(){
        return values.keySet().toString();
    }

    int getValue(int index){
        return (int) values.keySet().toArray()[index];
    }

}