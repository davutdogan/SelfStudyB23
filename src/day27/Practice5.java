package day27;

public class Practice5 {
    public static void main(String[] args) {
        String str = "aaab ccddefggggh";


        for (char each : str.replace(" ","").toCharArray()) {
if (str.indexOf(each)==str.lastIndexOf(each)){
    System.out.println(each);
}
        }
    }
}
