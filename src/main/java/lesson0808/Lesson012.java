package lesson0808;

public class Lesson012 {
    public static void main(String[] args) {
        //  | [0][0] | [0][1] | [0][2] |
        //  | [1][0] | [1][1] | [1][2] |
        int [][] matrix=new int[2][3];
        matrix[0][0]=12556;
        matrix[0][1]=2;
        System.out.println(matrix[0][0]);
        int [][] mastrix2=new int[][]{
                                        {1,2,3},
                                        {1,55,3},
                                        {1,2,5}
                                        };
        System.out.println(mastrix2[1][1]);
    }
}
