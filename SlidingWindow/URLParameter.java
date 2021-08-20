package SlidingWindow;

import java.util.*;

public class URLParameter {
    public static void main(String[] args) {
        String url = "https://www.deltax.com/career?test_param=google&param_15=india";
        String str1 = "test_param";
        String str2 = "param_1";
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(str1);
        arr.add(str2);
        printResults(url, arr);

    }

    static void printResults(String url, ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int index = 0;
            Boolean isTrue = false;
            if (url.contains(arr.get(i))) {
                index = url.indexOf(arr.get(i));
                index = index + arr.get(i).length();
                String result = "";
                if (url.charAt(index) == '=') {
                    isTrue = true;
                    while (index < url.length() - 1) {
                        index++;
                        if (url.charAt(index) != '&')
                            result += url.charAt(index) + "";
                        else
                            break;
                    }
                    System.out.println(result);
                }
            }
            if (!isTrue)
                System.out.println("-1");
        }
    }
}
