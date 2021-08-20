package SlidingWindow;

import java.util.*;

public class MailingList {

    public static void main(String[] args) {
        HashSet<Character> bad = new HashSet<>();
        char[] specialChars = new char[] { '!', '#', '$', '%', '^', '&', '*', '(', ')', '-', '/', '~', '[', ']' };
        for (char c : specialChars) {
            bad.add(c);
        }
        String str1 = "abc@deltax.com";
        String str2 = "abc@deltax";

        check(str1, bad);
        check(str2, bad);

    }

    public static void check(String email, HashSet<Character> bad) {
        String name = email.substring(0, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1, email.length());
        // String[] split = email.split("@");
        checkAgain(name, bad);
        checkAgain(domain, bad);
    }

    public static void checkAgain(String part, HashSet<Character> bad) {
        if (bad.contains(part.charAt(0)))
            System.out.println("False");
        // System.out.println("bad start:" + part);
        if (bad.contains(part.charAt(part.length() - 1)))
            System.out.println("False");
    }

}
