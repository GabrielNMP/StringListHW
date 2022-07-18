package pro.sky.java.course2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StringList stringList = new StringListImpl();
        stringList.add("义耱 1");
        stringList.add("义耱 2");
        stringList.add("义耱 3");

        stringList.add(3, "义耱 4");

        stringList.remove(1);

        stringList.remove("义耱 3");

        System.out.println(Arrays.toString(stringList.toArray()));

        stringList.clear();

        System.out.println(stringList.size());





    }
}