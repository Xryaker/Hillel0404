package lesson0411.lesson0418;

public class Lesson011 {
    public static void main(String[] args) {
        User user1 = new User();
        user1.printInfo();
        user1.setAge(35);
        System.out.println(user1.getBirthDay());
        System.out.println("Age = "+user1.getAge());

        Student myStud=new Student("Nikolay",5080402);
        Student newStuden = new Student();
        System.out.println(myStud.getName());
        Student student2=new Student("Olga");
        System.out.println(student2.getGroupNumber());

    }
}
