package day32;

import java.util.Arrays;

public class WU3 {

    public static String[] addElement(String []array,String str){
        String []result= Arrays.copyOf(array,array.length+1);

        result[result.length-1]=str;
        return result;
    }
}
