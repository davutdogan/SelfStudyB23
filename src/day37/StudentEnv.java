package day37;

public class StudentEnv {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="Zeki";
        student1.gender="Male";
        student1.age=18;
        student1.id=321;

        student1.setInfo(student1.name, student1.gender, student1.age,
                student1.id);
        student1.getInfo();
        student1.eat("grape");
        student1.sleep("1 hour");
    }
}
