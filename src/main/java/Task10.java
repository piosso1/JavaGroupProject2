/*
How can you remove all duplicates from ArrayList?
 */

import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {

        List<String> mainList = new ArrayList<>();
        mainList.add("play");
        mainList.add("dance");
        mainList.add("walk");
        mainList.add("play");
        mainList.add("run");

        List<String> subList = removeDuplicates(mainList);

        System.out.println("Main List: "+mainList);
        System.out.println("List with no duplicate: "+subList);
    }

    private static <L> List <L> removeDuplicates(List <L> list) {
        List<L> sublist = new ArrayList<>();

        // Iterate through the original list
        for (L element : list) {
            // If the element is not already in the sublist, add it
            if (!sublist.contains(element)) {
                sublist.add(element);
            }
        }
        return sublist;
    }
}
