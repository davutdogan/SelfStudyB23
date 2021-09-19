package day32;

import java.util.Arrays;

public class WU4 {
    public static  String[] addSomething(String []array,String str){
        String []result= Arrays.copyOf(array,array.length+1);
            result[result.length-1]=str;
            return result;

    }
}
