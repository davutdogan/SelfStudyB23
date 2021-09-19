package day25i;

import java.util.Arrays;

public class FELP {
    public static void main(String[] args) {
        String names1[]={"Arif","Jake","Mete"},
                names2[]={"Zamma","Leyle"};
        String names3[]=new String[names1.length+names2.length];

        int j=0;

        for(String eachname:names1){
            names3[j++]=eachname;
        }
        for (String eachnames:names2  ) {
            names3[j++]=eachnames;
        }
        Arrays.sort(names3);
        System.out.println(Arrays.toString(names3));

        System.out.println("---------------------");

        int numbers[]={1,2,3,4,5,6,7,8,9};
        int countOdd=0,
                countEven=0;
        for (int number : numbers) {
            if (number%2==0){
                countEven++;
            }else {
                countOdd++;
            }

        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);
    }
}
