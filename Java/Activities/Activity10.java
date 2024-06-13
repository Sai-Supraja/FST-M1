package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Kiwi");
        hs.add("Mango");
        hs.add("Papaya");
        hs.add("Orange");

        System.out.println("Original HashSet: " + hs);
        System.out.println("Size of HashSet: " + hs.size());
        System.out.println("Removing Kiwi from HashSet: " + hs.remove("Kiwi"));
        if(hs.remove("Pineapple")) {
            System.out.println("Pineapple removed from the Set");
        } else {
            System.out.println("Pineapple is not present in the Set");
        }
        System.out.println("Checking if Mango is present: " + hs.contains("Mango"));
        System.out.println("Updated HashSet: " + hs);
    }
}
