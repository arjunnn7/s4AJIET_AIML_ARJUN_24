import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Scanner;
class Main {
    public static void main(String args[]) {
       LinkedList<Integer>list=new LinkedList< >();
       list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.addFirst(5);
        System.out.println(list);
        list.addLast(5);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.getFirst();
        System.out.println(list);
        list.getLast();
        System.out.println(list);
    }
}
