package collectionAPI;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(60);
        hashSet.add(50);
        System.out.println(hashSet);

        LinkedHashSet linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);

        System.out.println(linkedHashSet);

        TreeSet treeSet = new TreeSet();
        treeSet.add(90);
        treeSet.add(100);
        treeSet.add(10);
        treeSet.add(10);
        treeSet.add(40);

        System.out.println(treeSet);
    }

}
