/*
You have a list of strings and you want to keep only those that start with
“A” and you want to return them in lower case"
 */

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Alarm");
        names.add("Clock");
        names.add("Attack");
        names.add("Football");
        names.add("System");

        for (String s : names){
            if (s.toLowerCase().startsWith("a")){
                System.out.println(s);
            }
        }
    }
}
