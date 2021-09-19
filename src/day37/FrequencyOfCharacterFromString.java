package day37;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacterFromString {
    public static void main(String[] args) {
        String str = "AABBCCDDEEeee";
        String result = "";
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(str.split("")));

        for (String each : StringUtility.removeDup(str).split("")) {
            int frequency = Collections.frequency(list, each);

            result += each + frequency;
        }
        System.out.println(list);
        System.out.println(result);
    }
}
