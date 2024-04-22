package lesson0411.lesson04181;

public class Parrot extends Bird{
    boolean fly;

    public Parrot(String name, int age, String food) {
        super(name, age, food);
        this.fly = true;
    }

    public Parrot(String name) {
        super(name, 12, "meat");
    }

    @Override
    public void voice() {
        System.out.println("i love walk");
    }

    @Override
    public String toString() {
        return "this is "+getName()+" "+getAge();
    }
}
