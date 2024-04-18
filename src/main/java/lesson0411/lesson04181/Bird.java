package lesson0411.lesson04181;

public class Bird extends Animal{
    String food;

    public Bird(String name, int age,String food) {
        super(name, age);
        this.food=food;
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println(getName()+" i love eat");
    }
}
