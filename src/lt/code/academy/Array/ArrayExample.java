package lt.code.academy.Array;

public class ArrayExample {
    public static void main(String[] args) {
        int[] mass = new int[10];
        mass[0] = 10;
        mass[1] = 15;

        System.out.println(mass.length);
        System.out.println(mass[0]);
        System.out.println(mass[1]);

        int[] secondMass = {55,4,3,5,6,7,4,3,77,5};

        System.out.println(secondMass[3]);

        int [][] matrix = new int[10][5];
        matrix[5][1]=55;

        System.out.println(matrix[5][1]);

        String[][] stringMatrix = {
                {"As", "Tu","Jie"},
                {"Mes","Jie"}
        };
        System.out.println(stringMatrix[1][1]);

        //System.arraycopy();
    }
}
