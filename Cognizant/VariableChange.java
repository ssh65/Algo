package Cognizant;

public class VariableChange {
    public static void main(String[] args) {
        String s1 = "this_is_c++_variable";
        String s2 = "thisIsJavaVariable";
        String o1 = convertString(s1);
        String o2 = convertString(s2);
        System.out.println(o1);
        System.out.println(o2);
    }

    static String convertString(String s) {
        String result = "";
        if (s.indexOf("_") > -1) {
            String[] arr = s.split("_");
            result = arr[0];
            for (int i = 0; i < arr.length; i++)
                result += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == Character.toUpperCase(s.charAt(i))) {
                    result = result + "_" + Character.toLowerCase(s.charAt(i));
                } else {
                    result = result + s.charAt(i);
                }
            }
        }
        return result;
    }
}