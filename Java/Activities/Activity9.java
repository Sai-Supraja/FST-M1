package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("James");
        myList.add("George");
        myList.add("Adam");
        myList.add(3, "Ben");
        myList.add(1, "David");
        System.out.println("Print all the names:");
        for(String s:myList){
            System.out.println(s);
        }
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Adam in list: " + myList.contains("Adam"));
        System.out.println("Size of ArrayList: " + myList.size());

        myList.remove("George");

        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
