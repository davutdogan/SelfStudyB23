package day27;


public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String str = "aaabccddefggggh";

        for (char each : str.toCharArray()) {
            if (str.indexOf(each)==str.lastIndexOf(each)){
                System.out.println(each);
            }

        }


    }


}
