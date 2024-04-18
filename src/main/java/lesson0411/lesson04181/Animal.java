package lesson0411.lesson04181;

public class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void live(){
        System.out.println(" i am a live");
    }

    public void voice(){
        System.out.println(getName()+" i love song");
    }
}
