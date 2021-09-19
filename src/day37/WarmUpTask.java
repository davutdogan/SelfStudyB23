package day37;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(list);

        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list);


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10));

       /* int firstUni = 0;
        for (Integer each : list3) {
            if (Collections.frequency(list3, each) == 1) {
                firstUni = each;
                break;
            }
        }
        System.out.println("firstUni = " + firstUni);*/

        ArrayList<Integer> uniques=new ArrayList<>(list3);
        uniques.removeIf(p->Collections.frequency(uniques,p)!=1);
        int firstUnique=uniques.get(0);
        System.out.println(uniques);
        System.out.println("firstUnique = " + firstUnique);


        String str = "AABBCCDDEECCCDDDDDDDE";
        String result = ""; //A2B2C2D2E2

        ArrayList<String> list2 = new ArrayList<>( Arrays.asList( str.split("") ) );

        for (String each : StringUtility.removeDup(str).split("")) { //each:  A, B, C, D, E
            int frequency = Collections.frequency(list2, each);           //  2  2  2  2  2
            result += each + frequency;
        }

        System.out.println(list2);
        System.out.println(result);


        System.out.println("---------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,2,2,3,3,3,4,4,4,5,5,6,6,7,7,8,8,9,9,10,10));

        ArrayList<Integer> original = new ArrayList<>(numbers);

        // Collections.sort(numbers); //asc
        // Collections.reverse(numbers); // desc

        // 5th maximum number:
        int n = 5;
        for (int i = 1; i < n ; i++) {
            numbers.removeIf( p -> p == Collections.max(numbers));
        }

        int fifthMaxNumber = Collections.max(numbers);

        System.out.println("fifthMaxNumber = " + fifthMaxNumber);







    }




}
