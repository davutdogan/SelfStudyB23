package day36;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);
        list.set(list.size()-1,0);
        System.out.println(list);

        System.out.println("=====================");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i)%2!=0){
                list2.set(i,list2.get(i)*2);

            }
        }
        System.out.println(list2);


        System.out.println("===========");
        String[] arr1 = {"A", "B", "C"},
                arr2 = {"D", "E", "F", "G"};

        System.out.println("===============");
        ArrayList<String>result=new ArrayList<>(Arrays.asList(arr1));
        result.addAll(Arrays.asList(arr2));
        System.out.println(result);
        ArrayList<String>  names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmad", "Merve", "Feruza", "Said", "Komiljon", "Selda", "Fhilipp"));

        names.removeIf(  p  ->  p.contains("a")  );

        System.out.println(names);


        System.out.println("------------------------------------------------------------");
    }
}
