package day25j;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"java", "c#", "python", "something","java"};


        for (String each:words    ) {
            int count = 0;
            for (String word:words) {
                if (word.equals(each)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }


    }
}