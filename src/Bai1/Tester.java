package Bai1;

public class Tester {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Nam");
        list.add("không");
        list.add("đẹp");
        list.add("trai");

        print(list.getData());
        System.out.println(list.indexOf("không"));
        System.out.println(list.indexOf("có"));
        list.remove(1);
        list.add("rất",1);
        print(list.getData());
        MyList<String> clone = list.clone();
        System.out.println(clone.contains("Nam"));
        System.out.println(clone.contains("không"));
        System.out.println(clone.get(3));
        System.out.println(clone.size());
        clone.clear();
        System.out.println(clone.size());
        print(clone.getData());

    }

    static void print(Object[] list) {
        for (Object x : list) {
            if (!(x == null)) {
                System.out.println((String) x);
            }
        }
        System.out.println("\n");
    }
}