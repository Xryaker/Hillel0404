package lesson0808;

public class Lesson016ForLoop {
    public static void main(String[] args) {
        int[] mass = new int[]{1, 2, 5, 5, 454};
        int sum = 0;
        for (int i = 3; i < mass.length; i++) {
            sum = sum + mass[i];
        }
        System.out.println("sum = " + sum);
        for (int i = mass.length - 1; i >= 0; i--) {
            if(mass[i]%2==0){
                System.out.println(mass[i]);
            }
        }
        int i=0;
        while (i<mass.length){
            System.out.println(mass[i]);
            i++;
        }

        i=0;
        do{
            i++;
            System.out.println(mass[i]);
        }while (i<mass.length);
    }
}
