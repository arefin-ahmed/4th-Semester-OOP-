package arefin;

import java.util.ArrayList;

public class test {
  public static void main(String[] args) {
                ArrayList<Integer> ob1 = new ArrayList<>();
                ob1.add(10);
                ob1.add(20);
                ob1.add(30);
                ob1.add(50);
                System.out.println(ob1);
                // previous value from sir

                ob1.add(3, 40);
                System.out.println(ob1);
                ob1.add(60);
                ob1.add(70);

                ob1.remove(0);
                System.out.println(ob1);

                ob1.set(60, 100);
                System.out.println(ob1);
        }
}
