package Cognizant;

import java.util.ArrayList;

public class MaxDistanceBetweenOccurrence {
    public static void main(String[] args) {
        String str = "Hey there My name is Siddharth";
        String check = "e";
        System.out.println(str);
        System.out.println("The maximum distance between two " + check + "'s is ");
        str = str.replaceAll("\\s", "");
        int i;
        char c = check.charAt(0);
        ArrayList<Integer> list = new ArrayList<>();

        for (i = 1; i < str.length(); i++)
            if (str.charAt(i) == c) {
                list.add(i);
            }

        int distance = list.get(list.size() - 1) - list.get(0) - 1;
        System.out.println(distance);

    }
}
