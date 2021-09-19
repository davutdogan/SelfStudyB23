package day25j;

public class SubstringExample {
    public static void main(String[] args) {
        String[] arr = {"Java", "C#", "Python", "Something"};
        String firstTwoLetter="";
        for (int i = 0; i <arr.length-1 ; i++) {
            firstTwoLetter =arr[i].substring(0,2);
            System.out.print(firstTwoLetter+" ");
        }


    }
}
