package day37;

public class Student {
    public String name;
    public String gender;
    public int age;
    public int id;

    public void eat(String lunch){
        System.out.println(name+ " is eating " +lunch);
    }
    public void sleep(String sleep){
        System.out.println(name+" is sleeping for "+sleep );
    }

    public void setInfo(String studentName, String studentGender,
                        int sdudentAge,int studentId){
        name=studentName;
        gender=studentGender;
        age=sdudentAge;
        id=studentId;
    }
    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("id = " + id);
    }
}
