package day37;

import java.util.ArrayList;
import java.util.Arrays;

public class CatPark {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Naz";
        cat1.color = "Turquaz";
        cat1.gender = "Male";
        cat1.age = 1;
        cat1.breed = "Van";

        System.out.println(cat1.name);
        System.out.println(cat1.color);
        System.out.println(cat1.gender);
        System.out.println(cat1.age);
        System.out.println(cat1.breed);
        System.out.println("===============");

        Cat cat2 = new Cat();
        cat2.setInfo("Tekir", "White",
                "Female", 2, "Ankara");
        cat2.getInfo();
        System.out.println("===============");

        Cat cat3 = new Cat();
        cat3.setInfo("Ale", "Golden", "Female",
                10, "Egytp");
        cat3.getInfo();
        System.out.println("===============");
        Cat[]cats={cat1,cat2,cat3};
        ArrayList<Cat> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1,cat2,cat3));

        System.out.println("=======");

        cat1.breakThings(" waze");
        cat2.drink(" wine");

    }
}
