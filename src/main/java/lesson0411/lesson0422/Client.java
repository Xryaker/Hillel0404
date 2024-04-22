package lesson0411.lesson0422;

import java.util.Objects;

public abstract class Client {
    private String name, family;
    private int number, age;

    public void setName(String name) {
        if (this.name == null) {
            if (name.length() < 15) {
                this.name = name;
            } else {
                this.name = name.substring(0, 14);
            }
        }
    }

    public String getName() {
        //// some code
        sais();
        return name;

    }

    public int getNumber() {
        return number;
    }

    public Client(String name, String family, int number, int age) {
        setName(name);
        this.family = family;
        this.number = number;
        this.age = age;
    }

    public Client(String name, int number) {
        setName(name);
        this.number = number;
    }

    public  void printSomeInfo() {
        System.out.println(name + " " + family);
    }

    private void sais() {
        System.out.println("hello");
    }

    public static boolean maxLength(String str) {

        return str.length() > 15 ? true : false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public abstract void  payPal();
}
