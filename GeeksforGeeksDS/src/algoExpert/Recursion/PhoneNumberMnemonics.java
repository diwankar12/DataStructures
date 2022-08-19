package algoExpert.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberMnemonics {

    public static Map<Character, String[]> createListMapping() {

        Map<Character, String[]> mp = new HashMap<>();
        mp.put('1', new String[]{"1"});
        mp.put('0', new String[]{"0"});
        mp.put('2', new String[]{"a", "b", "c"});
        mp.put('3', new String[]{"d", "e", "f"});
        mp.put('4', new String[]{"g", "h", "i"});
        mp.put('5', new String[]{"j", "k", "l"});
        mp.put('6', new String[]{"m", "n", "o"});
        mp.put('7', new String[]{"p", "q", "r", "s"});
        mp.put('8', new String[]{"t", "u", "v"});
        mp.put('9', new String[]{"w", "x", "y", "z"});
        return mp;
    }

    public static ArrayList<String> phoneNumberMnemonics(String phoneNumber) {
        // Write your code here.
        ArrayList<String> ans = new ArrayList<>();
        Map<Character, String[]> listMapping = createListMapping();
        StringBuilder sb = new StringBuilder();
        phoneNumberMnemonicsHelper(phoneNumber, listMapping, ans, sb);

        return ans;
    }

    private static void phoneNumberMnemonicsHelper
            (String phoneNumber, Map<Character, String[]> listMapping, ArrayList<String> ans, StringBuilder sb) {


        if (sb.length() == phoneNumber.length()) {
            ans.add(sb.toString());
            return;
        }

        for (String string : listMapping.get(phoneNumber.charAt(sb.length()))) {

            sb.append(string);
            phoneNumberMnemonicsHelper(phoneNumber, listMapping, ans, sb);
            sb.deleteCharAt(sb.length() - 1);


        }


    }


}
