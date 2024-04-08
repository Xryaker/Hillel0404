package lesson0808;

public class Lesson014ifElse {
    public static void main(String[] args) {
        int age = 4;
        if (age > 5 && age <45) {
            System.out.println("MOLOD");
        } else {
            System.out.println("ne molod(((");
        }
        int i = 2, sum = 0;

        if (i == 0) {
            System.out.println("division by zero ERROR");
        } else {
            System.out.println(age / i);
        }
        //booleanExpression ? expression1 : expression2
        sum = i == 0 ? 0 : age/i;

    }
}
