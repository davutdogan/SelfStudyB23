package day37;

public class Cat {
    public String name;
    public String color;
    public String gender;
    public String breed;
    public int age;


    public  void scrach(String belly){
        System.out.println(name+" belly  " + belly);
    }
    public void breakThings(String things){
        System.out.println(name+" is breaking " + things);
    }
    public void eat(String food){
        System.out.println(name+" is eating  " + food);
    }
    public  void drink(String drink){
        System.out.println(name+ " is drinking"+ drink);
    }
    public void meow(String meow){
        System.out.println(name+" is meowing" + meow);
    }

    public void setInfo(String catName,String catColor,String catGender,
                        int catAge,String catBreed){
        name=catName;
        color=catColor;
        gender=catGender;
        age=catAge;
        breed=catBreed;

    }
    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
        System.out.println("breed = " + breed);
        System.out.println("age = " + age);

    }


}
